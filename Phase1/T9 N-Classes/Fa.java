class Fa
{
static int i=10;
static
{
System.out.println(1);
System.out.println(i);
Fa.i=100;
}
static void test()
{
System.out.println(2);
System.out.println(1);
i=200;
}
public static void main(String args[])
{
System.out.println(3);
System.out.println(i);
i=300;
test();
System.out.println(i);
}
}// 1 10 3 100 2 1 200