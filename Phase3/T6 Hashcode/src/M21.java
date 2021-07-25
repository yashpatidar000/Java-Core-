class C
{int i;
C(int i)
{this.i=i;}

public String toString()
{return "i="+i;}

public boolean equals(Object obj)
{return (obj instanceof C) && (i==((C)obj).i);}

public int hashcode()
{
    String s1=Integer.toString(i);
    int hash=s1.hashCode();
    return hash;
    
}
}
public class M21 {
    public static void main(String[] args) {
        C a1=new C(100);
        C a2=new C(100);
      
        System.out.println(a1);
        System.out.println(a2);
        
        System.out.println(a1.equals(a2));
        
        System.out.println(a1.hashCode());
        System.err.println(a2.hashCode());
        
    }
    
}