/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05200000054_quiz1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author abd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        try{
            File myObj = new File("/Users/abd/Desktop/quiz1.txt");
            Scanner myReader = new Scanner(myObj);
            double maxArea = 0;
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                int pointX = Integer.parseInt(data.split(" ")[0]); 
                int pointY = Integer.parseInt(data.split(" ")[1]); 
                int radius = Integer.parseInt(data.split(" ")[2]);
                
                Point p1 = new Point(pointX,pointY);
                Circle c1 = new Circle(p1, radius);
                if(c1.alanHesapla() > maxArea){
                    maxArea = c1.alanHesapla();
                }
                System.out.println(c1.toString());
                System.out.println(String.format("%.2f", c1.alanHesapla()));
                
                
                
            }
            System.out.println("En buyuk alan : " + String.format("%.2f", maxArea));
            myReader.close();
            
        }catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            
        }
        
       
        
    }
    
}
