package kr.or.ddit.util.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.util.service.FileUploadService;

@Service
public class FileUploadServiceImpl implements FileUploadService {
	
	private static Logger logger = LoggerFactory.getLogger(FileUploadServiceImpl.class);
	
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
	public String update(String uploadFolder, MultipartFile file) throws Exception {
		
		File uploadPath  = new File(uploadFolder, getFolder());
		
		if(uploadPath.exists()==false) {
			uploadPath.mkdirs();
		}
		
		String uploadFileName = file.getOriginalFilename();
		uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\")+1);
		UUID uuid = UUID.randomUUID();
		uploadFileName = uuid.toString() + "_" + uploadFileName;
		File savedFile = new File(uploadPath, uploadFileName);
		
		try {
			file.transferTo(savedFile);
		}catch (IOException e) {
			logger.error(e.getMessage());
		}
		String filePath = "resources/upload/" + getFolder() + "/" + uploadFileName;
		filePath = filePath.replace("\\", "/");
		
		return filePath;
	}
	
	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String str = sdf.format(date);
		return str.replace("-", File.separator);
	}
}
