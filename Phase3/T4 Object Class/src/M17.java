class U
 {int i;
 U(int i)
 {this.i=i;}  
 public String toString()
 {return "i="+i;}
 
 public boolean equals(Object s)
 {
    /* if (!(sss instanceof Q))
     {return false;}*/
    
 return (s instanceof U) && (i==((U)s).i);}
 }
 
 class V
 {int i;
 V(int i)
 {this.i=i;}  
 public String toString()
 {return "i="+i;}
 
 public boolean equals(Object sss)
 {
     /*if (!(sss instanceof R))
     {return false;}*/
     
return (sss instanceof V) && (i==((V)sss).i);}
 }

         
public class M17 {
    public static void main(String[] args) {
        U o1=new U(10);
        U o2=new U(10);
        
        V r1=new V(20);
        V r2=new V(20);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(r1);
        System.out.println(r2);
        
        System.out.println(o1.equals(o2));
        System.out.println(r1.equals(r2));
        System.out.println("----");
        System.out.println(o1.equals(r1));
        System.out.println(o2.equals(r2));
    }
}
