import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num=0;
        System.out.print(" Digite el numero de calificacion:");
        Scanner scanner1= new Scanner(System.in);
        num= scanner1.nextInt();
        System.out.println(num);


        switch (( num >= 1 && num <=2) ? 0 : (num > 2 && num <= 4) ? 1 : (num >4 && num <= 6) ? 2 : (num >6 && num <= 8) ? 3 : (num >8 && num <= 10) ? 4 : 5) {

            case 0: System.out.println("Su Calificación es: F");
                break;
            case 1: System.out.println("Su Calificación es: D");
                break;
            case 2: System.out.println("Su Calificación es: C");
                break;
            case 3: System.out.println("Su Calificación es: B");
                break;
            case 4: System.out.println("Su Calificación es: A");
                break;
            case 5: System.out.println("Número no válido, por favor verifique");
                break;
        }
    }
}