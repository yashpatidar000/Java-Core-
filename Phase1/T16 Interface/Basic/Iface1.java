interface Iface1
{
void test1();
}
abstract class J implements Iface1
{
abstract void test2();
}
abstract class K extends J
{
public void test1()
{
System.out.println("test1");
}
void test2()
{
System.out.println("test2");
}
}
class L extends K
{
}
class Manager4
{
public static void main(String args[])
{
L obj1=new L();
obj1.test1();
obj1.test2();
}
}