package hello.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	@NotNull
	@Size(min = 2, max = 32) //will only allow names between 2 and 32 characters long
	private String name;
	
	@NotNull
	@Min(18)  //won’t allow if the age is less than 18
	private Integer age;

	public Person() {

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String toString() {
		return "Person(Name: " + this.name + ", Age: " + this.age + ")";
	}
}
