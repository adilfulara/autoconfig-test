package app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import javax.annotation.PostConstruct;
import javax.jms.ConnectionFactory;
import javax.sql.DataSource;

public class BarService {

    final private Logger logger = LoggerFactory.getLogger(FooService.class);

    private DataSource dataSource;

    private ConnectionFactory connectionFactory;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @PostConstruct
    public void init() {
        Assert.notNull(dataSource, "dataSource is null!");
        logger.info("dataSource not null");

        Assert.notNull(connectionFactory, "connectionFactory is null!");
        logger.info("connectionFactory not null");
    }
}
