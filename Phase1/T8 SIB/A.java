class A
{
static int i;
public static void main(String args[])
{
System.out.println(i);
System.out.println(A.i);
test();
A.test();
}
static void test()
{
System.out.println("test");
}
}
class B
{
public static void main(String args[])
{
System.out.println(A.i);
A.test();
}
}