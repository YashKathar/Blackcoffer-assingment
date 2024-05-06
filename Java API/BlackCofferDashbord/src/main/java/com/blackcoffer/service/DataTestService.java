package com.blackcoffer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcoffer.dao.DataSetDao;
import com.blackcoffer.pojo.DataTest;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class DataTestService implements IDataTest {

	@Autowired
	private DataSetDao datasetdao;
	
	@Override
	public List<DataTest> getAllData() {
		return datasetdao.findAll();
	}

	@Override
	public Optional<DataTest> getDataById(Integer ID) {
		return datasetdao.findById(ID);
	}

	@Override
	public List<DataTest> getDataByEndYear(Integer endYear) {
		// TODO Auto-generated method stub
		List<DataTest> d =  datasetdao.findByEndYear(endYear);
		return d;
	}

	@Override
	public List<DataTest> getDataByTopics(String topics) {
		// TODO Auto-generated method stub
		return datasetdao.findByTopic(topics);
	}

	@Override
	public List<DataTest> getDataBySector(String sector) {
		// TODO Auto-generated method stub
		return datasetdao.findBySector(sector);
	}

	@Override
	public List<DataTest> getDataByRegion(String region) {
		// TODO Auto-generated method stub
		return datasetdao.findByRegion(region);
	}

	@Override
	public List<DataTest> getDataByPestle(String pestle) {
		// TODO Auto-generated method stub
		return datasetdao.findByPestle(pestle);
	}

	@Override
	public List<DataTest> getDataBySource(String source) {
		// TODO Auto-generated method stub
		return datasetdao.findBySource(source);
	}

	@Override
	public List<DataTest> getDataBySwot(String swot) {
		// TODO Auto-generated method stub
		return datasetdao.findBySwot(swot);
	}

	@Override
	public List<DataTest> getDataByCountry(String country) {
		// TODO Auto-generated method stub
		return datasetdao.findByCountry(country);
	}

	@Override
	public List<DataTest> getDataByCity(String city) {
		// TODO Auto-generated method stub
		return datasetdao.findByCity(city);
	}

	
	

}
