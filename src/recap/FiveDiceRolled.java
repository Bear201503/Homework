package recap;

import java.util.Random;

public class FiveDiceRolled {
    public static void main(String[] args) {


        Random random = new Random();
        System.out.println(random.nextInt());

        for(int i = 0; i<=29; i++){
            int e = random.nextInt(25);

            while(e<=5){
                e = random.nextInt(25);

            }

            System.out.println("Dice rolled a " + e);
        }


    }
}
