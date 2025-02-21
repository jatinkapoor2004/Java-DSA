package Extra_Random_Questions;
public class wrapper_5_to_1_chocolate_practice 
{
    public static void main(String[] args) {
        int n=9;
        int choco=0;
        int wrap=0;
        while(n!=0)
        {
            if(wrap==5)
            {
                n++;
                wrap=0;
            }
            else if(n>0)
            {
                wrap++;
                choco++;
                n--;
            }
        }
        if(wrap==5)
            choco++;
        System.out.println(choco);
    }
}
