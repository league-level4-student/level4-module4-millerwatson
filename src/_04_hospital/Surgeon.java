package _04_hospital;

public class Surgeon extends Doctor {
	public Surgeon() {
		
	}
	
	boolean performsSurgery() {
		return true;
	}
	
	boolean makesHouseCalls() {
		return false;
	}
}
