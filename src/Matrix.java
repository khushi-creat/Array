public class Matrix
{
    public static void main(String[] args)
    {
        int arr[][] = new int[3][3];
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0;i<a.length;i++)
        {
            for (int b=0;b<a.length;b++)
            {
                System.out.print(a[b][i]+  " ");
            }
            System.out.println();
        }


    }
}
