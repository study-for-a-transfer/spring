package org.zerock.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAOImpl implements MemberDAO {
    private static final String NAMESPACE = "org.zerock.mapper.MemberMapper";

    @Autowired
    private SqlSession sqlSession;

    @Override
    public String getTime() {
        return sqlSession.selectOne(NAMESPACE + ".getTime");
    }

    @Override
    public void insertMember(MemberVO vo) {
        sqlSession.insert(NAMESPACE + ".insertMember", vo);
    }

    @Override
    public MemberVO readMember(String userid) throws Exception {
        return (MemberVO) sqlSession.selectOne(NAMESPACE + ".selectMember", userid);
    }

    @Override
    public MemberVO readWithPW(String userid, String userpw) throws Exception {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("userid", userid);
        paramMap.put("userpw", userpw);

        return sqlSession.selectOne(NAMESPACE + ".readWithPW", paramMap);
    }
}
