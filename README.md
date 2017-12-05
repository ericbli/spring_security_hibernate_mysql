# spring_security_hibernate_mysql



Spring MVC application secured using Spring Security, integrating with MySQL database using Hibernate, handling Many-to-Many relationship on view, storing passwords in encrypted format using BCrypt, and providing RememberMe functionality using custom PersistentTokenRepository implementation with Hibernate HibernateTokenRepositoryImpl, retrieving the records from database and updating or deleting them within transaction

1.
Please put following in pom.xml to embed tomcat
-----------------------------------------------------------
        <plugin>
	<groupId>org.apache.tomcat.maven</groupId>
	<artifactId>tomcat7-maven-plugin</artifactId>
	<version>2.2</version>
	<configuration>
	<port>8080</port>
	<path>/</path>
	</configuration>
        </plugin>
        
----------------------------------------------------------

2. open mysql run script db.sql to setup database
        
3. mvn clean install

4. mvn tomcat7:run-war-only 

5. open http://localhost:8080

6. login with ericbli  password abc125 and can Add New User and define role of the new user


 simple to integrate Spring Security with Spring MVC.



***REFwebsystique
