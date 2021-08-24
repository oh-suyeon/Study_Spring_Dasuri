package kr.or.ddit.emp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.emp.dao.EmpDao;
import kr.or.ddit.emp.service.EmpService;
import kr.or.ddit.emp.vo.EmpVO;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao empDao;

	@Override
	public List<Map<String, Object>> selectList(Map<String, Object> map) {
		return this.empDao.selectList(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return this.empDao.count(map);
	}
	
	@Override
	public int insert(EmpVO empVo) {
		return this.empDao.insert(empVo);
	}
	
}
