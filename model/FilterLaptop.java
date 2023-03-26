package org.example.seminar6.model;



import javax.lang.model.element.VariableElement;
import java.util.*;

public interface FilterLaptop {
    static List<Laptop> filter(List<Laptop> laptopList, Map filters){
        List filteredLaptop=new ArrayList<>();
        for (Laptop el:laptopList) {
            boolean allFiltersMatch=true;
            for (Object filterKey:filters.keySet()) {
                Object filterValue = filters.get(filterKey);
                if (filterKey.equals("color")) {
                    if (!el.getColor().equals(filterValue)) {
                        allFiltersMatch = false;}
                }
                if (filterKey.equals("screenDiagonal")){
                    if (el.getScreenDiagonal()!= (double) filterValue){
                        allFiltersMatch=false;}
                }
                if (filterKey.equals("screenRefreshRate")){
                    if (el.getScreenRefreshRate() != (int) filterValue){
                        allFiltersMatch=false;
                    }
                }
                if (filterKey.equals("screenResolution")){
                    if ( !el.getScreenResolution().equals(filterValue)){
                        allFiltersMatch=false;
                    }
                }
                if (filterKey.equals("processor")){
                    if(!el.getProcessor().equals(filterValue)){
                        allFiltersMatch=false;
                    }
                }
                if (filterKey.equals("ram")){
                    if(el.getRam()!=(int) filterValue){
                        allFiltersMatch=false;
                    }
                }
                if (filterKey.equals("driveType")){
                    if(!el.getDriveType().equals(filterValue)){
                        allFiltersMatch=false;
                    }
                }
                if(filterKey.equals("manufacturer")){
                    if(!el.getManufacturer().equals(filterValue)){
                        allFiltersMatch=false;
                    }
                }
                if (filterKey.equals("price")){
                    if(el.getPrice()!=(double) filterValue){
                        allFiltersMatch=false;
                    }
                }
                if (!allFiltersMatch){
                    break;
                }
                if((allFiltersMatch)){
                    filteredLaptop.add(el);
                }
        }
        }return filteredLaptop;
}
    static void findMinFilter(List<Laptop> filteredLaptop){
        Map <String, Object>minLaptopList = new HashMap<>();

        int minScreenRefreshRate=0;
        int minRam=0;
        double minPrice=0;
        double minScreenDiagonal=0;

        for (int i = 0; i <filteredLaptop.size()-1 ; i++) {
            minScreenDiagonal=filteredLaptop.get(0).getScreenDiagonal();
            minScreenRefreshRate=filteredLaptop.get(0).getScreenRefreshRate();
            minRam=filteredLaptop.get(0).getRam();
            minPrice=filteredLaptop.get(0).getPrice();
            if (minScreenDiagonal>filteredLaptop.get(i).getScreenDiagonal()){
                minScreenDiagonal=filteredLaptop.get(i).getScreenDiagonal();
                minLaptopList.put("минимальный Размер дисплея",minScreenDiagonal);}
            else {
                minLaptopList.put("минимальный Размер дисплея",minScreenDiagonal);
            }

           if(minScreenRefreshRate>filteredLaptop.get(i).getScreenRefreshRate()){
               minScreenRefreshRate=filteredLaptop.get(i).getScreenRefreshRate();
               minLaptopList.put("минимальная частота обновления",minScreenRefreshRate);}
           else{
               minLaptopList.put("минимальная частота обновления",minScreenRefreshRate);
           }
           if (minRam>filteredLaptop.get(i).getRam()){
               minRam=filteredLaptop.get(i).getRam();
               minLaptopList.put("минимальный объём памяти",minRam);
           }
           else {
               minLaptopList.put("минимальный объём памяти",minRam);
           }

            if(minPrice>filteredLaptop.get(i).getPrice()){
                   minPrice=filteredLaptop.get(i).getPrice();
                   minLaptopList.put("минимальная цена",minPrice);}
            else {
                minLaptopList.put("минимальная цена",minPrice);
            }
            minRam=filteredLaptop.get(i).getRam();
            minScreenDiagonal=filteredLaptop.get(i).getScreenDiagonal();
            minScreenRefreshRate=filteredLaptop.get(i).getScreenRefreshRate();
            minPrice=filteredLaptop.get(i).getPrice();
        }
        for (var entry : minLaptopList.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());}
    }
}











