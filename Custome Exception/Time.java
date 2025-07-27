package com.dkte;

public class Time {
	private int hr;
	private int mins;
	private int secs;
	public Time()
	{
		
	}
	public Time(int hr, int mins, int secs) {
		this.hr = hr;
		this.mins = mins;
		this.secs = secs;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr)throws InvalidTimeException {
		if(hr<0 && hr>24)
			throw new InvalidTimeException("hrs",hr);
		this.hr = hr;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins)throws InvalidTimeException {
		if(mins<0 && mins>24)
			throw new InvalidTimeException("mins",mins);
		this.mins = mins;
	}
	public int getSecs() {
		return secs;
	}
	public void setSecs(int secs)throws InvalidTimeException {
		if(secs<0 && secs>24)
			throw new InvalidTimeException("secs",secs);
		this.secs = secs;
	}
	@Override
	public String toString() {
		return String.format("hrs : %d mins : %d secs : %d",hr,mins,secs); 
	}
	
}
