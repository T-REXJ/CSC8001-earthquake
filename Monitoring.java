
/**
 * Write a description of class Monitoring here.
 * In this class, the monitoring table variables and methods are written.
 * In the monitor station method there is a length of 500 that associates the observatory, 
 * storing an array of variables as the observatory.
 * The first three classes are analogous to the construction of a tree.
 * The maximum method takes two for loop computations.
 * 
 * @author (Jinyang Zhou)
 * @version (09/11/2019)
 */
 public class Monitoring
{
    public int x=0;//观测站计数器
    public Observatory[] sons= new Observatory[500];//创建一个存储观测站的数组
    Observatory b1= new Observatory(0,0,"NULL");
    public Observatory Maxob;//最大观测站
    public earthquake Maxea;//最大地震
    /**
     * Constructor for objects of class Monitoring
     */
    public Monitoring()
    {  
        for(int i=0;i<500;i++)
        sons[i]=b1;
        
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addOb(Observatory son){
        sons[x]= son;
        x++;
        
    }

    public Observatory getOb()//检测到最大地震的观测台
    {
        for(int i=0;i<499;i++){
            if(sons[i].Average()<=sons[i+1].Average()){
                 
                 Maxob = sons[i];
                 }
        }
        
        System.out.println("The Observatory is " + Maxob.name + ". ");
    return Maxob;
}
    public earthquake getMaxE(){//全部最大地震
        Observatory MaxO=sons[0];//最大地震的观测站
        for(int i=1;i<sons.length;i++){
                if(sons[i].Max().magnitude>sons[i-1].Max().magnitude){////这句有问题
                 MaxO=sons[i];//观测站里的地震  
                }
            }
        MaxO.Max().Information();
        return MaxO.Max();
    }
    public void getList(double a){//输入指定指a
        double value=a;
        System.out.println("Here are the list: ");
        for(int i=0;i<sons.length;i++){//x是观测站指针
            for(int m = 0;m<sons[i].childs.length;m++){//m is jishu
            if(sons[i].childs[m].magnitude>value){
                sons[i].childs[m].Information();
                }
            }
    }
}
    public void ListOB(){
        for(int i=0;i<x;i++)
        System.out.println(sons[i].name);
    }
}
