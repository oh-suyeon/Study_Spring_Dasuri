package kr.or.ddit.emp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.emp.mapper.EmpMapper;
import kr.or.ddit.emp.service.EmpService;
import kr.or.ddit.emp.vo.EmpVO;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpMapper empMapper;

	@Override
	public List<Map<String, Object>> selectList(Map<String, Object> map) {
		return this.empMapper.selectList(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return this.empMapper.count(map);
	}
	
	@Override
	public int insert(EmpVO empVo) {
		int row = this.empMapper.insert(empVo);
		if(row > 0) {
			return empVo.getEmpNum();
		}
		return 0;
	}
	
}
