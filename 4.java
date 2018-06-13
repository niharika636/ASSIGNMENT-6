import java.util.*;
 import java.lang.*;
class Lengthoflongestsubarray {
    public static int SubArr(int arr[],
                                            int n)
    {
        int m = 1, l = 1,i;
        for (i=1; i<n; i++)
        {
            if (arr[i] > arr[i-1])
                l++;
            else
            {
                if (m < l)    
                    m= l;
                l = 1;    
            }    
        }
        
        if (m < l)
            m= l;
        return m;
    }
    public static void main(String a[]) 
    {
    int n,i;
System.out.println("Enter no of elements:");
    Scanner s1= new Scanner(System.in);
    n=s1.nextInt();
System.out.println("Enter elements of array:");
         int arr[] = new int [n];
	for(i=0;i<n;i++)
	arr[i]=s1.nextInt();
            int length = arr.length;
            System.out.println("Length = " + SubArr(arr, length));  }   }
       