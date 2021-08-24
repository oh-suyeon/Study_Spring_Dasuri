package kr.or.ddit.emp.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.emp.vo.EmpVO;

public interface EmpService {
	
	public List<Map<String, Object>> selectList(Map<String, Object> map);

	public int count(Map<String, Object> map);
	
	public int insert(EmpVO empVo);

}
