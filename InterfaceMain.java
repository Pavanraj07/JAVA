/*Develop a JAVA program to create an interface
* Resizable with methods resizeWidth(int width)
* and resizeHeight(int height) that allow an
* object to be resized. Create a class Rectangle
* that implements the Resizable interface and
* implements the resize methods*/
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
    }
    class Rectangle implements Resizable{
    int width,height;
    Rectangle(int w, int h)
    {
    this.width=w;
    this.height=h;
    System.out.println("Initialized Rectangle Width:"+width);
    System.out.println("Initialized Rectangle Height:"+height);
    }
    public void resizeWidth(int w) {
    this.width=w;
    System.out.println("Rectangle Width After Resizing");
    System.out.println("Rectangle Width: "+width);
    }
    public void resizeHeight(int h) {
    this.width=h;
    System.out.println("Rectangle Height After Resizing");
    System.out.println("Rectangle Height: "+height);
    }
    }
    public class InterfaceMain {
    public static void main(String args[]) {
    Rectangle r=new Rectangle(5,6);
    r.resizeWidth(12);
    r.resizeHeight(21);
    }
    }