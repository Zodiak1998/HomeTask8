
public class Baggage {
    public String nameOfPorter;
    public int weight;
    public int maxOfWeight = 150;
    public String classOfFly;

    public Baggage(String name, int weight, String classOfFly) {
        if (weight > this.maxOfWeight) System.err.println("Out of max weight");
        else {
            this.nameOfPorter = name;
            this.weight = weight;
            this.classOfFly = classOfFly;
        }
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "nameOfPorter='" + nameOfPorter + '\'' +
                ", weight=" + weight +
                ", maxOfWeight=" + maxOfWeight +
                ", classOfFly='" + classOfFly + '\'' +
                '}';
    }

}
