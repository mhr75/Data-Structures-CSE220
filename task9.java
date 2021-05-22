public class task9
{
 public static void main(String[]args)
 {
   int arr[]={100,12,14,5,6};
 
 insertsort(arr,arr.length);
 for(int i=0;i<arr.length;i++)
 {
   System.out.print(arr[i]+" ");
 }
 System.out.println();
 }
 public static void insertsort(int arr[],int n)
 {
  if(n<=1)
  {
   return ;
  }
  insertsort( arr, n-1 );
  
   int l=arr[n-1];
   int i=n-2;
    while (i >= 0 && arr[i] > l)
        {
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = l;
  
 }

}