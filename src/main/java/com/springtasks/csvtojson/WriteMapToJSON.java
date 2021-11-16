package com.springtasks.csvtojson;

import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WriteMapToJSON {
	GsonBuilder gsonMapBuilder = new GsonBuilder();
	Gson gsonObject = gsonMapBuilder.setPrettyPrinting().create();
	
	public String readMapToJson(List<HashMap<String,String>> maps) {
		String jsonObject = gsonObject.toJson(maps);
		//System.out.println(jsonObject);
		return jsonObject;
	}
}
