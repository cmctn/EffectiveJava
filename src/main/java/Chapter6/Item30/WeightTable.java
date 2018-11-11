package Chapter6.Item30;

public class WeightTable {

    public static void main(String[] args) {

        double mass = Planet.EARTH.mass();
        System.out.println("EARTH's mass : " + mass);

        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));

        System.out.println(Planet.EARTH.toString());


    }
}