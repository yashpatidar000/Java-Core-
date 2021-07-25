class Q
{
int i;
static void test1(Q obj)
{
System.out.println(obj.i);
obj.i=10;
}
static void test2(Q obj)
{
System.out.println(obj.i);
obj.i=100;
}
static void test3(Q obj)
{
System.out.println(obj.i);
obj.i=1000;
}
public static void main(String args[])
{
Q q1=new Q();
test1(q1);
System.out.println("--");
test2(q1);
System.out.println("--");
test3(q1);
System.out.println("--");
System.out.println(q1.i);
}
}