package com.ramkissoon.brahm;

import javax.swing.JOptionPane;

public class Patient {
	// PRIVATE INSTANCE VARIABLES +++++++++++++++++++++++++++
	private int _id;
	private String _firstName;
	private String _lastName;
	private String _address;
	private String _city;
	private String _province;
	private String _postalCode;
	
	// DEFAULT (NO-ARGUMENT) CONSTRUCTOR ++++++++++++++++++++++++++++++++++
	public Patient(){
		
	}
	
	// MULTI-ARGUMENT CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++
	public Patient(int id, String firstName, String lastName, String address, String city, String province,
			String postalCode) {
		this._id = id;
		this._firstName = firstName;
		this._lastName = lastName;
		this._address = address;
		this._city = city;
		this._province = province;
		this._postalCode = postalCode;
	}
	
	
	// GETTERS AND SETTERS +++++++++++++++++++++++++++++++++++
	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		this._lastName = lastName;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		this._address = address;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		this._city = city;
	}

	public String getProvince() {
		return _province;
	}

	public void setProvince(String province) {
		this._province = province;
	}

	public String getPostalCode() {
		return _postalCode;
	}

	public void setPostalCode(String postalCode) {
		this._postalCode = postalCode;
	}
	
	
	public void GetPatientInfo(){ 
		JOptionPane.showMessageDialog(null, 
				"++Patient Information++" +
				"\nID: " + getId() +
				"\nName: " + getFirstName() + getLastName() +
				"\nAddress: " + getAddress() +
				"\nCity: " + getCity() +
				"\nProvince: " + getProvince() +
				"\nPostal Code: " + getPostalCode(), 
				"\nPatient Info", JOptionPane.PLAIN_MESSAGE);
		}
	

}
