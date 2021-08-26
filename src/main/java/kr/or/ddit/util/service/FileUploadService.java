package kr.or.ddit.util.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

	/**
	 * 업로드할 폴더와 파일을 파라미터로 받는다. 
	 * 파일을 서버에 저장하고, 파일 경로를 반환한다.  
	 * 반환된 파일 경로를 VO에 저장해 사용하면 된다. 
	 * @param uploadFolder : 파일을 저장할 폴더 절대 경로 
	 * 		  "D:\\A_TeachingMaterial\\6.JspSpring\\workspace\\dasuriProj\\src\\main\\webapp\\resources\\upload\\"
	 * @param file : 저장할 MultipartFile 형식의 파일
	 * @return filePath : 파일이 저장될 String 경로 "resources/upload/..."
	 * @throws Exception
	 */
	String upload(String uploadFolder, MultipartFile file) throws Exception;

}
