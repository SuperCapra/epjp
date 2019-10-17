package aBunchOfAnimals;

public class Animal {
	private String name;
	public int numberOfeatenZebras = 0;
	
	public void eat() {
		System.out.println("The animal eat!");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
