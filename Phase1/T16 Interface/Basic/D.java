interface D
{
void test1();
public abstract void test2();
}
abstract class E implements D
{
}
class F implements D
{
public void test1()
{
System.out.println("test1");
}
public void test2()
{
System.out.println("test2");
}
}
class Manager1
{
public static void main(String args[])
{
F f1=new F();
f1.test1();
f1.test2();

}
}