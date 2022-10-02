import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lesson1Files {
    public static void main(String[] args) throws IOException {

    }

    public static void task1() throws IOException {
//        FileWriter fw = new FileWriter("NewFile.txt");
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            fw.write(sc.nextLine()+"\n"); //Example: Umurzakov 2015 3525353
//        }
//        fw.close();

        FileReader fr = new FileReader("NewFile.txt");
        List<String> people = new ArrayList<>();
        Scanner sc = new Scanner(fr);
        Scanner in = new Scanner(System.in);

        while(sc.hasNextLine()){
            people.add(sc.nextLine());
        }
        fr.close();

        System.out.print("Write surname: ");
        String surname = in.nextLine();
        for (int i = 0; i < people.size(); i++) {
            if(people.get(i).split(" ")[0].equals(surname)){
                System.out.println(surname+"'s number: "+people.get(i).split(" ")[2]);
            }
        }

        System.out.print("Write start year: ");
        int year = Integer.parseInt(in.nextLine()), c=0;
        for (int i = 0; i < people.size(); i++) {
            if(Integer.parseInt(people.get(i).split(" ")[1])>=year){
                c++;
            }
        }
        System.out.println("Count of phones since "+year+": "+c);
    }
    public static void task2() throws IOException {
        FileReader fr = new FileReader("NewFile1.txt");
        List<String> xy = new ArrayList<>();
        Scanner sc = new Scanner(fr);
        Scanner in = new Scanner(System.in);

        while(sc.hasNextLine()){
            xy.add(sc.nextLine());
        }
        fr.close();

        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < xy.size(); i++) {
            for (int j = 0; j < xy.size(); j++) {
                if(!xy.get(i).equals(xy.get(j))){
                    double x1 = Integer.parseInt(xy.get(i).split(" ")[0]);
                    double y1 = Integer.parseInt(xy.get(i).split(" ")[1]);
                    double x2 = Integer.parseInt(xy.get(j).split(" ")[0]);
                    double y2 = Integer.parseInt(xy.get(j).split(" ")[1]);

                    double raz = Math.sqrt(Math.pow(x1+x2, 2)+Math.pow(y1+y2, 2));

                    if(min > raz){
                        min = raz;
                    }else if(max < raz){
                        max = raz;
                    }
                }
            }
        }
        System.out.println(Math.round(min));
        System.out.println(max);

    }
    public static void task3() throws IOException {
        int maxLength = 0;
        int linesCount = 0;
        BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
        List<char[]> list = new ArrayList<>();
        maxLength = 0;
        while(reader.ready()){
            char[] token = reader.readLine().toCharArray();
            if(token.length > maxLength){
                maxLength = token.length;
            }
            list.add(token);
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));
        linesCount = 0;
        for (int i = 0; i < maxLength; i++) {
            linesCount = 0;
            for (int j = 0; j < list.size(); j++) {

                char[] line = list.get(j);
                if(line.length <= i){
                    writer.write("@");
                }else{
                    writer.write(line[i]);
                }
                linesCount++;
            }

        }
        writer.close();

        BufferedReader reader1 = new BufferedReader(new FileReader("file2.txt"));
        String s = reader1.readLine();
        List<char[]> strings = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            char[] chars = new char[linesCount];
            for (int j = 0; j < linesCount; j++) {
                if(s.charAt(linesCount*i + j) == '@') chars[j] = ' ';
                else chars[j] = s.charAt(linesCount*i + j);
            }
            strings.add(chars);
        }
        reader1.close();
        String[] ss = new String[linesCount];

        for (int i = 0; i < strings.size(); i++) {

            for (int j = 0; j < strings.get(i).length; j++) {
                if(i == 0) ss[j] = "";
                ss[j] = ss[j] +  strings.get(i)[j];
            }

        }
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);

        }

    }
    public static void task4() throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));

        while(reader.ready()){

            String line = reader.readLine();
            if(line.length() == 0) continue;
            else if(line.length() > n){
                line = line.substring(0,n);}
            else if(line.length() < n){
                line = line + String.join("", Collections.nCopies(n - line.length(), " "));
            }
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }

        writer.close();
        reader.close();
    }
    public static void task5() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
        List<String[]> list = new ArrayList<>();
        while(reader.ready()){
            String[] line = reader.readLine().split(" ");
            if(Integer.parseInt(line[1]) >= 4){
                line[0] = line[0].toUpperCase();
            }
            list.add(line);

        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("file1.txt"));
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i)[0] + " " + list.get(i)[1]);
            writer.newLine();
        }
        writer.close();
    }
    public static void task6() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.1txt"));
        List<String[]> list = new ArrayList<>();
        while(reader.ready()){
            String[] line = reader.readLine().split(" ");
            int counter = 0;
            String last = line[0];
            int lastIndex = 0;
            for (int i = 0; i < line.length; i++) {
                if(line[i].length() >= 3 && line[i].length() <= 5){
                    last = line[i];
                    lastIndex = i;
                    line[i] = "";
                    counter++;
                }
            }
            if (counter % 2 != 0){
                line[lastIndex] = last;
            }
            list.add(line);
        }
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter("file1.txt"));
        for (int l = 0; l < list.size(); l++) {

            String line = String.join(" ",list.get(l));
            writer.write(line);
            writer.newLine();

        }

        writer.close();
    }
    public static void task7() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("filef.txt"));
        String s = "Ipsum";

        List<String> list = new ArrayList<>();
        String prev = "";
        while(reader.ready()){
            String line = reader.readLine();

            if(prev.equals("")){
                if(line.contains(s)){
                    list.add(line);
                }
            }else{
                if(line.contains(s)){
                    list.add(line);
                    prev = line;
                    continue;
                }
                if(prev.contains(s)){
                    if(line.contains(s)){
                        list.add(line);
                    }
                }else{
                    String doubleLine;
                    if (prev.endsWith("-")){
                        doubleLine = prev.substring(0,prev.length()-1) + "" + line;
                    }else{
                        doubleLine = prev + " " + line;
                    }

                    if(doubleLine.contains(s)){
                        list.add(prev);
                        list.add(line);
                    }


                }
            }
            prev = line;
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("fileg.txt"));
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i));
            writer.newLine();
        }
        writer.close();
    }
    public static void task8() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
        List<String> list = new ArrayList<>();
        int max = 0;
        while(reader.ready()){
            String line = reader.readLine();
            if(max < line.length()){
                max = line.length();
            }
            list.add(line);
        }
        reader.close();
        BufferedWriter writer =new BufferedWriter(new FileWriter("file1.txt"));
        for (int i = 0; i < list.size(); i++) {
            String newLine = String.join("", Collections.nCopies(max - list.get(i).length(), " ")) + list.get(i);
            writer.write(newLine);
            writer.newLine();
        }
        writer.close();
    }
}
