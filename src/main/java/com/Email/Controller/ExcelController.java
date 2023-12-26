package com.Email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Email.Service.ExcelEnService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ExcelController {

	
	@Autowired
	private ExcelEnService excelService;
	
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception {
		
		
		
		response.setContentType("application/octet-stream");
		
		String headerKey= "ContentDisposition";
		String headerValue= "attachment;filename=course.xls";
				
				response.setHeader(headerKey, headerValue);
		excelService.generateExcel(response);
	}
}
