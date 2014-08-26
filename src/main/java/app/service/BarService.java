package app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import javax.annotation.PostConstruct;
import javax.jms.ConnectionFactory;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

public class BarService {

    final private Logger logger = LoggerFactory.getLogger(BarService.class);

    private DataSource dataSource;

    private ConnectionFactory connectionFactory;

    private EntityManagerFactory entityManagerFactory;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void setEntityManagerFactory(final EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

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
