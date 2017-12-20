package recap;

import java.util.Random;

public class FourDiceRoll {  public static void main(String[] args) {


    Random random = new Random();
    System.out.println(random.nextInt());

    for(int i = 0; i<=23; i++){
        int e = random.nextInt(24);

        while(e<=4){
            e = random.nextInt(24);

        }

        System.out.println("Dice rolled a " + e);
    }


}
}
