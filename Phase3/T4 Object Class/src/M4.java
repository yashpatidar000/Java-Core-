
class D
{int i;
D(int i)
{this.i=i;}
public String toString()
{return "i="+i;
}
}
public class M4 {
    public static void main(String[] args) {
        D o1=new D(10);
        System.out.println(o1);
        D o2=new D(20);
        
        System.out.println(o2);
    }
}
