package com.actitime2.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilites 
{
	  String filepath;

	public ExcelUtilites(String filepath)
    {
	this.filepath=filepath;
	}
	
      public String readData(String sheetName,int row,int cell)
      {
	   String value=null;
	   try
	   {
		   FileInputStream fis =new FileInputStream(new File(filepath));
		      Workbook wb = WorkbookFactory.create(fis);
			  Cell cl = wb.getSheet(sheetName).getRow(row).getCell(cell);

		      
		      switch  (cl.getCellType())
		      {
		      case STRING:
		    	  value=cl.getStringCellValue();
		    	  break;
		      case NUMERIC:
		    	  if(DateUtil.isCellDateFormatted(cl))
		    	  {
		    		  SimpleDateFormat sdf=new SimpleDateFormat("MM,dd,yyyy");
		    		  value=sdf.format(cl.getDateCellValue());
		           }
		    	  
		    	  
		    	  else
		    	  {
		    		  long num=(long)cl.getNumericCellValue();
		    	      value=Long.toString(num);
		    	    }
		    	  break;
		      
		      case BOOLEAN:
		    	  value=Boolean.toString(cl.getBooleanCellValue());
		    	  break;
		    	  default:
		    		  break;
		      }
	   }
		      catch(EncryptedDocumentException e)
	    		 {
	    		 
	             }
	    		 catch(IOException e)
	    		 {
	    			 
	    		 }
	    		 return value;
	   }
      }
