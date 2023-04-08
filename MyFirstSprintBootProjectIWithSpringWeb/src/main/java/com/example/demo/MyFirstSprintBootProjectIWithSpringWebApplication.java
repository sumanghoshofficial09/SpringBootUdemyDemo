package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * 
 * @author ciphe
 * 
 * one you start spring web application , it keeps on running on tomcat default port 8080
 * 
 * 2023-04-08T20:13:28.335+05:30  INFO 16760 --- [           main] rintBootProjectIWithSpringWebApplication : Starting MyFirstSprintBootProjectIWithSpringWebApplication using Java 17.0.1 with PID 16760 (C:\Users\ciphe\SpringBootUdemy\MyFirstSprintBootProjectIWithSpringWeb\target\classes started by ciphe in C:\Users\ciphe\SpringBootUdemy\MyFirstSprintBootProjectIWithSpringWeb)
2023-04-08T20:13:28.339+05:30  INFO 16760 --- [           main] rintBootProjectIWithSpringWebApplication : No active profile set, falling back to 1 default profile: "default"
2023-04-08T20:13:29.341+05:30  INFO 16760 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-04-08T20:13:29.342+05:30  INFO 16760 --- [           main] o.a.catalina.core.AprLifecycleListener   : An older version [1.2.35] of the Apache Tomcat Native library is installed, while Tomcat recommends a minimum version of [2.0.1]
2023-04-08T20:13:29.342+05:30  INFO 16760 --- [           main] o.a.catalina.core.AprLifecycleListener   : Loaded Apache Tomcat Native library [1.2.35] using APR version [1.7.0].
2023-04-08T20:13:29.358+05:30  INFO 16760 --- [           main] o.a.catalina.core.AprLifecycleListener   : OpenSSL successfully initialized [OpenSSL 1.1.1q  5 Jul 2022]
2023-04-08T20:13:29.369+05:30  INFO 16760 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-08T20:13:29.369+05:30  INFO 16760 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.7]
2023-04-08T20:13:29.477+05:30  INFO 16760 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-04-08T20:13:29.481+05:30  INFO 16760 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1074 ms
2023-04-08T20:13:29.857+05:30  INFO 16760 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-04-08T20:13:29.869+05:30  INFO 16760 --- [           main] rintBootProjectIWithSpringWebApplication : Started MyFirstSprintBootProjectIWithSpringWebApplication in 1.918 seconds (process running for 2.347)

 *
 */
@SpringBootApplication
public class MyFirstSprintBootProjectIWithSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSprintBootProjectIWithSpringWebApplication.class, args);
	}

}
