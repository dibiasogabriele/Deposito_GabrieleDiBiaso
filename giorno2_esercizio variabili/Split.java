import java.util.Arrays;


public class Split {

        public static void main(String[] args){

            String str = "Hello World";
            String[] words = str.split("\\s");
            System.out.println(Arrays.toString(words));
        }
}
