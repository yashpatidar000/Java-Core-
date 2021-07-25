interface P
{
void test1();
}

class Q 
{
public void test1()
{
System.out.println("test1");
}
}
class R extends Q implements P
{
}

class Manager5
{
public static void main(String args[])
{
R r1=new R();
r1.test1();

}
}