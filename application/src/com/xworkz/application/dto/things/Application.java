package com.xworkz.application.dto.things;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class Application implements Serializable {

	private String name;
	private double version;
	private LocalDate createdDate;
	private double size;
	private String developedBy;
	private Type type;
	private double price;
	private LocalDate firstVersionReleaseDate;
	private LocalDate currentVersionReleaseDate;
	private LocalDate nextVersionReleaseDate;
	private int trialDays;
	private Language lang;
	private int minProcessorSpeed;
	private int minRamSpeedRequired;
	private boolean internetNeeded;
	private int ageLimit;
	private int noOfDownloads;
	private char rating;
	private Os osTypeSupported;

	public Application() {
		System.out.println("RUNNING APPLICATION...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}

	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}

	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}

	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}

	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}

	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}

	public int getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(int trialDays) {
		this.trialDays = trialDays;
	}

	public Language getLang() {
		return lang;
	}

	public void setLang(Language lang) {
		this.lang = lang;
	}

	public int getMinProcessorSpeed() {
		return minProcessorSpeed;
	}

	public void setMinProcessorSpeed(int minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}

	public int getMinRamSpeedRequired() {
		return minRamSpeedRequired;
	}

	public void setMinRamSpeedRequired(int minRamSpeedRequired) {
		this.minRamSpeedRequired = minRamSpeedRequired;
	}

	public boolean isInternetNeeded() {
		return internetNeeded;
	}

	public void setInternetNeeded(boolean internetNeeded) {
		this.internetNeeded = internetNeeded;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getNoOfDownloads() {
		return noOfDownloads;
	}

	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	public char getRating() {
		return rating;
	}

	public void setRating(char rating) {
		this.rating = rating;
	}

	public Os getOsTypeSupported() {
		return osTypeSupported;
	}

	public void setOsTypeSupported(Os osTypeSupported) {
		this.osTypeSupported = osTypeSupported;
	}

	@Override
	public String toString() {
		return "Application [name=" + name + ", version=" + version + ", createdDate=" + createdDate + ", size=" + size
				+ ", developedBy=" + developedBy + ", type=" + type + ", price=" + price + ", firstVersionReleaseDate="
				+ firstVersionReleaseDate + ", currentVersionReleaseDate=" + currentVersionReleaseDate
				+ ", nextVersionReleaseDate=" + nextVersionReleaseDate + ", trialDays=" + trialDays + ", lang=" + lang
				+ ", minProcessorSpeed=" + minProcessorSpeed + ", minRamSpeedRequired=" + minRamSpeedRequired
				+ ", internetNeeded=" + internetNeeded + ", ageLimit=" + ageLimit + ", noOfDownloads=" + noOfDownloads
				+ ", rating=" + rating + ", osTypeSupported=" + osTypeSupported + ", getName()=" + getName()
				+ ", getVersion()=" + getVersion() + ", getCreatedDate()=" + getCreatedDate() + ", getSize()="
				+ getSize() + ", getDevelopedBy()=" + getDevelopedBy() + ", getType()=" + getType() + ", getPrice()="
				+ getPrice() + ", getFirstVersionReleaseDate()=" + getFirstVersionReleaseDate()
				+ ", getCurrentVersionReleaseDate()=" + getCurrentVersionReleaseDate()
				+ ", getNextVersionReleaseDate()=" + getNextVersionReleaseDate() + ", getTrialDays()=" + getTrialDays()
				+ ", getLang()=" + getLang() + ", getMinProcessorSpeed()=" + getMinProcessorSpeed()
				+ ", getMinRamSpeedRequired()=" + getMinRamSpeedRequired() + ", isInternetNeeded()="
				+ isInternetNeeded() + ", getAgeLimit()=" + getAgeLimit() + ", getNoOfDownloads()=" + getNoOfDownloads()
				+ ", getRating()=" + getRating() + ", getOsTypeSupported()=" + getOsTypeSupported() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, createdDate, currentVersionReleaseDate, developedBy, firstVersionReleaseDate,
				internetNeeded, lang, minProcessorSpeed, minRamSpeedRequired, name, nextVersionReleaseDate,
				noOfDownloads, osTypeSupported, price, rating, size, trialDays, type, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Application other = (Application) obj;
		return ageLimit == other.ageLimit && Objects.equals(createdDate, other.createdDate)
				&& Objects.equals(currentVersionReleaseDate, other.currentVersionReleaseDate)
				&& Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(firstVersionReleaseDate, other.firstVersionReleaseDate)
				&& internetNeeded == other.internetNeeded && lang == other.lang
				&& minProcessorSpeed == other.minProcessorSpeed && minRamSpeedRequired == other.minRamSpeedRequired
				&& Objects.equals(name, other.name)
				&& Objects.equals(nextVersionReleaseDate, other.nextVersionReleaseDate)
				&& noOfDownloads == other.noOfDownloads && osTypeSupported == other.osTypeSupported
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && rating == other.rating
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size) && trialDays == other.trialDays
				&& type == other.type && Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

}