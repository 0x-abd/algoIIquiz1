/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05200000054_quiz1;


/**
 *
 * @author abd
 */
public class Circle {
    private Point center;
    private int radius;
    
    
    public Circle(){
        setRadius(0);
    }
    public Circle(Point center, int radius){
        setCenter(center);
        setRadius(radius);
    }
    public Circle(Circle circle){
        setCenter(circle.getCenter());
        setRadius(circle.getRadius());
    }   

    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        if (radius < 0){
         throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
        
        
               
    }
    public String toString(){
        return String.format("radius = %d , Merkez = %s ", getRadius(),getCenter());
    }
    
    public boolean equals(Circle c1){
        if(c1.radius == getRadius() || c1.getCenter().equals(getCenter())){
            return true;
        }
        else
            return false;
    }
    public double alanHesapla(){
        return radius* radius * Math.PI;
    }
    
}
