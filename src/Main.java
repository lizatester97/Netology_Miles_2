public class Main {
    public static void main(String[] args) {
        int ticket_cost = 23789;
        int rub_for_mile = 20;

        int bonus_miles = ticket_cost / rub_for_mile;

        System.out.println("Стоимость билета: " + ticket_cost + " RUB");
        System.out.println("Цена одной бонусной мили: " + rub_for_mile + " RUB");
        System.out.println();
        System.out.println("Количество начисленных бонусных миль: " + bonus_miles);
        
    }
}