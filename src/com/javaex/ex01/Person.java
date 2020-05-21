package com.javaex.ex01;

public class Person {
	private String name,hp;

    public Person() {
    }

    public Person(String name, String hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String gethp() {
        return hp;
    }

    public void sethp(String hp) {
        this.hp = hp;
    }

    public void showInfo() {
        System.out.println("#이름: "+this.name+", #핸드폰: "+this.hp);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hp='" + hp + '\'' +
                '}';
    }
}
