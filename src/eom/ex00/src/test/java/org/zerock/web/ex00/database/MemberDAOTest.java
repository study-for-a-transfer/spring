package org.zerock.web.ex00.database;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.MyBatisConfig;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;
import org.zerock.persistence.MemberDAOImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyBatisConfig.class, MemberDAOImpl.class})
public class MemberDAOTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberDAOTest.class);

    @Autowired
    private MemberDAO memberDAO;

    @Test
    public void testTime() {
        LOGGER.info("시간: {}", memberDAO.getTime());
    }

    @Test
    public void testInsertMember() {
        MemberVO vo = new MemberVO();
        vo.setUserid("user00");
        vo.setUserpw("user00");
        vo.setUsername("USER00");
        vo.setEmail("user00@aaa.com");

        memberDAO.insertMember(vo);
    }

    @Test
    public void testReadMember() throws Exception {
        LOGGER.info("TS 1: {}", memberDAO.readMember("user00"));
    }

    @Test
    public void testReadMemberWithPW() throws Exception {
        LOGGER.info("TS 2: {}", memberDAO.readWithPW("user00", "user00"));
    }
}
