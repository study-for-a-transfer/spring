package org.zerock.web.ex00.database;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OracleConnectionTest.class);

    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
    private static final String USER = "gurubee";
    private static final String PASSWORD = "hong";

    @Test
    public void testConnection() throws ClassNotFoundException {
        Class.forName(DRIVER);  // ClassNotFoundException

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            LOGGER.info(String.valueOf(connection));
        } catch (SQLException e) {
            LOGGER.error(String.valueOf(e));
        }
    }
}
