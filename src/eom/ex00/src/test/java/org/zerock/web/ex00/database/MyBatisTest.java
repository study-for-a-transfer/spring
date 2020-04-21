package org.zerock.web.ex00.database;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.MyBatisConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyBatisConfig.class})
public class MyBatisTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisTest.class);

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testFactory() {
        LOGGER.info("MyBatis 1: {}", String.valueOf(sqlSessionFactory));
    }

    @Test
    public void testSession() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            LOGGER.info("MyBatis 2: {}", String.valueOf(sqlSession));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
