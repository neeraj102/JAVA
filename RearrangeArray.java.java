//Rearrange all negative element left side and all positive element right side 
class Rearrange
{
    public static void main(String args[])
    {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9,-99,-79,66,88,99,-101,101,1000 };
        int j=0,temp;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0 )
            {
               
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            
            }
            
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}