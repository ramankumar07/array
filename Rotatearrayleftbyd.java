import java.util.*;
public class Rotatearrayleftbyd {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        if(d>n)
        {
            d = d%n;
        }
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
            
        }
        System.out.println();
        

        int temp[] = new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i] = arr[i];
        }

        for(int i=d;i<n;i++)
        {
            arr[i-d] = arr[i];
            
        }
        for(int i = 0;i<d;i++)
        {
            arr[n-d+i] = temp[i];
        }
        
        

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
        
    }

}
