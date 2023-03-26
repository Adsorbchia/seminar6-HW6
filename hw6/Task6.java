package org.example.seminar6.hw6;

import org.example.seminar6.model.FilterLaptop;
import org.example.seminar6.model.Laptop;
import java.util.Map;
import java.util.*;

public class Task6 implements FilterLaptop{
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Черный",14.0,60,"HD",
                "CoreI3",4,"HDD","Lenovo", 35.000);
        Laptop laptop2 = new Laptop("Синий",15.6,60,
                "FullHD","CoreI5",8,"SSD","Acer",70.000);
        Laptop laptop3 = new Laptop("Белый",17.0,120,"2К",
                "CoreI7",32,"SSD","MSI",100.000);
        Laptop laptop4 = new Laptop("Черный",17.0,150,"2К",
                "CoreI5",16,"SSD","Acer",120.000);
        Laptop laptop5 = new Laptop("Черный",15.6,60,"FullHD",
                "CoreI5",8,"SSD","MSI",73.000);
        Laptop laptop6 = new Laptop("Черный",14.0,60,"FullHD",
                "CoreI3",8,"SSD","Lenovo",80.000);
        Laptop laptop7 = new Laptop("Розовый",15.6,120,"4К",
                "CoreI7",16,"SSD","MSI",150.000);
        Laptop laptop8 = new Laptop("Белый",17.0,120,"2К",
                "CoreI5",16,"SSD","HONOR",120.000);
        Laptop laptop9 = new Laptop("Черный",13.3,60,"FullHD",
                "CoreI3",4,"HDD","HP",30.000);
        Laptop laptop10 = new Laptop("Черный",17.0,150,"4К",
                "CoreI7",32,"SSD","HONOR",150.000);
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);
        laptopList.add(laptop6);
        laptopList.add(laptop7);
        laptopList.add(laptop8);
        laptopList.add(laptop9);
        laptopList.add(laptop10);
        Map laptopMap = new HashMap<>();
        System.out.printf("Выберите критерий фильтрации");
        System.out.println("1- Цвет");
        System.out.println("2- Размер дисплея");
        System.out.println("3- частота обнавления экрана");
        System.out.println("4- Разрешение экрана");
        System.out.println("5- Процессор");
        System.out.println("6- Объём оперативной памяти");
        System.out.println("7- Тип жесткого диска");
        System.out.println("8- Производитель");
        System.out.println("9- Цена");
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        String filterKey="";
        switch (num){
            case 1:
                filterKey="color";
                System.out.println("Введите цвет");
                String color = scr.next();
                laptopMap.put(filterKey,color);
                break;
            case 2:
                filterKey="screenDiagonal";
                System.out.println("Введите размер дислея");
                double screenDiagonal;
                screenDiagonal = scr.nextDouble();
                laptopMap.put(filterKey,screenDiagonal);
                break;
            case 3:
                filterKey="screenRefreshRate";
                System.out.println("Введите частоту обнавления экрана");
                int screenRefreshRate =scr.nextInt();
                laptopMap.put(filterKey,screenRefreshRate);
                break;
            case 4:
                filterKey="screenResolution";
                System.out.println("Введите Разрешение экрана");
                String screenResolution= scr.next();
                laptopMap.put(filterKey,screenResolution);
                break;
            case 5:
                filterKey="processor";
                System.out.println("Введите тип процессора");
                String processor = scr.next();
                laptopMap.put(filterKey,processor);
                break;
            case 6:
                filterKey="ram";
                System.out.println("Введите Объём оперативной памяти");
                int ram=scr.nextInt();
                laptopMap.put(filterKey,ram);
            case 7:
                filterKey="driveType";
                System.out.println("Введите тип жесткого диска");
                String driveType = scr.next();
                laptopMap.put(filterKey,driveType);
                break;
            case 8:
                filterKey = "manufacturer";
                System.out.println("Введите Производителя");
                String manufacturer = scr.next();
                laptopMap.put(filterKey,manufacturer);
                break;
            case 9:
                filterKey = " price";
                System.out.println("Введите цену");
                double price = scr.nextDouble();
                laptopMap.put(filterKey,price);
                break;
        }
        List<Laptop> filteredLaptop = FilterLaptop.filter(laptopList,laptopMap);
        if (filteredLaptop.size()==0){
            System.out.println("Нет ноутбуков, удовлетворяющим критериям фильтрации");
        }
        else {
            for (Laptop el:filteredLaptop) {
                System.out.println(el.getColor()+" "+ el.getScreenDiagonal()+" "+ el.getScreenRefreshRate()+" "+
                        el.getScreenResolution()+" "+ el.getProcessor()+" "+ el.getRam()+" "+ el.getDriveType()+
                        " "+ el.getManufacturer()+ " "+ el.getPrice());
            }
        }
        FilterLaptop.findMinFilter(filteredLaptop);
        }
    }


