Set projectpath=C:/Users/Edmundo Dela Cruz/git/fleetweb_automation
cd %projectpath%
set classpath=%projectpath%/target/classes;%projectpath%/lib/*
java org.testng.TestNG For_Demo_Testing.xml