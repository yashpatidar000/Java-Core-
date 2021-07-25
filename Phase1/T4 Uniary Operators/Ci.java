class Ci //call by value in Ch sop(k) removed
{
static int i=test();
static int j=100;
public static void main(String args[])
{
System.out.println("i");
System.out.println("j");
}
static int test()
{
return j;
}
}//