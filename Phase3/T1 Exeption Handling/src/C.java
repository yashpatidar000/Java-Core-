//ArrayIndexOutOfBoundsExecption
/*public class C {
    public static void main(String[] args) {
        System.out.println("Begin");
        int arr[]=new int[3];
        System.out.println(1);
        arr[3]=100;
        System.out.println(2);
    }
}*/
public class C {
    public static void main(String[] args) {
        System.out.println(1);
        try{
        System.out.println(2);
        int arr[]=new int[3];
        System.out.println(3);
        arr[10]=100;
        System.out.println(4);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(5);
            System.out.println(ex.getMessage());
            System.out.println(6);
        }
        System.out.println(7);
    }
}
