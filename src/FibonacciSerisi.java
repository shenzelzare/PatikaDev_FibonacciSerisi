import java.util.Scanner;

public class FibonacciSerisi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısını Girin: ");
        int sayi = scanner.nextInt();
        FindFibonacciSeries(sayi);
    }

    public static void FindFibonacciSeries(int N) {
        int n1=0,n2=1,n3,i;

        System.out.print(N + " Elemanlı Fibonacci Serisi : ");
        System.out.print(n1+" "+n2);

        for(i=2;i<=N;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    }

