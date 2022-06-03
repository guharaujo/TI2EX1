import java.util.Scanner;

public class Soma{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int a = getInt(),
            b = getInt();

        System.out.print("A soma de "+a+" + "+b+" = "+soma(a,b));
    }

    static int getInt(){
        System.out.println("Escolha um numero: ");
        return scanner.nextInt();
    }

    static int soma(int a, int b){
        return a+b;
    }
}