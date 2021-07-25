class Dc
{
static int i;
public static void main(String args[])
{
int i=10;
System.out.println(i);
i=20;
System.out.println(Dc.i);
test();
Dc.test();
}
static int test()
{
System.out.println("test");
return i;
}
} 