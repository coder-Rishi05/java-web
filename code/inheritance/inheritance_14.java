// 14. Create a program, showing an example of dynamic method dispatch



class A{
    void display(){
        System.out.println("Display of A");
    }
}

class B extends A{
    void display(){
        System.out.println("Display of B");
    }
    
    void disp(){
        System.out.println("Disp of B");
    }
}

class Main{
    public static void main(String st[]){
        A obj1 = new B();
        B obj2 = new B();

        obj1.display();
        obj2.display();
        obj2.disp();
    }
}

/*
 Output:
 Display of B
 Display of B
 Disp of B
 */