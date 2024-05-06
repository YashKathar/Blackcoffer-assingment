package com.blackcoffer.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="data_test")
public class DataTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer Id;
	
	private Integer endYear;
	private String city_lng;
	private String city_lat;
	private Integer intensity;
	@Column(length=255)
	private String sector;
	@Column(length=255)
	private String topic;
	private String insight;
	@Column(length=255)
	private String swot;
	private String url;
	@Column(length=255)
	private String region;
	@Column(name="start_year")
	private String startYear;
	private String impact;
	@Column(length=255)
	private String added;
	@Column(length=255)
	private String published;
	@Column(length=255)
	private String city;
	@Column(length=255)
	private String country;
	private Integer relevance;
	@Column(length=255)
	private String pestle;
	@Column(length=255)
	private String source;
	private String title;
	private Integer likelihood;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getEndYear() {
		return endYear;
	}
	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}
	public String getCity_lng() {
		return city_lng;
	}
	public void setCity_lng(String city_lng) {
		this.city_lng = city_lng;
	}
	public String getCity_lat() {
		return city_lat;
	}
	public void setCity_lat(String city_lat) {
		this.city_lat = city_lat;
	}
	public Integer getIntensity() {
		return intensity;
	}
	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getInsight() {
		return insight;
	}
	public void setInsight(String insight) {
		this.insight = insight;
	}
	public String getSwot() {
		return swot;
	}
	public void setSwot(String swot) {
		this.swot = swot;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getImpact() {
		return impact;
	}
	public void setImpact(String impact) {
		this.impact = impact;
	}
	public String getAdded() {
		return added;
	}
	public void setAdded(String added) {
		this.added = added;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getRelevance() {
		return relevance;
	}
	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}
	public String getPestle() {
		return pestle;
	}
	public void setPestle(String pestle) {
		this.pestle = pestle;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getLikelihood() {
		return likelihood;
	}
	public void setLikelihood(Integer likelihood) {
		this.likelihood = likelihood;
	}
	
}
