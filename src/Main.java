public class Main {
    public static void main(String[] args) {
        System.out.println(student(15, 25));

        System.out.println(student(26, 46));
        System.out.println(student(45, 100));
        System.out.println(student(67, 34));
        System.out.println(student(23, 90));
        System.out.println(student(34, -12));

    }
    public static String student(int  ageOfaPerson, int  outsideTemperatura) {
        if (ageOfaPerson >= 20 && ageOfaPerson <= 45 && outsideTemperatura >= -20 && outsideTemperatura <= 30) {
            return "You can go for a walk";
        } else if (ageOfaPerson < 20 && outsideTemperatura >= 0 && outsideTemperatura <= 28) {
            return "You can go for a walk";
        } else if (ageOfaPerson > 45 && outsideTemperatura >= -10 && outsideTemperatura <= 25) {
            return "You can go for a walk";
        } else {
            return "Stay at home";
        }

    }
}

