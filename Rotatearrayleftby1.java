import java.util.*;

class Rotatearrayleftby1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

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
        

        int temp = arr[0];

        for(int i=1;i<n;i++)
        {
            arr[i-1] = arr[i];
            arr[n-1] = temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
        
    }
}