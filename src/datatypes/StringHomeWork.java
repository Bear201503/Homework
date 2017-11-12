package datatypes;

public class StringHomeWork {

    public static void main(String[] args) {

        String str, str1;

        str = "hello";
        str1 = "world";

        System.out.println(str);
        System.out.println(str1);

        System.out.println(str.concat(str1));

        System.out.println(str.substring(0,3));
        System.out.println(str.replace('l', 'i'));

        System.out.println("The length of hello is " + str.length());

        System.out.println(str.contains("o"));

        String str2 = "car-bike-trailer";

        System.out.println(str2.split("-"));

        String[] strings = str2.split("-");

        for(String string : strings){

            System.out.println("Split value is " + string);
        }






    }
}
