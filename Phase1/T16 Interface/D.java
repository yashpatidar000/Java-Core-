interface D
{
void test1();
}
interface E
{
void test2();
}
abstract class F
{
abstract void test3();
}
class G extends F implements D,E
{

public void test1()
{
System.out.println("test1");
}
public void test2()
{
System.out.println("test2");
}
void test3()
{
System.out.println("test3");
}
}
class Manager2
{
public static void main(String args[])
{
G g1=new G();
g1.test1();
g1.test2();
g1.test3();
}
}