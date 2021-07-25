class S
{
int i;
static S test1()
{
S s1=new S();
s1.i=100;
System.out.println(s1.i);
test2(s1);
System.out.println(s1.i);
return s1;
}
static void test2(S obj)
{
System.out.println(obj.i);
obj.i=1000;
}
public static void main(String args[])
{
S obj=test1();
System.out.println(obj.i);
}
}// 100 100 1000 1000