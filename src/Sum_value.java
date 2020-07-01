public class Sum_value
{
    public static void main(String[] args)
    {
        int arr[]= {3,4,22,7};
        int sum =0;
        for (int a=0;a < arr.length;a++)   //executing loop for counting number of digit
        {
            sum=sum+arr[a];   //adding multiplicative value
        }
        System.out.println(sum);
    }
}
