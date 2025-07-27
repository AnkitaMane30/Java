package com.dkte;

public class InvalidTimeException extends Exception {
	private String invalidFeild;
	private int invalidValue;
	public InvalidTimeException()
	{
		
	}
	public InvalidTimeException(String invalidFeild, int invalidValue) {
		this.invalidFeild = invalidFeild;
		this.invalidValue = invalidValue;
	}
	public String getInvalidFeild() {
		return invalidFeild;
	}
	public void setInvalidFeild(String invalidFeild) {
		this.invalidFeild = invalidFeild;
	}
	public int getInvalidValue() {
		return invalidValue;
	}
	public void setInvalidValue(int invalidValue) {
		this.invalidValue = invalidValue;
	}
	public String getMessage()
	{
		return String.format("%s=%d",invalidFeild, invalidValue);
	}

}
