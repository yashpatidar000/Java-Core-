class C
{
static int i;
public static void main(String args[])
{
System.out.println(i);
System.out.println(C.i);
test();
C.test();
}
static void test()
{
System.out.println("test");
}
}
class D
{
public static void main(String args[])
{
System.out.println(i);
test();
}
}