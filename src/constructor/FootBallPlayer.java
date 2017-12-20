package constructor;

public class FootBallPlayer {

    private String name;
    private String gender;
    private int pointsScored;

    public FootBallPlayer(){
        System.out.println("Default Constructor");
    }
    public FootBallPlayer(String name, String gender, int pointsScored){
        this.name = name;
        this.gender = gender;
        this.pointsScored = pointsScored;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }
    public void setPointsScored(int pointsScored){
        this.pointsScored = pointsScored;
    }
    public int getPointsScored(){
        return this.pointsScored;
    }

    public static void main(String[] args) {

        FootBallPlayer footBallPlayer = new FootBallPlayer("bear", "male", 34);
        System.out.println(footBallPlayer.name+","+ footBallPlayer.gender+","+footBallPlayer.pointsScored);

        FootBallPlayer footBallPlayer1 = new FootBallPlayer("Rama", "male", 23);
        System.out.println(footBallPlayer1.name+","+ footBallPlayer1.gender+","+ footBallPlayer1+",");

        FootBallPlayer footBallPlayer2 = new FootBallPlayer("bob", "male", 33);
        System.out.println(footBallPlayer2.name+","+ footBallPlayer2.gender+","+footBallPlayer2.pointsScored);
    }


    }
