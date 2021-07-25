abstract class C
{
abstract void test1();
static void test2()
{
System.out.println("test2");
}
}
class Manager3
{
public static void main(String args[])
{

C.test2();
}
}