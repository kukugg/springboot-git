package com.main.boot.controller.fileUpload;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>Description:单文件上传</p> 
 * @author hjp  
 * @date 2017-9-21 上午10:00:52
 */

@Controller
public class FileUploadController {
	
	//访问路径为：http://127.0.0.1:8080/file
	@RequestMapping("/file")
	public String file() {
		return "/file";
	}
	
	/**
	 * 
	 * @Title: handleFileUpload   
	 * @Description: 文件上传具体实现方法
	 * @param @param file
	 * @param @return    
	 * @return String      
	 * @throws
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public String handleFileUpload(@RequestParam("file") MultipartFile file) {
		
		if(!file.isEmpty()){
			try {
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
				out.write(file.getBytes());
				out.flush();
				out.close();
			} catch (Exception e){
				 return "上传失败,"+e.getMessage();
			} 
		} else{
            return "上传失败，因为文件是空的";
     }
		return "上传成功";
	}
	

}
