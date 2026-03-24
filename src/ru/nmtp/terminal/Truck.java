package ru.nmtp.terminal;

public class Truck {
    public String licensePlate; // Номерной знак автомобиля
    public String cargoType; // Тип груза (Зерно, Контейнер и так далее)
    public int weight; // в тоннах

    public Truck(String licensePlate, String cargoType, int weight) {
        this.licensePlate = licensePlate;
        this.cargoType = cargoType;
        this.weight = weight;
    }
}
