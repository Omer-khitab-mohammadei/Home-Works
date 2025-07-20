package bmi;

public class computeBmI {

    private String name;
    private int age;
    private double weight;
    private double hight;

    public computeBmI(String name, int age, double weight, double hight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.hight = hight;
    }

    public computeBmI(String name, double weight, double hight) {
        this.name = name;
        this.weight = weight;
        this.hight = hight;
    }

    public double getBMI() {
        double result = weight / (hight * hight);
        return result;
    }

    public String getStatus() {
        double result = weight / (hight * hight);

        if (result >= 30.0) {
            return "Obese";
        } else if (result >= 25.0) {
            return "Over weight";
        } else if (result >= 18.5) {
            return "Normal";
        } else {
            return "Under weight";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

}
