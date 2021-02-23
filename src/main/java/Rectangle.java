/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tamtam
 */
public class Rectangle extends GenericShape{
    private Integer longSide;
    private Integer shortSide;
    
    
    public Rectangle(int longSide , int shortSide) {
        this.numberSide = 4;
        this.longSide= longSide ;
        this.shortSide= shortSide ;
    }

    public int getArea(){
        return longSide * shortSide;
    }
    
    public int getPerimeter(){
        return (longSide + shortSide) *2;  
    }
    
    public String toString(){
           return this.longSide.toString() + this.shortSide.toString();
       }

}