package com.springtasks.csvtojson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.exceptions.CsvValidationException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] arg) throws CsvValidationException, IOException {
    	File file = new File("E:/eprogs/csvtojson/CsvFile/data.csv");
    	
    	ReadCSVToMap csvToMap = new ReadCSVToMap();
    	
    	WriteMapToJSON mapToJson = new WriteMapToJSON();
    	
    	String result = mapToJson.readMapToJson(csvToMap.readCSVFile(file));
    	
        FileWriter fw=new FileWriter("E:/eprogs/csvtojson/CsvFile/json.txt");    
        fw.append(result);
        fw.close();
    	
    	   
    	
    	//new ReadMapToJSON().readMapToJson(new ReadCSVToMap().readCSVFile(file));
    }
}
