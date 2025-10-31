// 7. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title


class Person{
    void getFirstName(){
        System.out.println("First Name: " + "SACHIN");
    }

    void getLastName(){
        System.out.println("Last Name: " + "KUMAR");
    }
}

class Employee extends Person{
    void getEmployeeId(){
        System.out.println("Employee ID: " + 90);
    }
    
    void getLastName(){
        System.out.println("Last Name: " + "KUMAR, " + "Job Title: " + "Software Programmer");
    }
}

class Main{
    public static void main(String st[]){
        Employee obj = new Employee();

        obj.getFirstName();
        obj.getLastName();
        obj.getEmployeeId();
    }
}

/*
 Output:
 First Name: SACHIN
 Last Name: KUMAR, Job Title: Software Programmer
 Employee ID: 90
 */