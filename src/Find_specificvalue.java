public class Find_specificvalue
{
    public static void main(String[] args)
    {
        int[] userinput = {1,2,3,4,5,6,7,};
        int specificvalue = 3;

        Find_specificvalue.getspecificvalue(userinput, specificvalue);
    }
    public static void getspecificvalue(int[] uservalue,int specificvalue)
    {
        int[] input = uservalue;
        int value = specificvalue;  //declair variable

        for (int a = 0; a < input.length; a++)   //executing loop for counting number of digit
        {
            if (input[a] == value)
            {
                System.out.println("yes");
            }
        }
    }
}
