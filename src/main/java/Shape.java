import java.util.Scanner;


/**
 *
 * @author tamtam
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(25);
        System.out.println(square2.getArea());
    }
    
}
