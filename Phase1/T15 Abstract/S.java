abstract class S
{}
abstract class T
{}
class Z
{
void test1(S s1)
{}
void test2(S s1,T t1)
{}
void test3()
{
S s1;}
void test4()
{
S s1;T t1;}
S test5(S obj)
{
return obj;}
T test6(T obj)
{
return obj;}
T test7()
{
return null;}
}
class Manager12
{int i;
public static void main(String args[]){
Z z1=new Z();
z1.test5();

}
}
