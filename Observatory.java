
/**
 * Write a description of class Observatory here.
 * In this class, the variables and methods for constructing the observatory are mainly written. 
 * In the observatory method, the creation of the observatory will automatically initialize an array of 500 to store the earthquake.
 * And the maximum earthquake and average magnitude calculated using the for loop.
 * 
 * @author (Jinyang Zhou)
 * @version (09/11/2019)
 */
        
import java.util.Scanner;
 public class Observatory
{
    public String name;
     int year;
    public double square;
    public earthquake[] childs = new earthquake[500];
    earthquake a1= new earthquake(0,0,0,0);
    
    public int counter=0;//孩子计数器

    
   
    public Observatory(int year,double square,String name)
    {   
        this.square=square;
        this.year=year;   
        this.name=name;
        for(int i =0;i<500;i++)
        childs[i]=a1;
        
    }
    public String information(){
        return "Observatory "+ name+ " begins at " + year + "year, covered about " + square + "killometers.";
                
               
            }
     public void addChild(earthquake child){//添加地震孩子
         
         childs[counter] = child;
         counter++;
         
        }
     /**public void GetE(){//一览表
         Scanner input = new Scanner(System.in);
         System.out.println("Input the Magnitude: ");
         double value = input.nextDouble();
        //int n=0;//生成一览表时所用的计数器
         for(int i=0;i<childs.length;i++){
         if(childs[i].magnitude>=value)
         //System.out.println(childs[n].longitude + " and " +MaxOE.latitude);
         System.out.println("This earthquake happened at "+ childs[i].longitude + " Lon " + childs[i].latitude + " Lat in "+ childs[i].year + " year " + " Magnitude: "  + childs[i].magnitude);
       //  n++;         }
       System.out.println(value);
       
         }
     //public void GetE(){
        }
     */
        
     public earthquake Max() //最大地震值
    {  
        earthquake MaxOE=childs[0];
        for(int i =1;i<childs.length;i++)
        {   
            if(childs[i].magnitude>childs[i-1].magnitude){
            MaxOE=childs[i];//观测站最大地震
            }
        }
        return MaxOE;
    }   
    public double Average(){//平均值
        double sum = 0;
        
        for(int a =0;a<childs.length;a++){
            sum=sum+childs[a].magnitude;}
        double Average = sum/counter;
        return Average;
    }   
    public int dizhenshuliang(){
        return counter;
    }
        }
