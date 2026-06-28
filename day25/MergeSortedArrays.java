import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter first sorted array:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter second sorted array:");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int ans[]=new int[n+m];
        int i=0,j=0,k=0;

        //merge both arrays
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }

            k++;
        }




        //remaining elements of first array
        while(i<n){
            ans[k]=arr1[i];
            i++;
            k++;
        }

        //remaining elements of second array
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }

        System.out.println("merged Array:");
        for(int x:ans){
            System.out.print(x+" ");
        }
        sc.close();
    }
}