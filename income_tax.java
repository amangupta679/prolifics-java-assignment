import java.util.Scanner;

public class IncomeTax {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income ");
        double income=sc.nextDouble();
        double tax=incomeTax(income);
        System.out.println("Income tax amount is "+tax);

    }
    static double incomeTax(double i)
    {
        double tax;
        if(i<=250000)
            tax=0;
        else if(i<=500000)
            tax=0.1*(i-250000);
        else if(i<=1000000)
            tax=(0.2*(i-500000))+10000;
        else
            tax=(0.4*(i-1000000))+200000;
        return tax;

    }
}
