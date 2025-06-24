import java.util.Scanner;
import java.util.Locale;

public class ScannerTipi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // forza l'uso del punto decimale

        System.out.print("Inserisci una stringa: ");
        String str = scanner.nextLine();

        System.out.print("Inserisci un carattere: ");
        char ch = scanner.nextLine().charAt(0);

        System.out.print("Inserisci un booleano (true/false): ");
        boolean bool = scanner.nextBoolean();

        System.out.print("Inserisci un byte: ");
        byte b = scanner.nextByte();

        System.out.print("Inserisci uno short: ");
        short s = scanner.nextShort();

        System.out.print("Inserisci un int: ");
        int i = scanner.nextInt();

        System.out.print("Inserisci un long: ");
        long l = scanner.nextLong();

        System.out.print("Inserisci un float: ");
        float f = scanner.nextFloat();

        System.out.print("Inserisci un double: ");
        double d = scanner.nextDouble();

        System.out.println("\nValori inseriti:");
        System.out.println("String: " + str);
        System.out.println("Char: " + ch);
        System.out.println("Boolean: " + bool);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        double intToDouble = i;
        int doubleToInt = (int) d;

        System.out.println("\nConversioni:");
        System.out.println("int -> double: " + intToDouble);
        System.out.println("double -> int: " + doubleToInt);

        scanner.close();
    }
}
