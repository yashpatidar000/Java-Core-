class C
{
int i;
C()
{
++i;
}
public static void main(String args[])
{
C c1=new C();
C c2=new C();
C c3=new C();
System.out.println(c1.i);
System.out.println(c2.i);
System.out.println(c3.i);
}
}//1 1 1