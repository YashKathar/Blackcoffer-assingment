package com.blackcoffer.service;

import java.util.List;
import java.util.Optional;

import com.blackcoffer.pojo.DataTest;
 

public interface IDataTest {
	List<DataTest> getAllData();
	Optional<DataTest> getDataById(Integer ID);
	List<DataTest> getDataByEndYear(Integer endYear);
	List<DataTest> getDataBySector(String sector);
	List<DataTest> getDataByTopics(String topics);
	List<DataTest> getDataByRegion(String region);
	List<DataTest> getDataByPestle(String pestle);
	List<DataTest> getDataBySource(String source);
	List<DataTest> getDataBySwot(String swot);
	List<DataTest> getDataByCountry(String country);
	List<DataTest> getDataByCity(String city);
	
}
