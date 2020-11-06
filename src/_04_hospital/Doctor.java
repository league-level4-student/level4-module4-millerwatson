package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public Doctor() {
		
	}
	
	boolean performsSurgery() {
		return false;
	}
	
	boolean makesHouseCalls() {
		return false;
	}
	
	void assignPatient(Patient p) throws DoctorFullException {
		if (patients.size() < 3) {
			patients.add(p);
		} else {
			throw new DoctorFullException();
		}
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	void doMedicine() {
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}

}
