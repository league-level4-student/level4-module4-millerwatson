package _04_hospital;

public class Patient {
	
	boolean fcf = false;
	
	public Patient() {
		
	}
	
	void checkPulse() {
		fcf = true; 
	}
	
	boolean feelsCaredFor() {
		return fcf;
	}
}
