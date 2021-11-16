package com.springtasks.csvtojson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadCSVToMap{
	
	private CSVReader reader;
	
	public List<HashMap<String,String>> readCSVFile(File file) throws CsvValidationException, IOException {
		reader = new CSVReader(new FileReader(file));
		String[] nextLine;
		nextLine = reader.readNext();
		List<String> keys = new ArrayList<String>();
		for(String str : nextLine) {
			keys.add(str);
		}
		List<HashMap<String,String>> hashMaps = new ArrayList<HashMap<String,String>>();
		HashMap<String,String> map;
		while ((nextLine = reader.readNext()) != null) {
	         if (nextLine != null) {
	        	List<String> attributes = new ArrayList<String>();
	     		for(String str : nextLine) {
	    			attributes.add(str);
	    		}
	     		map = new HashMap<String, String>();
	        		 for(int j=0; j<keys.size(); j++) {
	        			 map.put(keys.get(j), attributes.get(j)); 
	        		 }
	        		 
	        		 hashMaps.add(map);
	        }
	    }
		//System.out.println(hashMaps);
		return hashMaps;
	}
	

}
