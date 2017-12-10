package constructor;

public class VolleyBallPlayer {

    private String name;
    private String gender;
    private int jerseyNumber;
    private int pointsScored;

    public VolleyBallPlayer(){
        System.out.println("Default Constructor");
    }
    public VolleyBallPlayer(String name, String gender, int jerseyNumber, int pointsScored){
        this.name = name;
        this.gender = gender;
        this.jerseyNumber = jerseyNumber;
        this.pointsScored = pointsScored;
    }

    public static void main(String[] args) {

        VolleyBallPlayer volleyBallPlayer = new VolleyBallPlayer("Esha", "female", 15, 4);
        System.out.println(volleyBallPlayer.name+", " + volleyBallPlayer.gender+", " + volleyBallPlayer.jerseyNumber+", " + volleyBallPlayer.pointsScored);

        VolleyBallPlayer volleyBallPlayer1 = new VolleyBallPlayer("Shreya", "female", 12, 3);
        System.out.println(volleyBallPlayer1.name+", " + volleyBallPlayer1.gender+", " + volleyBallPlayer1.jerseyNumber+", " + volleyBallPlayer1.pointsScored);

        VolleyBallPlayer volleyBallPlayer2 = new VolleyBallPlayer("Bear", "male", 2, 3);
        System.out.println(volleyBallPlayer2.name+", " + volleyBallPlayer2.gender+", " + volleyBallPlayer2.jerseyNumber+", " + volleyBallPlayer2.pointsScored);

        volleyBallPlayer.setPointsScored(5);
        System.out.println(volleyBallPlayer.name+", " + volleyBallPlayer.gender+", " + volleyBallPlayer.jerseyNumber+", " + volleyBallPlayer.pointsScored);

        volleyBallPlayer1.setPointsScored(4);
        System.out.println(volleyBallPlayer1.name+", " + volleyBallPlayer1.gender+", " + volleyBallPlayer1.jerseyNumber+", " + volleyBallPlayer1.pointsScored);

        volleyBallPlayer2.setPointsScored(4);
        System.out.println(volleyBallPlayer2.name+", " + volleyBallPlayer2.gender+", " + volleyBallPlayer2.jerseyNumber+", " + volleyBallPlayer2.pointsScored);

    }
    public void setPointsScored(int pointsScored){
    this.pointsScored = pointsScored;
    }

}
