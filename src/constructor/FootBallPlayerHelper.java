package constructor;

public class FootBallPlayerHelper {
    public static void main(String[] args) {

        FootBallPlayer footBallPlayer = new FootBallPlayer();
        FootBallPlayer footBallPlayer1 = new FootBallPlayer();

        footBallPlayer.setName("Bob");
        System.out.println(footBallPlayer.getName());

        footBallPlayer1.setGender("male");
        System.out.println(footBallPlayer1.getGender());

        footBallPlayer.setPointsScored(3);
        System.out.println(footBallPlayer.getPointsScored());

        footBallPlayer1.setName("Bear");
        System.out.println(footBallPlayer1.getName());

        footBallPlayer.setGender("male");
        System.out.println(footBallPlayer.getGender());

        footBallPlayer1.setPointsScored(2);
        System.out.println(footBallPlayer1.getPointsScored());
    }
    }

