package kr.or.ddit.emp.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.emp.service.EmpService;
import kr.or.ddit.emp.vo.EmpVO;
import kr.or.ddit.util.vo.Pagination;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	private static Logger logger = LoggerFactory.getLogger(EmpController.class);

	@Autowired
	EmpService empService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectList(@RequestParam Map<String, Object> map 
						   , @RequestParam(defaultValue = "1") String currentPage, Model model) {
		
		// 페이징 정보 전달
		int total = empService.count(map);
		Pagination paging = new Pagination(total, Integer.parseInt(currentPage), 10);
		model.addAttribute("paging", paging);
		model.addAttribute("pagingInfo", paging.getPagingInfo());
		
		// 데이터 전달
		map.put("currentPage", currentPage);
		model.addAttribute("empList", empService.selectList(map));
		logger.info(">> empList : " + empService.selectList(map));
		
		// 검색 데이터 다시 전달
		if(map.containsKey("keyword")) {
			model.addAttribute("keyword", map.get("keyword"));
			model.addAttribute("category", map.get("category"));
		}
		
		return "emp/list";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return "emp/insert";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertPost(@ModelAttribute EmpVO empVo, Model model) {
		int empNum = this.empService.insert(empVo);
		if(empNum > 0) {
//			return "redirect:/emp/detail/" + empNum;
			return "redirect:/emp/list";
		}
//		return "redirect:/emp/insert";
		return "redirect:/emp/list";
	}
	
}
