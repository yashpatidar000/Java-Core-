class Ck
{
public static boolean test()
{
System.out.println("test");
System.out.println("test2");
boolean yash=true;
return yash;
}
public static void main(String args[])
{
boolean b=test();
System.out.println(b);
if (b)
{
System.out.println("done");
System.out.println("done");
test();
}
test();
}
}
//t t2 true done t t2  