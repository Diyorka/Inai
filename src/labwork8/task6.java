package labwork8;

import java.util.*;

public class task6 {
    public static void main(String[] args) {
        Map<String, Date> map = new HashMap<>();
        map.put("Умурзаков", new Date("October 20 2004"));
        map.put("Солибаев", new Date("October 31 2004"));
        map.put("Голощапов", new Date("January 14 2001"));
        map.put("Иванов", new Date("July 15 1995"));
        map.put("Петров", new Date("June 29 1994"));
        map.put("Семенов", new Date("August 11 1999"));
        map.put("Гулев", new Date("April 27 2003"));
        map.put("Тажибаев", new Date("February 5 1997"));
        map.put("Крид", new Date("March 22 1980"));
        map.put("Ворона", new Date("May 14 2001"));

        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Date value = iterator.next().getValue();
            int month = value.getMonth();
            if(month == 5 || month == 6 || month == 7)
                iterator.remove();
        }

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
