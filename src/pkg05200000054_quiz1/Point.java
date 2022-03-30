/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05200000054_quiz1;

/**
 *
 * @author abd
 */
public class Point {
    private int X,Y;

    public Point() {
        setX(0);
        setY(0);
        
    }
    public Point(int X, int Y){
        setX(X);
        setY(Y);
    }
    
    public Point(Point P){
        setX(P.getX());
        setY(P.getY());
    }

    /**
     * @return the X
     */
    public int getX() {
        return X;
    }

    /**
     * @param X the X to set
     */
    public void setX(int X) {
        this.X = X;
    }

    /**
     * @return the Y
     */
    public int getY() {
        return Y;
    }

    /**
     * @param Y the Y to set
     */
    public void setY(int Y) {
        this.Y = Y;
    }
    
    public String toString(){
        return String.format("[%d,%d]", X,Y);
    }
    public boolean equals(Point p1){
        if(p1.getX() == this.X && p1.getY() == this.Y ){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
}
