package labwork5.B.shop;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();
        list.add(new Person("diyor", "1234"));
        list.add(new Person("aziz", "azizik"));

        Catalog catalogLaptops = new Catalog("Laptops", new Product[]{new Product("Thinkpad", 5),
        new Product("Macbook",7)});
        Catalog catalogPhones = new Catalog("Phones", new Product[]{new Product("Samsung", 3),
        new Product("iPhone", 15)});

        Catalog[] catalogs = {catalogLaptops, catalogPhones};

        System.out.println("Добро пожаловать в наш магазин!");
        System.out.println("Введите ваш логин: ");
        String login = sc.nextLine();
        System.out.println("Введите ваш пароль: ");
        String password = sc.nextLine();
        boolean flag = true;
        for(Person person : list){
            if(person.getUsername().equals(login) && person.getPassword().equals(password)){
                System.out.println("Вы успешно вошли!");
                break;
            }else{
                System.out.println("Вы ввели неправильный логин или пароль!");
                flag=false;
            }
        }

        Product basketProd = new Product();

        if(flag){
            System.out.println("Выберите каталог:");
            for (int i = 1; i <= catalogs.length; i++) {
                System.out.println(i + ". " + catalogs[i-1].getName());
            }
            int catNum = Integer.parseInt(sc.nextLine());
            if(catNum == 1){
                System.out.println("Наши товары:");
                for (Product product : catalogLaptops.products){
                    System.out.println(product.getName());
                }
                System.out.println("Введите название товара:");
                String prod = sc.nextLine();
                if(prod.equals("Thinkpad")){
                    System.out.println("Вы добавили Thinkpad в корзину!");
                    basketProd.setName("Thinkpad");
                    basketProd.setCount(1);
                }else{
                    System.out.println("Вы добавили Macbook в корзину!");
                    basketProd.setName("Macbook");
                    basketProd.setCount(1);
                }

            }else if(catNum == 2){
                System.out.println("Наши товары:");
                for (Product product : catalogPhones.products){
                    System.out.println(product.getName());
                }
                System.out.println("Введите название товара:");
                String prod = sc.nextLine();
                if(prod.equals("Samsung")){
                    System.out.println("Вы добавили Samsung в корзину!");
                    basketProd.setName("Samsung");
                    basketProd.setCount(1);
                }else{
                    System.out.println("Вы добавили iPhone в корзину!");
                    basketProd.setName("iPhone");
                    basketProd.setCount(1);
                }
            }

            System.out.println("Ваша корзина:");
            System.out.println(basketProd.getName());
            System.out.println();
            System.out.println("Выполнить покупку - 1");
            System.out.println("Отказаться от покупки - 0");
            int buyOrNot = Integer.parseInt(sc.nextLine());
            if(buyOrNot==1){
                System.out.println("Успешная покупка!");
            }else{
                System.out.println("Покупка не выполнена!");
                System.out.println("До свидания");
            }
        }


    }
}
