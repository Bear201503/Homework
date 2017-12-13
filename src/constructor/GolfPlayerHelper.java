package constructor;

public class GolfPlayerHelper {
    public static void main(String[] args) {

        GolfPlayer golfPlayer = new GolfPlayer();
        GolfPlayer golfPlayer1 = new GolfPlayer();

        golfPlayer.setName("Esha");
        System.out.println(golfPlayer.getName());

        golfPlayer.setGender("female");
        System.out.println(golfPlayer.getGender());

        golfPlayer.setPointsScored(3);
        System.out.println(golfPlayer.getPointsScored());

        golfPlayer1.setName("Shreya");
        System.out.println(golfPlayer1.getName());

        golfPlayer1.setGender("female");
        System.out.println(golfPlayer1.getGender());

        golfPlayer1.setPointsScored(2);
        System.out.println(golfPlayer1.getPointsScored());
    }
}
