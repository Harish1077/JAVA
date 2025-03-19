import java.util.Scanner;

public class array {
    public static void main(String[] args) 
    {
        /*java.util.Scanner sc= new java.util.Scanner(System.in);
        int[] arr=new int[Integer.parseInt(args[0])];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]); */

        /*int[] arr=java.util.stream.IntStream.range(1,5).toArray();
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);*/

        /*int[] arr=java.util.stream.IntStream.rangeClosed(1,5).toArray();
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);*/

        /*int[] arr=java.util.stream.IntStream.of(1,2,3,4).toArray();
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);*/




        /*int a[]={1,2,3,4};
        int b[]={1,2,3,4};
        if(a==b)
        System.out.println("equal");
        else
        System.out.println(" not equal");*/

        /*int a[]={1,2,3,4};
        int b[]={1,2,3,4};
        if(a.equal(b))
        System.out.println("equal");
        else
        System.out.println(" not equal");*/

        /*int a[]={1,2,3,4};
        int b[]={1,2,3,4};
        System.out.println("a");
        System.out.println("b");*/
        
        /*Scanner sc = new Scanner(System.in);
        int a[]=new int[sc.nextInt()];
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        int b[]=new int[a.length];
        b=a;
        a[3]=21;
        for (int i=0;i<b.length;i++)
        System.out.println(b[i]);*/



        int arr[][]=new int[2][];
        arr[0]=new int [3];
        arr[1]=new int [2];
        for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr[i].length;j++)
        arr[i][j]=sc.nextInt();


    }
}
