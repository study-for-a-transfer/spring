package org.zerock.web.ex00.database;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.DataSourceConfig;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataSourceConfig.class)
public class DataSourceTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceTest.class);

    @Autowired
    private DataSource ds;  // DataSource & DriverManagerDataSource

    @Test
    public void testConnection() throws Exception {
        try (Connection con = ds.getConnection()) {
            LOGGER.info(String.valueOf(con));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
