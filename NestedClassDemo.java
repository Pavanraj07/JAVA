/*Develop a JAVA program to create an outer class
* with a function display. Create another class
* inside the outer class named inner with a
* function called display and call the two
* functions in the main class.*/
class Outer{
    int x,y;
    public Outer(int x,int y) {
    this.x=x;
    this.y=y;
    }
    void display() {
    System.out.println("This is from Outer class");
    System.out.println("x is=> "+ x +" n is=> "+y);
    }
    public class Inner{
    int m,n;
    public Inner(int m, int n) {
    this.m=m;
    this.n=n;
    }
    void display() {
    System.out.println("This is from Inner class");
    System.out.println("m is=> "+ m +" n is=> "+n);
    }
    }
    }
    public class NestedClassDemo{
    public static void main(String args[]) {
    Outer outerObj=new Outer(21,33);
    outerObj.display();
    Outer.Inner innerObj = outerObj.new Inner(5,15);
    innerObj.display();
    
    }
    }