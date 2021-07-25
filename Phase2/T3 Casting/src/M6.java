
class M6 {
    
    static float test1(byte b)
    {
       long l=test2(b);
       return l;
    }
    static int test2(int i)
    {
       
       return i;
       }
   
    public static void main(String[] args)
    {
     byte b=10;
     double d=test1(b);
        System.out.println("done");
    }
}
    

