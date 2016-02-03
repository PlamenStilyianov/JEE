/**
 * 
 */
package bp.assignment;

import bp.assignment.services.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author plamen
 *
 */

@ContextConfiguration("classpath:application-context.xml")
public class UserServiceImplTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
	private UserService serviceImpl;
	private Map<String, Integer> userBio;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		userBio = new HashMap<String, Integer>();
		userBio.put("Plamen", 45);
		userBio.put("Pano", 40);
		userBio.put("Serge", 67);
		userBio.put("Mark", 40);
		
		Set<Map.Entry<String, Integer>> set = userBio.entrySet();
		for(Map.Entry<String, Integer> user : set){
			serviceImpl.addUser(user.getKey(), user.getValue());
		}
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		serviceImpl = null;
		userBio = null;
	}

	/**
	 * Test method for {@link bp.assignment.services.UserServiceImpl#addUser(java.lang.String, int)}.
	 */
	@Test
	public void testAddUser() {
        serviceImpl.addUser("plamen",100);
        List<String> result = serviceImpl.findUsers(100);
        assertFalse(result.isEmpty());

	}

	/**
	 * Test method for {@link bp.assignment.services.UserServiceImpl#findOldestUser()}.
	 */
	@Test
	public void testFindOldestUser() {
		String expected = "Serge";  // 67 age
		String actual = serviceImpl.findOldestUser();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link bp.assignment.services.UserServiceImpl#findUsers(int)}.
	 */
	@Test
	public void testFindUsers() {
		int expected = 2; // Mark & Pano
		int actual = serviceImpl.findUsers(40).size();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link bp.assignment.services.UserServiceImpl#averageAge()}.
	 */
	@Test
	public void testAverageAge() {
		
		 int sum = 0;
		 Set<Map.Entry<String, Integer>> set = userBio.entrySet();
			for(Map.Entry<String, Integer> user : set){
				 sum += user.getValue();
			}
		 
		int expected = sum/userBio.size();
		int actual = serviceImpl.averageAge();
		assertEquals(expected, actual);
	}

}
