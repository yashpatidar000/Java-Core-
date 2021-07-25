class Ee
{int i,j;
Ee(int i,int j)
{this.i=i;
this.j=j;}

public String toString()
{return "i="+i+  ",j="+j;
}
}
public class M5 {
    public static void main(String[] args) {
        Ee o1=new Ee(10,20);
        System.out.println(o1);
        Ee o2=new Ee(30,40);
        
        System.out.println(o2);
    }
}