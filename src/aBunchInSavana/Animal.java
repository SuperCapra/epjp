package aBunchInSavana;

public abstract class Animal { //se la classe è astrata posso creare un aggetto Animal che viene trattato come Leon o Zebra
	private String name;
	public static int numberOfeatenZebras = 0;
	private int age = (int) (Math.random()*49 + 1);
	
	public void eat() {
		System.out.println("The animal eat!");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
}
