//6. Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.

class Animal{
    void move(){
        System.out.println("Animal Moving");
    }
    
}

class Cheetah extends Animal{
    void move(){
        System.out.println("Cheetah Running");
    }
}

class Main{
    public static void main(String st[]){
        Cheetah obj = new Cheetah();
        obj.move();
    }
}


/*
 Output:
 Cheetah Running
 */