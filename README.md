autoconfig-test
===============

Spring Boot auto-configuration test code.

The goal is to have the Spring Boot auto-configured `DataSource`, `ConnectionFactory`, and `EntityManagerFactory` beans injected properly into the XML configuration file.

To run:

    ./gradlew bootRun
    
To verify, ensure the log entries for `FooService` and `BarService` are present:

    2014-08-26 11:01:28.723  INFO 965 --- [           main] app.service.FooService                   : dataSource not null
    2014-08-26 11:01:28.723  INFO 965 --- [           main] app.service.FooService                   : connectionFactory not null
    2014-08-26 11:01:28.723  INFO 965 --- [           main] app.service.FooService                   : entityManagerFactory is not null
    ...
