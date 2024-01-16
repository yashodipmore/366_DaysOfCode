public class Array4 {
    public static int linearSearch(int Marks[ ], int Key)
    {
        for(int i =0;i<Marks.length; i++)
        {
            if(Marks[i]==Key)
            {
              return i;
            } 
        }
        return -1;
    }
    public static void main(String args[])
    {
        int Marks[] = {2, 4, 6, 8, 10, 12, 14};
        int Key =10;
        int index = linearSearch(Marks,Key);
        if(index== -1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("key at the index :"+index);
        }
    }
}
