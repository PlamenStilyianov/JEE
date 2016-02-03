Sample code bundle of Chapter 7
================================
This is the web service sample code used for the examples in chapter 7. Please make sure to follow the instructions given below when you use the sample.


NOTE: The directory containing this README file will be the root and it will be
 treated as SAMPLE_PROJECT_HOME directory and let it be SAMPLE_PROJECT_HOME.

Building the web services sample with Password callback handler class and WS-Security policies
========================================================================================================
1. We can build sample web services by running the ant script given under SAMPLE_PROJECT_HOME/build/ directory.
In order to build the sample, first we need to export AXIS2_HOME environment variable because we use some libraries inside AXIS2 in code compilation.

2. If you are on a flavour of Linux operating systems;

- Open a shell and export AXIS2_HOME environment variable
export AXIS2_HOME=/home/user/soapui-sample-project/axis2-1.6.1

3. If you are on Windows;

- Open a command window and set AXIS2_HOME environment variable
set AXIS2_HOME=C:\soapui-sample-project\axis2-1.6.1

4. Now, in the same shell (or command prompt in windows), go to SAMPLE_PROJECT_HOME/build/ and type 'ant'

5. This will build the sample service and you can find HotelReservation.aar at SAMPLE_PROJECT_HOME
 
 
