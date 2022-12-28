package ru.job4j.enumclass;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Status Toyota: " + toyota);
        System.out.println("Status Volvo: " + volvo);
        Order order = new Order(1, "Tesla", Status.WAITING);
        System.out.println("Заказ наряд №" + order.number() + " на автомобиль " + order.car()
                + ", статус ремонта: " + order.status().getInfo() + ", подробности: " + order.status().getMessage());
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", порядковый номер статуса: " + s.ordinal());
        }
    }
}
