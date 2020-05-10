public class Main {
    public static void main(String[] args)

    {
    //задаем стоимость билета ticket_price
    float ticket_price = 5445;
    //задаем сумму за одну бонусную милю
    int mile_bonus = 20;

    //узнаем сколько миль получим за билет стоимостью 5445 рублей
    float mileage_per_ticket = ticket_price / mile_bonus;
        System.out.println(mileage_per_ticket);
}

}
