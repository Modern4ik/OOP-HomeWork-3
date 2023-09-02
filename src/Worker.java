/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee{
    public Worker(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s | Рабочий | Возраст - %d | Среднемесячная З/П (фиксированная) %.2f",
                surName, name, age, salary);
    }
}
