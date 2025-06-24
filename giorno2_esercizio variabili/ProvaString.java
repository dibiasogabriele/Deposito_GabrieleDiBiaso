public class ProvaString {

        public static void main(String[] args) {
            String txt = "Hello World";

            // Cambiare tutte le lettere in maiuscolo
            System.out.println("toUpperCase(): " + txt.toUpperCase()); // "HELLO WORLD"

            // Cambiare tutte le lettere in minuscolo
            System.out.println("toLowerCase(): " + txt.toLowerCase()); // "hello world"

            // Trovare la posizione di una sottostringa
            String frase = "Please locate where 'locate' occurs!";
            System.out.println("indexOf(\"locate\"): " + frase.indexOf("locate")); // 7



            // Concatenare due stringhe
            String x = "10";
            String y = "20";
            System.out.println(x+y);



                String descrizione = "Articolo sulle stringhe ...";
                int length = descrizione.length();
                System.out.println("Lunghezza: "+length);

            }

        }






