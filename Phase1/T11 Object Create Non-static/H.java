class H
{int i;
void test()
{
System.out.println("from test");
}
public static void main(String args[])
{
H obj = new H();
obj.i=10;
obj.test();
System.out.println(obj.i);
}
}
