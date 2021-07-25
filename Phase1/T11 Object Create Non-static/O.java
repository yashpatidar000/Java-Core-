class O
{
int i,j;
static void test(O obj)
{
System.out.println("from test:" + obj.i);
}
public static void main(String args[])
{
O o1=new O();
                 //o1.i=0;
test(o1);
o1.i=10;
test(o1);
System.out.println("from main:"+o1.i);
}
}