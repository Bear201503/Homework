package datatypes;

public class ArraysPractice {

    public static void main(String[] args) {


        String[] strArray = {"Esha", "Shreya", "Rama", "Suja"};

        for (String es: strArray){

            System.out.println("The names of the people in my family are " + es);
        }

        float[] fltArray={1.0f, 2.0f, 3.0f, 4.0f};
        for (float es: fltArray){
            System.out.println("Value of fltArray is " + es);
        }

    }
}
