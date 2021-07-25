
class Cc
{
int i;
Cc(int i)
{this.i=i;}
public String toString()
{return "i="+i;}
}

class Dd
{
int j,k;
Dd(int j,int k)
{this.j=j;
this.k=k;
}
public String toString()
{return "j="+j+",k="+k;}
}
class E
{Cc o1;
Dd o2;

int m,n;
E(int m,int n,Cc o1,Dd o2)
{this.m=m;
this.n=n;
this.o1=o1;
this.o2=o2;
}
public String toString()
{return "m="+m +",n="+n +"," +o1+","+o2;
}
}
public class M7 {
    public static void main(String[] args) {
        Cc c=new Cc(10);
        Dd d=new Dd(20,30);
        E e=new E(1,2,c,d);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
