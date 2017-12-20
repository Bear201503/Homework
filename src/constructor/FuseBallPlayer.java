package constructor;

public class FuseBallPlayer {
    private String name;
    private String gender;
    private int pointsScored;

    public FuseBallPlayer(){
        System.out.println("Default Constructor");
    }
    public FuseBallPlayer(String name, String gender, int pointsScored){
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

        FuseBallPlayer fuseBallPlayer = new FuseBallPlayer("bear", "male", 5);
        System.out.println(fuseBallPlayer.name+","+ fuseBallPlayer.gender+","+fuseBallPlayer.pointsScored);

        FuseBallPlayer fuseBallPlayer1 = new FuseBallPlayer("Esha", "male", 7);
        System.out.println(fuseBallPlayer1.name+","+fuseBallPlayer1.gender+","+ fuseBallPlayer1+",");

        FuseBallPlayer fuseBallPlayer2 = new FuseBallPlayer("bob", "male", 2);
        System.out.println(fuseBallPlayer2.name+","+ fuseBallPlayer2.gender+","+fuseBallPlayer2.pointsScored);
    }

}

