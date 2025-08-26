public class SwitchDemo {
    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Weekday");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
