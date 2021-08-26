package kr.or.ddit.emp.mapper;

import java.util.List;
import java.util.Map;

import kr.or.ddit.emp.vo.EmpVO;

public interface EmpMapper {
	
	List<Map<String, Object>> selectList(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int insert(EmpVO empVo);
	
}
