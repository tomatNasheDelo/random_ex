import java.util.Random;
import java.util.UUID;


public class RandomWord {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            String randomWord = createRandomWord(6);
            System.out.println(randomWord);
        }

          System.out.println("-------------");

           System.out.println(randomNumber(100));
           System.out.println(randomNumber(100));
           System.out.println(usingUUID(10));
           
    }

   

      
    
      static  String usingUUID(int u){
    
            UUID randomU = UUID.randomUUID();
            return randomU.toString().replaceAll("-","").substring(0, u);
        }
    

    public static String createRandomWord(int len) {

        String name = "";
        for (int i = 0; i < len; i++) {
            int v = 1 + (int) (Math.random() * 26);
            char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
            name += c;
        }
        return name;
    }

    public static int randomNumber(int num){

           Random n = new Random();

         return  n.nextInt(num); 
    }

    public static int randMathR(int n){

          int m = (int) (Math.random() * n);

        return m;
    }
}