// Write a single program to show:
// - Multi-level inheritance    - done
// - Function overloading       - done
// - Constructor overloading    - done
// - Constructor chaining       - done
// - Function overriding        - done
// - Compile time polymorphism  - done
// - Runtime polymorphism       - done


class grandParent{

    // constructor overloading
    grandParent(){
    }
    
    grandParent(String grandParentName){
        System.out.println("Grand Parent named: " + grandParentName);
    }

    // use outln instead of writing System.out.println everytime
    void outln(String arg){
        System.out.println(arg);
    }
    
    void show(){
        outln("This is the Grand Parent class");
    }
}

class Parent extends grandParent {
    Parent(){
    }

    Parent(String parentName){
        super(parentName);
        outln("Parent named: " + parentName + " Jr.");
    }
    
    // Function overloading
    void show(){
        outln("This is the Parent class");
    }

    void show(int Age){
        outln("Parent's Age: " + Age);
    }
}

class Child extends Parent{
    Child(){
    }
    
    Child(String childName){
        super(childName);
        outln("Child named " + childName + " Jr. Jr.");
    }

    void show(){
        outln("This is the Child class");
    }
}

class Assignment {
    public static void main(String args[]){

        System.out.println("Constructor chaining and overloading:");
        Parent p1 = new Parent();
        Parent p2 = new Parent("John");

        System.out.println("-------------------------------------");

        System.out.println("Runtime polymorphism and Function overriding:");
        p1.show();
        p1 = new Child();
        p1.show();

        System.out.println("-------------------------------------");

        System.out.println("Compile-time polymorphism and Function overloading:");
        p2.show();
        p2.show(40);
    }
}