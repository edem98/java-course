
/**
 *
 * @author tamtam
 */
public class Square extends GenericShape {
    
    private Integer sideLength;
    
    
    public Square(int sideLength) {
        this.numberSide = 4;
        this.sideLength = sideLength;
    }
    
    public Square() {
        this.numberSide = 4;
        this.sideLength = 10;
    }
    
    public int getArea(){
        return this.sideLength * this.sideLength;
    }
    
    public int getPerimeter(){
        return this.sideLength * this.numberSide;
    }
    
    public String toString(){
        return this.sideLength.toString();
    }
  
}
