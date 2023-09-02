/**
 * Фрилансер
 */
public class Freelancer extends Employee {

    public Freelancer(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    
    public double calculateSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s | Фрилансер | Возраст - %d | Расчётная З/П (Кол-во часов) %.2f",
                surName, name, age, salary);
    }
}
