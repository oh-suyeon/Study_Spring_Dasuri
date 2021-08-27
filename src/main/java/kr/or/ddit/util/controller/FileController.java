package kr.or.ddit.util.controller;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileController {

	private static Logger logger = LoggerFactory.getLogger(FileController.class);
	
	/**
	 * 경로를 던져주면 download 폴더에 파일을 다운로드할 수 있다.
	 * /download?file=${vo.attachPath}
	 * @param file : 로컬의 이미지 경로
	 * @return 파일 객체를 담은 header
	 */
	@ResponseBody
	@RequestMapping(value = "/download", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE) 
	public ResponseEntity<Resource> downloadFile(String file) {
		logger.info("download file : " + file);
		
		String path = "D:\\A_TeachingMaterial\\6.JspSpring\\workspace\\dasuriProj\\src\\main\\webapp";
		Resource resource = new FileSystemResource(path + file);  
		
		logger.info("resource : " + resource); // 여기까지 MIME 타입 처리
		
		// 헤더 메시지 시작
		String resourceName = resource.getFilename();
		logger.info("resourceName : " + resourceName);
		
		HttpHeaders headers = new HttpHeaders();
		
		try { 
			headers.add("Content-Disposition", "attachment;filename=" 
						+ new String(resourceName.getBytes("UTF-8"), "ISO-8859-1"));
			logger.info("headers : " + headers);
		}catch (UnsupportedEncodingException e) {
			logger.warn(e.getMessage());
		}
		
		return new ResponseEntity<Resource>(resource, headers, HttpStatus.OK);
	}
	
	
}
