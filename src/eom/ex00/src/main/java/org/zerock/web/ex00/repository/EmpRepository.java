package org.zerock.web.ex00.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpRepository {
    private static final String MAPPER_NAME_SPACE = "mapper.empMapper.";

    // Autowired: Deprecated
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    // Generic
    public List getEmpInfoAll() {
        return sqlSessionTemplate.selectList(MAPPER_NAME_SPACE + "selectEmpInfoAll");
    }
}
