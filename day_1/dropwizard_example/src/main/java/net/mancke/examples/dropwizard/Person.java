package net.mancke.examples.dropwizard;

import java.util.List;

public class Person {

    private String name;
    private List<String> children;
    private int age;

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public int getAge() {
	return age;
    }

    public void setChildren(List<String> children) {
	this.children = children;
    }
    
    public List<String> getChildren() {
	return children;
    }

}
