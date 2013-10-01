package com.test.mvc;

import java.util.ArrayList;

public class DataModel {
	
	public int checkAccount(String prof, String password){
		if((!password.equalsIgnoreCase(" ") && !password.isEmpty()) && (prof.equalsIgnoreCase("doctor"))){
			return 1;
		}
		if((!password.equalsIgnoreCase(" ") && !password.isEmpty()) && (prof.equalsIgnoreCase("nurse"))){
			return 2;
		}
		return 0;
	}
	
	public ArrayList<String> givePatient(int account){
		ArrayList<String> list = null;
		if(account == 1){
			list.add("John");
			list.add("Doe");
			list.add("140/90");
			list.add("80");
			list.add("20");
			list.add("36.5");
			return list;
		}
		if(account == 2){
			list.add("Jane");
			list.add("Doe");
			list.add("120/80");
			list.add("60");
			list.add("18");
			list.add("37.5");
			return list;
		}
		return list;
	}
	
}

