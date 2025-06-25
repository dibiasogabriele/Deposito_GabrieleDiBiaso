import java.util.Scanner;



public class ProvaMat {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input dati
            System.out.print("Inserisci l'età dell'atleta: ");
            int eta = scanner.nextInt();

            System.out.print("Inserisci il miglior tempo sui 100 metri (in secondi): ");
            double tempo100 = scanner.nextDouble();

            System.out.print("Inserisci il peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Inserisci l'altezza (in centimetri): ");
            double altezzaCm = scanner.nextDouble();
            double altezza = altezzaCm / 100.0;  // Conversione in metri

            // Calcolo BMI
            double bmi = peso / Math.pow(altezza, 2);
            double bmiArrotondato = Math.round(bmi * 100.0) / 100.0;

            // Verifica condizioni
            boolean etaValida = (eta >= 18 && eta <= 40);
            boolean tempoValido = (tempo100 < 12);
            boolean bmiValido = (bmi < 25);

            System.out.println("BMI calcolato: " + bmiArrotondato);

            // Controllo finale
            if (etaValida && tempoValido && bmiValido) {
                System.out.println("Ammesso alla gara");
            } else {
                System.out.println("Non ammesso alla gara");
            }

            scanner.close();
        }
    }
