
class J {
    int x,y;
    J(int x,int y)
    {this.x=x;
    this.y=y;}
    public String toString()
    {return "x="+x+",y="+y;}
}

class K extends J
{
int z;
String s1;
K(int x,int y,int z,String s1)
{super(x,y);
this.z=z;
this.s1=s1;}

public String toString()
{
    String str=super.toString();
    s1=str+",z="+z+",s1="+s1;
   return s1;
}
}

public class M10 {
    public static void main(String[] args) {
        J f1=new J(10,20);
        
        K g1=new K(30,40,50,"abc");
       
        System.out.println(f1);
        System.out.println(g1);
     }
    
}
