package com.xworkz.Xworkz.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.xworkz.Xworkz.configuration.WebInIt;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ImageController {
	public ImageController() {
		log.info("created:" + getClass().getSimpleName());
	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("chitra") MultipartFile file, RedirectAttributes attributes)
			throws IOException {
		log.info("multipartFile" + file);
		log.info(file.getOriginalFilename());
		log.info(file.getContentType());
		System.out.println(file.getSize());
		System.out.println(file.getBytes());
		byte[] bytes = file.getBytes();
		Path path = Paths.get("D:\\New folder\\" + file.getOriginalFilename());
		Files.write(path, bytes);
		attributes.addFlashAttribute("message", "you  have sucessfully uploaded" + file.getOriginalFilename() + "");
		return "uploadImage";
	}

	@GetMapping("/download")
	public void onDownload(HttpServletResponse httpServletResponse, @RequestParam String fileName) throws IOException {
		httpServletResponse.setContentType("image/jpng");
		File file = new File("D:\\New folder\\" + fileName);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = httpServletResponse.getOutputStream();
		IOUtils.copy(in, out);
		httpServletResponse.flushBuffer();

	}

}
