package com.dkte;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Time t1=new Time();
			t1.setHr(60);
			t1.setMins(100);
			t1.setSecs(20);
			System.out.println("t1 : "+t1.toString());
		}
		catch(InvalidTimeException e)
		{
			System.out.println("Invalid Field : "+e.getInvalidFeild());
			System.out.println("InvalidVale : "+e.getInvalidValue());
			System.out.println("Message : "+e.getMessage());
		}
	}

}
