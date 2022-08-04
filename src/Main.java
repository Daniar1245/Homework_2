public class Main {
    public static void main(String[] args) {
        System.out.println(student(15, 25));

        System.out.println("Pancake recipe from Daniar");
        makePancake();

        formula();

        formulaGeometry();

        System.out.println(trueFalse(25, 16));

        System.out.println(fG(36, 15, true));

    }

    public static String student(double ageOfaPerson, double outsideTemperatura) {
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

    private static void makePancake() {
        System.out.println("Heat 3 cups of milk and dissolve the yeast in it.");
        System.out.println("Add 0.5 tablespoon of granulated sugar, salt,egg yolks, melted butter, mix.");
        System.out.println("Add 300g flour.");
        System.out.println("Knead the dough,cover it with a towel, put in a warm place for fermentation for 2 hours.");
        System.out.println("When the dough rises, dilute it with the remaining warmed milk.");
        System.out.println("Add the rest of the flour and sugar.");
        System.out.println("Beat the protein and gradually pour it into the dough.");
        System.out.println("Knead the dough again and let it rise.");
        System.out.println("Heat up the pan. Do not stir the dough during baking.");
        System.out.println("Fry the pancake on both sides until golden brown.");
    }

    public static void formula() {
        int a = 12;
        int n = 56;
        int d = 25;
        System.out.println("Answer:" + (a * n + d * (n - 1)));
    }

    public static void formulaGeometry() {
        int b1 = 6;
        int q = 2;
        int n = 6;
        System.out.println("Answer:" + (b1 * (Math.pow(q, n))));//возведение в квадрат

    }

    public static String trueFalse(int temperature, int ageOfStudent) {
        if (temperature >= 15 && temperature <= 30 && ageOfStudent >= 16 && ageOfStudent <= 100) {
            return "GO TO PICNIC";
        } else {
            return "Stay at home";
        }
    }

    public static String fG(int temperatureStudent, int age, boolean isSnow) {
        if (isSnow && temperatureStudent <= 20 && age <= 40) {
            return "Have a good walk";
        } else {
            return "Stay at home";
        }
    }
}




