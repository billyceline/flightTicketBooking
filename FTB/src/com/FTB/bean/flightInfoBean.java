package com.FTB.bean;

public class flightInfoBean{
	private int infoId;
	private String Flight_no;
	private String Origin;
	private String Destination;
	private String Date;
	private String Departure_time;
	private String Arrival_time;
	private String Duration;
	private float Price;
	private int Remain_ticket_no;
	
	public int getInfoId() {
		return infoId;
	}
	public void setInfoId(int infoId) {
		this.infoId = infoId;
	}
	
	public String getFlight_no() {
		return Flight_no;
	}
	public void setFlight_no(String Flight_no) {
		this.Flight_no = Flight_no;
	}
	
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String Origin) {
		this.Origin = Origin;
	}
	
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String Destination) {
		this.Destination = Destination;
	}
	
	public String getArrival_time() {
		return Arrival_time;
	}
	public void setArrival_time(String Arrival_time) {
		this.Arrival_time = Arrival_time;
	}
	
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String Duration) {
		this.Duration = Duration;
	}
	
	public String getDeparture_time() {
		return Departure_time;
	}
	public void setDeparture_time(String Departure_time) {
		this.Departure_time = Departure_time;
	}
	
	
	public float getPrice() {
		return Price;
	}
	public void setPrice(float Price) {
		this.Price = Price;
	}
	
	public int getRemain_ticket_no() {
		return Remain_ticket_no;
	}
	public void setRemain_ticket_no(int Remain_ticket_no) {
		this.Remain_ticket_no = Remain_ticket_no;
	}
	
	public String getDate() {
		return Date;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}


}