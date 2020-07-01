public class Equality_value
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        boolean status=true;    //declair boolean
        if (arr1.length == arr2.length)  //check equal leangth of two arrays
        {
            for (int a=0; a<arr1.length;a++)   //executing loop for counting number of digit
            {
                if (arr1[a] != arr2[a])  //check the equality
                {
                    status = false;
                }
            }
        }
        else
            {
             status=false;
            }
        if (status==true)
        {
            System.out.println("Arrays are equal");
        }
        else
            {
                System.out.println("Arrays are not equal");
            }
    }
}
