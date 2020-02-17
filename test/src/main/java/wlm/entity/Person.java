package wlm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Person {

	private String name;
	private int old;
	public String sex;

	public void printNull() {
		System.out.println("null");
	}

	public void printName() {
		System.out.println("name:" + name);
	}

	public void printYear(String year) {
		System.out.println("year: " + year);
	}
}