public class Ascendingnumber
{
    public static void main(String[] args)
    {
        int a[] = {6,7,5,8,3,2,1,4,9};
        int temp = 0;
        for (int b =0; b < a.length;b ++)
        {
            for (int c=b;c<a.length;c++)
            {
                if(a[b]>a[c])
                {
                    temp = a[b];
                    a[b] = a[c];
                    a[c] = temp;
                }
            }
        }
        for (int b=0;b<a.length;b++)
        {
            System.out.print("" +a[b]+ "");
        }
    }
}
