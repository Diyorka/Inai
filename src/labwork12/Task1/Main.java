package labwork12.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Diyor", 18, 30000));
        people.add(new Person("Aziz", 19, 20000));
        people.add(new Person("Nikolay", 18, 25000));

        int sumAge = people.stream().mapToInt(Person::getAge).sum();
        int sumSalary = people.stream().mapToInt(Person::getSalary).sum();

        System.out.println("Сумма возрастов: " + sumAge);
        System.out.println("Сумма зарплат: " + sumSalary);
        System.out.println("Средний возраст: " + sumAge/people.size());
        System.out.println("Средняя зарплата: " + sumSalary/people.size());

    }
}
