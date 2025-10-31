/*
26. Write a Java program to create a class called Person with private instance variables name, age, and country. 
Provide public getter and setter methods to access and modify these variables.
*/

class Person {
    private String name;
    private int age;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Sachin");
        p.setAge(21);
        p.setCountry("India");

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Country: " + p.getCountry());
    }
}

/*
Sample Output:
Name: Sachin
Age: 21
Country: India
*/
