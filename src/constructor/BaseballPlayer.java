package constructor;

public class BaseballPlayer extends Object{

    @Override
    public String toString() {
        return "BaseballPlayer{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", pointsScored=" + pointsScored +
                '}';
    }

    public static void main(String[] args) {

        BaseballPlayer baseballPlayer1 = new BaseballPlayer();
        baseballPlayer1.setName("Rama");
        baseballPlayer1.setGender("male");
        baseballPlayer1.setPointsScored(5);
        System.out.println(baseballPlayer1);


        BaseballPlayer baseballPlayer = new BaseballPlayer();
        baseballPlayer.setName("Bear");
        baseballPlayer.setGender("male");
        baseballPlayer.setPointsScored(4);
        System.out.println(baseballPlayer);

    }
    private String name;
    private String gender;
    private int pointsScored;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public void setPointsScored(int pointsScored) {
        this.pointsScored = pointsScored;
    }
}
