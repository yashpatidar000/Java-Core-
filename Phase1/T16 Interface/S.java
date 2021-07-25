interface S
{
void test1();
void test1(int i);
void test1(double d);
}
class T implements S 
{
public void test1()
{
System.out.println("test()");
}
public void test1(int i)
{
System.out.println("test(int)");
}
public void test1(double d)
{
System.out.println("test(double)");
}
}
class Manager6
{
public static void main(String args[])
{
T t1=new T();
t1.test1();
t1.test1(2);
t1.test1(2.9);
}
}