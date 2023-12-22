package model.domain;

public class Animal {
	private String type;
	
	Animal(String type){
		this.type = type;
	}
	
	public void sound(String bark) {
		System.out.println(bark);
	}
	
	
}
