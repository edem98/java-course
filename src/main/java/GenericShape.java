/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tamtam
 */
abstract class GenericShape {
    
    protected int numberSide;
    protected int area;
    protected int perimeter;
    protected String color;

    public int getNumberSide() {
        return numberSide;
    }

    public void setNomberSide(int numberSide) {
        this.numberSide = numberSide;
    }

    public abstract int getArea();
    

    public abstract int getPerimeter();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    
    
}
