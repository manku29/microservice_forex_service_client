package com.in28minutes.springboot.microservice.example.currencyconversion;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.logging.log4j.util.Strings;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

public class TestJson {

	public static void main(String[] arg) {
		String fileName = "C:\\Users\\RAMAVI\\Desktop\\json\\SavedImportFormat.json";
		System.out.println("Reading file ");
		try(Scanner scanner = new Scanner(new File(fileName))){
			System.out.println("checking scanner .....");
			System.out.println("scanner " + scanner.hasNext());
			String jsonString = Strings.EMPTY;
			while(scanner.hasNext()) {
				
				 jsonString = scanner.nextLine();
				System.out.println(">> input string >> "+ jsonString);
			}
			 Gson gson = new Gson();
			 Map<String,Object> map = gson.fromJson(jsonString, new TypeToken<Map<String,Object>>() {}.getType());
			System.out.println("Map " + map);
			Map<String,Object> data = (Map)map.get("Template");
			System.out.println("Mappings 1 "+data.get("Mappings"));
			
			List<Mappings> mappingList = (List<Mappings>)data.get("Mappings");
			System.out.println("mappings2" +mappingList);
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
