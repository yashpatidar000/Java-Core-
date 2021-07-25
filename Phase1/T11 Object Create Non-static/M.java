class M
{
int i;
void test()
{
M m1 = new M();
m1.i=10;
System.out.println("from test:"+m1.i);
}

public static void main(String args[])
{
M n1 = new M();
n1.i=10;
System.out.println("from test:"+n1.i);
n1.test();
System.out.println("done");
}
}//from test:10 
//done