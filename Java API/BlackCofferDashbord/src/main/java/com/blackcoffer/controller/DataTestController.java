package com.blackcoffer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackcoffer.pojo.DataTest;

import com.blackcoffer.service.IDataTest;

@RestController
@RequestMapping("/api/data/")
public class DataTestController {
	
	@Autowired
	private IDataTest datatest;
	
	@GetMapping("getalldata")
	public List<DataTest> getAllData(){
		return datatest.getAllData();
	}
	
	@GetMapping("getdatabyid/{id}")
	public Optional<DataTest> getDataById(@PathVariable ("id") Integer ID) {
		return datatest.getDataById(ID);
	}
	
	@GetMapping("getdatabyend_year/{end_year}")
	public List<DataTest> getDataByEndYear(@PathVariable ("end_year") Integer endYear) {
		return datatest.getDataByEndYear(endYear);
	}
	
	@GetMapping("getdatabytopic/{topic}")
	public List<DataTest> getDataByTopic(@PathVariable ("topic") String topic) {
		return datatest.getDataByTopics(topic);
	}
	
	@GetMapping("getdatabycity/{city}")
	public List<DataTest> getDataByCity(@PathVariable ("city") String city) {
		return datatest.getDataByCity(city);
	}
	
	@GetMapping("getdatabycountry/{country}")
	public List<DataTest> getDataByCountry(@PathVariable ("country") String country) {
		return datatest.getDataByCountry(country);
	}
	
	@GetMapping("getdatabyregion/{region}")
	public List<DataTest> getDataByRegion(@PathVariable ("region") String region) {
		return datatest.getDataByRegion(region);
	}
	
	@GetMapping("getdatabysector/{sector}")
	public List<DataTest> getDataBySector(@PathVariable ("sector") String sector) {
		return datatest.getDataBySector(sector);
	}
	
	@GetMapping("getdatabysource/{source}")
	public List<DataTest> getDataBySource(@PathVariable ("source") String source) {
		return datatest.getDataBySource(source);
	}
	
	@GetMapping("getdatabyswot/{swot}")
	public List<DataTest> getDataBySwot(@PathVariable ("swot") String swot) {
		return datatest.getDataBySwot(swot);
	}
	
	@GetMapping("getdatabypestle/{pestle}")
	public List<DataTest> getDataByPestle(@PathVariable ("pestle") String pestle) {
		return datatest.getDataByPestle(pestle);
	}
	
	
}