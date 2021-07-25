class B
{
int i,j;
B()
{
i=1;j=2;
System.out.println("B()");
}
B(int m,int n)
{
i=m;j=n;
System.out.println("B(m,n)");
}
public static void main(String args[])
{
B b1=new B();
System.out.println("----");
B b2=new B(10,20);
System.out.println("----");
System.out.println(b1.i+","+b1.j);
System.out.println(b2.i+","+b2.j);
}
}