//NumberFormatException
/*class A
{
    public static void main(String[] args) {
        System.out.println("begin");
        String s="abc";
        System.out.println(1);
        int i=Integer.parseInt(s);
        System.out.println("end");
        
    }
}*/
class A
{
    public static void main(String[] args) {
        System.out.println(1);
        try{
        System.out.println(2);
        String s="abc";
        System.out.println(3);
        int i=Integer.parseInt(s);
        System.out.println(4);}
        
        catch(NumberFormatException ex)
        {
            System.out.println(5);
            System.out.println(ex);
            
            System.out.println(6);
        }
        System.out.println("end");
    }
}