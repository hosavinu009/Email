package com.Email.Service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Email.Entity.ExcelEn;
import com.Email.Repository.ExcelRepository;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExcelEnService {
	
	@Autowired
	private ExcelRepository excelRepo;

	public void generateExcel(HttpServletResponse response) throws IOException {
		
		List<ExcelEn> excels = excelRepo.findAll();
		 	
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Excels Info");
		HSSFRow row = sheet.createRow(0);
		
		row.createCell(0).setCellValue("Userid");
		row.createCell(1).setCellValue("Location");
		row.createCell(2).setCellValue("Ticket");
		
		int dataRowIndex = 1;
		
		
		for(ExcelEn  exc : excels) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(exc.getLocation());
			dataRow.createCell(0).setCellValue(exc.getTicket());
			dataRow.createCell(0).setCellValue(exc.getUserID());
			dataRowIndex++;
		}
		ServletOutputStream mtr = response.getOutputStream();
		workbook.write(mtr);
		workbook.close();
		mtr.close();
		
	}}

