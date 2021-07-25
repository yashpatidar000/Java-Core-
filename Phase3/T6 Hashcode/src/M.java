
import java.util.HashSet;

public class M
{int i;
M(int i)
{this.i=i;}

public String toString()
{return "i="+i;}

public boolean equals(Object obj)
{return (obj instanceof M) && (i==((M)obj).i);}

public int hashcode()
{
    String s1=Integer.toString(i);
    int hash=s1.hashCode();
    return hash;
    
}
public static void main(String[] args)
{
    HashSet set=new HashSet();
    set.add(new M(20));
    set.add(new M(21));
    set.add(new M(20));
    set.add(new M(21));
    System.out.println(set);
    
    
}
}

