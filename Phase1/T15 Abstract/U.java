abstract class U
{
U()
{System.out.println("U()");}
abstract void test();
}
class V extends U
{
V()
{System.out.println("V()");}
void test()
{
System.out.println("test");}
}
class Manager11
{
public static void main(String args[])
{
V v1=new V();
v1.test();
}
}