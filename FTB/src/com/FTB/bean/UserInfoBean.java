package com.FTB.bean;

public class UserInfoBean{
	private int User_id;
	private String Name;
	private int Identification_no;
	private String Birthday;
	private String Gender;
	private String Email;
	
	public int getUser_id(){
		return User_id;
	}
	
	public void setUser_id(int User_id) {
		this.User_id = User_id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getIdentification_no() {
		return Identification_no;
	}
	public void setIdentification_no(int Identification_no) {
		this.Identification_no = Identification_no;
	}
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String Birthday) {
		this.Birthday = Birthday;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}

}