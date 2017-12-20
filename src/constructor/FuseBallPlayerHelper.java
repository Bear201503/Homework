package constructor;

public class FuseBallPlayerHelper {
    public static void main(String[] args) {

        FuseBallPlayer fuseBallPlayer = new FuseBallPlayer();
        FuseBallPlayer fuseBallPlayer1 = new FuseBallPlayer();

        fuseBallPlayer.setName("Bob");
        System.out.println(fuseBallPlayer.getName());

        fuseBallPlayer.setGender("male");
        System.out.println(fuseBallPlayer.getGender());

        fuseBallPlayer.setPointsScored(3);
        System.out.println(fuseBallPlayer.getPointsScored());

        fuseBallPlayer1.setName("Bear");
        System.out.println(fuseBallPlayer1.getName());

        fuseBallPlayer1.setGender("male");
        System.out.println(fuseBallPlayer1.getGender());

        fuseBallPlayer1.setPointsScored(2);
        System.out.println(fuseBallPlayer1.getPointsScored());
    }
}
