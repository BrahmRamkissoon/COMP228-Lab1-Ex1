package com.ramkissoon.brahm;

import javax.swing.JOptionPane;

public class PatientTest {

	public static void main(String[] args) {
		
		Patient patient = new Patient();
		
		String id = JOptionPane.showInputDialog("Please enter your ID, (example 987): ");
		patient.setId(Integer.parseInt(id));	
		
		String firstName = JOptionPane.showInputDialog("Please enter your first name: ");
		patient.setFirstName(firstName);
		
		String lastName = JOptionPane.showInputDialog("Please enter your last name: ");
		patient.setLastName(lastName);
		
		String address = JOptionPane.showInputDialog("Please enter your street address, (example 12th Street): ");
		patient.setAddress(address);
		
		String city = JOptionPane.showInputDialog("Please enter the city you live in: ");
		patient.setCity(city);
		
		String province = JOptionPane.showInputDialog("Please enter the province you live in: ");
		patient.setProvince(province);
		
		String postalCode = JOptionPane.showInputDialog("Please enter your postal code: ");
		patient.setPostalCode(postalCode);
		
		JOptionPane.showMessageDialog(null, "Thank you! \nClick OK to view your information", "", JOptionPane.INFORMATION_MESSAGE);
		
		patient.GetPatientInfo();

	}

}
