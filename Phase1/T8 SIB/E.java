class E
{
static int i;
public static void main(String args[])
{
System.out.println(i);
System.out.println(E.i);
test();
E.test();
}
static void test()
{
System.out.println("test");
}
}
class F
{static int i=20;
public static void main(String args[])
{
System.out.println(i);
}
}//20