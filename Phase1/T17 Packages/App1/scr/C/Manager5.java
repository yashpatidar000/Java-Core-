package pack3;
class X
{
public int i=3;
}
class Manager5
{
public static void main(String args[])
{
X x1=new X();
pack1.X x2=new pack1.X();
pack2.X x3=new pack2.X();
System.out.println(x1.i);
System.out.println(x2.i);
System.out.println(x3.i);
}
}