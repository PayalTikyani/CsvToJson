package com.springtasks.csvtojson;

import java.io.File;
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
    	
    	new ReadCSVToMap().readCSVFile(file);
    }
}
