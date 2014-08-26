package app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import javax.jms.ConnectionFactory;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Service
public class FooService {

    final private Logger logger = LoggerFactory.getLogger(FooService.class);

    @Autowired
    private DataSource dataSource;

    @Autowired
    private ConnectionFactory connectionFactory;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @PostConstruct
    public void init() {
        Assert.notNull(dataSource, "dataSource is null!");
        logger.info("dataSource not null");

        Assert.notNull(connectionFactory, "connectionFactory is null!");
        logger.info("connectionFactory not null");

        Assert.notNull(entityManagerFactory, "entityManagerFactory is null!");
        logger.info("entityManagerFactory is not null");
    }
}
