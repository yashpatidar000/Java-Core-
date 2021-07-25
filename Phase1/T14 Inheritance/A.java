class A
{
int i;
}
class B extends A
{
int j;
}
class Manager
{
public static void main(String args[])
{
A a1=new A();
a1.i=10;
B b1=new B();
b1.i=20;
b1.j=30;
System.out.println(a1.i);
System.out.println(b1.i);
System.out.println(b1.j);
}
}//  