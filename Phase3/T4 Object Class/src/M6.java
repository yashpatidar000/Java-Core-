class F
{int i;
F(int i)
{this.i=i;
}
public String toString()
{return "i="+i;
}
}
class F1
{int j;
F f1;
F1(int j,F f1)
{this.j=j;
this.f1=f1;
}
public String toString()
{return "j="+j+","+f1;
}
}
public class M6 {
    public static void main(String[] args) {
        F o1=new F(10);
        System.out.println(o1);
        F1 o2=new F1(30,o1);
        
        System.out.println(o2);
    }
}