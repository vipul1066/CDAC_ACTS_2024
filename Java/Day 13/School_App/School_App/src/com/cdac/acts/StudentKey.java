package com.cdac.acts;

public final class StudentKey {
	private final String std;
	private final String div;
	private final Integer roll;
	
	public StudentKey(String std, String div, Integer roll) {
		this.std = std;
		this.div = div;
		this.roll = roll;
	}

	public String getStd() {
		return std;
	}

	public String getDiv() {
		return div;
	}

	public Integer getRoll() {
		return roll;
	}
	
	@Override
	public int hashCode() {
		int result = 1;
		result = result * 31 + this.std.hashCode(); 
		result = result * 31 + this.div.hashCode(); 
		result = result * 31 + this.roll.hashCode(); 
		return result;
	}
	
	public boolean equals(Object obj) {
		//Check if passed obj is null;
		if( null == obj) {
			return false;
		}
		//Need to check about invoking object 
		//and passed object are of same type
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		//Self check
		if( this == obj) {
			return true;
		}
		
		//Actual comparison
		//Down casting
		StudentKey s = (StudentKey) obj;
		return (this.std.equals(s.getStd()) 
				&& this.div.equals(s.getDiv())
					&&	this.roll.equals(s.getRoll()));
	}

	@Override
	public String toString() {
		return ", std= " + std + ", div= " + div + ", roll= " + roll ;
	}
	

}
