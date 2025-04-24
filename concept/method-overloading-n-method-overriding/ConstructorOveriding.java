/* Constructor Overiding */
public class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        width=w; height=h;; depth=d;
    }
    Box() {
        width=-1; height=-1; depth=-1;
    }
    Box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width*height*depth;
    }
}

public class ConstructorOveriding {

    public static void main(String[] args) {
        Box b1 = new Box(1, 2, 3); 
        Box b2 = new Box(); 
        Box b3 = new Box(10);
        System.out.println(b1.volume());
        System.out.println(b2.volume());  
        System.out.println(b3.volume()); 
    }
}