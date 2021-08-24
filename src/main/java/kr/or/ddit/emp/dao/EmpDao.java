package kr.or.ddit.emp.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.ddit.emp.vo.EmpVO;

@Repository
public class EmpDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<Map<String, Object>> selectList(Map<String, Object> map){
		return this.sqlSessionTemplate.selectList("emp.selectList", map);
	}
	
	public int count(Map<String, Object> map) {
		return this.sqlSessionTemplate.selectOne("emp.count", map);
	}
	
	public int insert(EmpVO empVo) {
		int affectedRowCnt = this.sqlSessionTemplate.insert("emp.insert", empVo);
		if(affectedRowCnt > 0) {
			return empVo.getEmpNum();
		}
		return 0;
	}
	
	
}
