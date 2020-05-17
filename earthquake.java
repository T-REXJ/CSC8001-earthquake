
/**
 * Write a description of class earthquake here.
 * In this class, mainly write the variables and methods for constructing earthquakes, 
 * as well as a seismic information method that you can call for a uniform format for the console。
 *
 * @author (Jinyang Zhou)
 * @version (09/11/2019)
 */
//import java.util.Scanner;
public class earthquake
{   public double magnitude;
    public int year;
    public double longitude;
    public double latitude;
    public earthquake(double longitude,double latitude,int year,double magnitude){
        this.magnitude= magnitude;
        this.year=year;
        this.longitude=longitude;
        this.latitude=latitude;
        
        
   
       
    }
    

   public double lan(){
    return latitude;
   }
    
   public double lon(){
    return longitude;
   }
    
   public int getYear(){
       return year;
   }
    public double magnitude(){
    return magnitude;
   }
   
    public void Information(){
        System.out.println("This earthquake happened at "+ this.longitude + " Lon. " + this.latitude + " Lat. Happened in "+ this.year + ". " + " Magnitude: "  + this.magnitude);
   
    } 
   
}



