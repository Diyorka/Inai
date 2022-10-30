package labwork8;

import java.util.HashSet;
import java.util.Set;

public class task4 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String [] s = {"лето", "лиса", "локоть","лепесток","летчик", "лекарь","лоб","лес", "лопата", "лом",
                        "лето", "лиса", "локоть","лепесток","летчик", "лекарь","лоб","лес", "лопата", "лом"};
        for (int i = 0; i < 20; i++) {
            set.add(s[i]);
        }
        System.out.println(set);
    }
}
