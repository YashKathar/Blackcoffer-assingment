package com.blackcoffer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blackcoffer.pojo.DataTest;



public interface DataSetDao extends JpaRepository<DataTest, Integer> {
	  
		List<DataTest> findByEndYear(Integer endYear);
		List<DataTest> findByTopic(String topic);
		List<DataTest> findByCity(String city);
		List<DataTest> findByCountry(String country);
		List<DataTest> findByPestle(String pestle);
		List<DataTest> findByRegion(String region);
		List<DataTest> findBySector(String sector);
		List<DataTest> findBySwot(String swot);
		List<DataTest> findBySource(String source);
		
		
}
