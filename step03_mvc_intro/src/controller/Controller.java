package controller;

import model.Model;

public class Controller {
	// 1. view 전달 받는것 -> model 
	
	public static String transferResult (String keyword) {
		return Model.search(keyword);
	}
	
	// 2. model 받은 결과값을 -> View 전달
}
