public class Duplicate_number
{
    public static void main(String[] args)
    {
        int arr[]= {9,4,3,2,1,5,4,3};

        for (int a=0;a<arr.length;a++)  //executing loop for counting number of digit
        {
            for (int b=a+1;b<arr.length;b++)  //for getting last digit & multiply
            {
                if (arr[a]==arr[b])  //checking if user enter value eual to addition value
                {
                    System.out.println("Total duplicate value is = " +arr[b]);  //asking for user input
                }
            }
        }
    }
}
