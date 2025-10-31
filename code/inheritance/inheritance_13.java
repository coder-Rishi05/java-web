// 13. Create a program, showing an example of method overriding

 

class A{
    void display(){
        System.out.println("Display of A");
    }
}

class B extends A{
    void display(){
        System.out.println("Display of B");
    }
}

class Main{
    public static void main(String st[]){
        B obj2 = new B();

        obj2.display();
    }
}

/*
 Output:
 Display of B
 */