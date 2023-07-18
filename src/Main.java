import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n=scanner.nextInt();
        System.out.println("Enter values");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();

        }
        System.out.println("Enter P");
        int P=scanner.nextInt();
        int result=0;
        int pow=1;
        for(int i=n-1;i>=0;i--)
        {
            result=(result+((A[i]%P)*pow))%P;
            pow=(pow*10)%P;
        }
        System.out.println(result);
    }
}