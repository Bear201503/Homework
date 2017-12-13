package constructor;

public class GolfPlayer {

    private String name;
    private String gender;
    private int pointsScored;

    public GolfPlayer(){
        System.out.println("Default Constructor");
    }
    public GolfPlayer(String name, String gender, int pointsScored){
        this.name=name;
        this.gender=gender;
        this.pointsScored= pointsScored;

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
        GolfPlayer golfPlayer = new GolfPlayer();
        System.out.println(golfPlayer.name+", " + golfPlayer.gender+", "+ golfPlayer.pointsScored);

        GolfPlayer golfPlayer1 = new GolfPlayer();
        System.out.println(golfPlayer1.name+", " + golfPlayer1.gender+", "+ golfPlayer1.pointsScored);



    }
    }

