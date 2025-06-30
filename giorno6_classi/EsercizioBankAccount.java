public class EsercizioBankAccount {
        private String accountHolderName;
        private double balance;

        // Costruttore
        public EsercizioBankAccount(String accountHolderName) {
            this.accountHolderName = accountHolderName;
            this.balance = 0.0; // saldo iniziale
        }

        // Metodo per depositare denaro
        public void deposit(double amount) {
            if (amount > 0) { // ovvero se importo è positivo
                balance += amount; //aggiungo al saldo attuale
                System.out.println("Deposito di €" + amount + " effettuato.");
            } else {
                System.out.println("Importo non valido per il deposito.");// se l 'importo non è positivo
            }
        }

        // Metodo per prelevare denaro
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {// ovviamente l importo da prelevare deve essere positivo (>0) ma minore o massimo uguale al denaro disponibile
                balance -= amount;
                System.out.println("Prelievo di €" + amount + " effettuato.");
            } else if (amount > balance) {// se importo > saldo
                System.out.println("Prelievo negato: saldo insufficiente.");
            } else {//se è negativo
                System.out.println("Importo non valido per il prelievo.");
            }
        }


        // Metodo per visualizzare il saldo
        public void displayBalance() {
            System.out.println("Titolare: " + accountHolderName);
            System.out.println("Saldo attuale: €" + balance);
            System.out.println(" ");
        }


        public static void main(String[] args) {
            EsercizioBankAccount conto1 = new EsercizioBankAccount("Mario Rossi");

            conto1.displayBalance();

            conto1.deposit(500.0);
            conto1.withdraw(200.0);
            conto1.withdraw(400.0); 
            conto1.deposit(-50.0);

            conto1.displayBalance();
        }
    }


