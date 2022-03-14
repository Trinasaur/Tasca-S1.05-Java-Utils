package n1exercici5;

import java.io.Serializable;

public class Person implements Serializable {

//ATRIBUTS
	private static long serialVersionUID = 1L;
	static String country = "France";
	private int age;
	private String name;
	transient int height;

//CONSTRUCTOR
	public Person(int age, String name, int height) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
	}

//GETTERS AND SETTERS
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Person.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
//METODES
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", height=" + height + "]";
	}

}


