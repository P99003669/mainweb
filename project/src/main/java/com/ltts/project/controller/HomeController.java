package com.ltts.project.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ltts.project.dao.DataDao;
import com.ltts.project.model.Data;



@Controller
public class HomeController {
	
	
	@Autowired
	DataDao datadao;
	
	Data data;
	
	int i=0;
	int j=0;
	int k=0;
	@RequestMapping("")
	public String wel()
	{
		return "Home";
	}
	
	@RequestMapping("/Heart_Rate")
	public String heart()
	{
		return "index";
	}
	
	@RequestMapping("/home")
	public String hom()
	{
		return "Home";
	}
	
	@RequestMapping("/Home")
	public String ho()
	{
		return "Home";
	}
	
	@RequestMapping("/Blood_Pressure")
	public String blood()
	{
		return "blood";
	}
	
	
	
	@RequestMapping("/About")
	public String about()
	{
		return "About";
	}
	
	@RequestMapping("/Contact")
	public String cont()
	{
		return "Contact";
	}
	
	@RequestMapping("/Oxygen_Level")
	public String cont1()
	{
		return "oxy";
	}
	
	@RequestMapping("/linechartdata")
	@ResponseBody
	public String getDataFromDb()
	{
		List<Data> dataList2 = datadao.findAll();
	
		JsonArray jsontimestamp = new JsonArray();
		JsonArray jsonheart_rate = new JsonArray();
		
		JsonObject json = new JsonObject();
		
		
		dataList2.forEach(data->{
			if(data.getHeart_rate()!=0 &&i<10)
			{
			jsontimestamp.add(data.getTimestamp());
			jsonheart_rate.add(data.getHeart_rate());
			i++;
			}});

		json.add("timestamp",jsontimestamp);
		json.add("heart_rate", jsonheart_rate);
		
		
		return json.toString();
	}
	
	
	@RequestMapping("/oxycharts")
	@ResponseBody
	public String getDataFromdb()
	{
		List<Data> dataList = datadao.findAll();
	
		JsonArray jsontimestamp = new JsonArray();
		JsonArray jsonoxygen_level = new JsonArray();
		
		JsonObject json = new JsonObject();
		
		
		dataList.forEach(data->{
			if(data.getOxygen_level()!=0 &&j<10)
			{
			jsontimestamp.add(data.getTimestamp());
			jsonoxygen_level.add(data.getOxygen_level());
			j++;
			}});

		json.add("timestamp",jsontimestamp);
		json.add("oxygen_level", jsonoxygen_level);
		
		
		return json.toString();
	}
	
	
	@RequestMapping("/bloodcharts")
	@ResponseBody
	public String getDataFromdb2()
	{
		List<Data> dataList = datadao.findAll();
	
		JsonArray jsontimestamp = new JsonArray();
		JsonArray jsonblood_pressure = new JsonArray();
		
		JsonObject json = new JsonObject();
		
		
		dataList.forEach(data->{
			if(data.getBlood_pressure()!=0 &&k<10)
			{
			jsontimestamp.add(data.getTimestamp());
			jsonblood_pressure.add(data.getBlood_pressure());
			k++;
			}});

		json.add("timestamp",jsontimestamp);
		json.add("blood_pressure", jsonblood_pressure);
		
		
		return json.toString();
	}
	

       

}
