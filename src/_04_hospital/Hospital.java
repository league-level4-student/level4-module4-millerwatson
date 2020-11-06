package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public Hospital() {
		
	}
	
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	public void addPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	void assignPatientsToDoctors() throws DoctorFullException {
		int base = patients.size() / doctors.size();
		int patientNum = 0;
		for (int i = 0; i < doctors.size(); i++) {
			for (int j = 0; j < base; j++) {
				doctors.get(i).assignPatient(patients.get(patientNum));
				patientNum++;
			}
		}
		
		for (int i = 0; i < patients.size() % doctors.size(); i++) {
			doctors.get(i).assignPatient(patients.get(patientNum));
			patientNum++;
		}
	}
}
