package Five_Java_High_Level_Language_features;
enum Week {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

public class P93_EnumValuesTest {

    public static void main(String args[]) {
        for (Week w : Week.values()) {
            System.out.println(w.name() + ". "+w.ordinal());
        }
        System.out.println();
    }

}
