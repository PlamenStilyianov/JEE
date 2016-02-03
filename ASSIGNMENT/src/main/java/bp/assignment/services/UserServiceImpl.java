package bp.assignment.services;

import bp.assignment.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebMethod;
import javax.jws.WebService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.LinkedList;
import java.util.List;

// START SNIPPET: service

/**
 * @author plamen
 */
@WebService(endpointInterface = "bp.assignment.services.UserService", serviceName = "UserService")
@Repository
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @PersistenceContext
    private EntityManager entityManager;
       

    /* (non-Javadoc)
	 * @see bp.assignment.services.UserService#addUser(java.lang.String, int)
	 */
    @Transactional
    @Override
    @WebMethod
	public void addUser(String name, int age) {
       	User user = new User();
        user.setName(name);
        user.setAge(age);

		if(user.getId() == null){
			entityManager.persist(user);
		} else {
			entityManager.merge(user);
		}
        entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see bp.assignment.services.UserService#findOldestUser()
	 */
    @Override
    @WebMethod
	public String findOldestUser() {

		List<User> list = entityManager.createQuery("select u from User u where u.age = (select max(age) from User)", User.class).getResultList();
		
		return list.get(0).getName();
	}

	/* (non-Javadoc)
	 * @see bp.assignment.services.UserService#findUsers(int)
	 */
    @Override
    @WebMethod
	public List<String> findUsers(int age) {

		TypedQuery<User> query = entityManager.createQuery("select u from User u where u.age = ?1 order by u.name", User.class);
		query.setParameter(1, age);
		
		List<User> list = query.getResultList();
		List<String> users = new LinkedList<>();

        for (User aList : list) {
            users.add(aList.getName());
        }
		
		return users;
	}

	/* (non-Javadoc)
	 * @see bp.assignment.services.UserService#averageAge()
	 */
    @Override
    @WebMethod
	public int averageAge() {

        int sum = 0;
		List<User> list = entityManager.createQuery("select u from User u", User.class).getResultList();

        for (User u : list){
            sum += u.getAge();
        }

		return sum/list.size();
	}
}

// END SNIPPET: service