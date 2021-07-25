interface U
{
void test1();

}
class V implements U 
{
public void test1(int i)
{
System.out.println("test(int)");
}
public void test1()
{
System.out.println("test()");
}
}
class W
{
public static void main(String args[])
{
V v1=new V();
v1.test1();
v1.test1(2);

}
}