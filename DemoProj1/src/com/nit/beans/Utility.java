package com.nit.beans;

import java.sql.Date;

public class Utility {
	public static void main(String[] args) {
		System.out.println("Date method called");
	}
	public Date getSysDate() {
		
		return new Date(0, 0, 0);
	}

}
