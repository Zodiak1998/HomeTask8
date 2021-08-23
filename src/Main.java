import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static Comparator<Baggage> sortList;

    public static void main(String[] args) {
        List<Baggage> list = new ArrayList<>();

        list.add(new Baggage("Aeroflot", 56, "Eco"));
        list.add(new Baggage("S7", 150, "Business"));
        list.add(new Baggage("American Airlines", 100, "First"));
        list.add(new Baggage("Red Wings", 52, "Eco"));

        sortList = Comparator.comparingInt(p -> p.weight);
        list.sort(sortList);
        System.out.println(list);

        System.out.println("====================");

        Comparator<Baggage> sortList2 = new Comparator<Baggage>() {
            @Override
            public int compare(Baggage o1, Baggage o2) {

                return Integer.compare(o1.nameOfPorter.length() + o1.classOfFly.length(), o2.nameOfPorter.length() + o2.classOfFly.length());

            }
        };
        list.sort(sortList2);
        System.out.println(list);

    }
}
