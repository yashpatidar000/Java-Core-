class Ea 
{
static int i;
public static void main(String args[])
{

System.out.println(Ea.i);
test();
Ea.test();
}
static void test()
{
System.out.println("test");
}
}
class Eb
{
public static void main(String args[]) 
{
System.out.println(Ea.i);


}
}