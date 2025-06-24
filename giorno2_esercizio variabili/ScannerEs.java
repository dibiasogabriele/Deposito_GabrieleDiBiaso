import java.util.Scanner;

public class ScannerEs {
    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in); // crea oggetto scanner
        System.out.println("enter username");

        String userName = myObj.nextLine();  // legge l input dell utente
        System.out.println("username is: " + userName);
    }
}
