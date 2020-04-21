package org.zerock.web.ex00.database;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.JdbcConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JdbcConfig.class})
public class OracleConnectionTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OracleConnectionTest.class);

    @Autowired
    private JdbcConfig jdbcConfig;

    @Test
    public void testConnection() throws ClassNotFoundException {
        LOGGER.info("확인: {}", jdbcConfig.toString());

        Class.forName(jdbcConfig.getDriverClassName());  // ClassNotFoundException

        try (Connection connection = DriverManager.getConnection(jdbcConfig.getUrl(), jdbcConfig.getUsername(), jdbcConfig.getPassword())) {
            LOGGER.info(String.valueOf(connection));
        } catch (SQLException e) {
            LOGGER.error(String.valueOf(e));
        }
    }
}

