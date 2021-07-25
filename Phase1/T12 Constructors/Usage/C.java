class C
{
int i;double j;
String s1;
C(int m,double n,String s)
{
i=m;
j=n;
s1=s;
}
public static void main(String args[])
{
C c1=new C(0,20.09,"abc");
C c2=new C(100,2.09,"XYZ");
System.out.println(c1.i);
System.out.println(c1.j);
System.out.println(c1.s1);
System.out.println("----");
System.out.println(c2.i);
System.out.println(c2.j);
System.out.println(c2.s1);
}
}