public class task8
{
public static void main(String args[]) 
    {
        int arr[] = {12, 11, 13, 5, 6};
      
        sort(arr, arr.length, 0);
      
        for (int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
    }
 
static int min(int a[], int i, int j)
    {
        if (i == j)
        {
            return i;
        }
        else{
        int k = min(a, i + 1, j);
        
        return (a[i] < a[k])? i : k;
        }
        }



static void sort(int a[], int n, int index)
    {
       
        if (index == n)
        {
          return;
        }
        else{
        int k = min(a, index, n-1);
      
        if (k != index){
          
           int temp = a[k];
           a[k] = a[index];
           a[index] = temp;
        }
        sort(a, n, index + 1);
        }
        }
}