import java.io.*;

import java.util.*;


public class M6 {

public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int arr[]=new int[a];
        int sumofArray=0;
        for(int i=0;i<a;i++)
        {
            arr[i] = scanner.nextInt();
            sumofArray +=arr[i];
           }
        System.out.println(sumofArray);
        scanner.close();
}
}