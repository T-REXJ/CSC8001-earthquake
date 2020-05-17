
/**
 * Write a description of class MonitoringIO here.
 * In this class, the console output is written.String matching is done through the if and equals statements.
 *
 *@author (Jinyang Zhou)
 * @version (09/11/2019)
 */
//import java.util.Observatory;
import java.util.Scanner;
public class MonitoringIO
{
    Scanner input = new Scanner(System.in);


    /**
     * Constructor for objects of class MonitoringIO
     */
  
    public static void main(String[] args){
        Monitoring grandpa = new Monitoring();
          while(true){
                System.out.println("①.Enter observatory data;");
                System.out.println("②.Enter earthquake data;");
                System.out.println("③.Provide monitoring statistics on largest average earthquake");
                System.out.println("④.Earthquake ever and all earthquakes with magnitude greater than a given number;");
                System.out.println("⑤.Exit");
                System.out.println("Input your choice: (choose number please)");
                Scanner input = new Scanner(System.in);
                String choice=input.next();
                if("1".equals(choice)){
              
                   System.out.println("The observatory's name is ");
                   String name=input.next();
                   System.out.println("The observatory's square is ");
                   int year=input.nextInt();
                   System.out.println("The observatory's year is ");
                   double square=input.nextDouble();
                   Observatory xxx = new Observatory(year,square,name); 
                   grandpa.addOb(xxx);
                   System.out.println(xxx.year+xxx.name+xxx.square);
                }
                if("2".equals(choice)){
                   System.out.println("The earthquake's magnitude is ");
                   double magnitude=input.nextDouble();
                   System.out.println("The earthquake happened in (Eg:2000)");
                   int year=input.nextInt();
                   System.out.println("The earthquake's longitude is ");
                   double longitude=input.nextDouble();
                   System.out.println("The earthquake's laitude is ");
                   double latitude=input.nextDouble();
                   earthquake xx =new earthquake(longitude,latitude, year,magnitude);
                   System.out.println("Existing observation stations are ");
                   grandpa.ListOB();//输出已有的所有观测站
                   System.out.println("Select the observatory to which it belongs.(Input the name)");
                   String chosename = input.next();
                   for(int i=0;i<grandpa.x;i++){
                       if(grandpa.sons[i].name.equals(chosename)){
                           grandpa.sons[i].addChild(xx);
                        }
                            
                    }
                       }
                if("3".equals(choice)){
                     grandpa.getMaxE();}
                if("4".equals(choice)){
                     System.out.println("Input your given magnitude: ");
                     double num =input.nextDouble();
                     grandpa.getList(num);

                }
                if("5".equals(choice))
                 break;
                
                
         }
    } 
}