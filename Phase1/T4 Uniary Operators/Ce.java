class Ce 
{
static boolean test()
{
      System.out.println("test");
      boolean flag=true;
      return flag;
}
public static void main(String args[])
{
      boolean b=test();
      System.out.println(b);
      System.out.println(test());
      if(test())
    { 
      System.out.println("done");
}
      test();
}}
//test true test true test done test
