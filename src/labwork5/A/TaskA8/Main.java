package labwork5.A.TaskA8;

public class Main {
    public static void main(String[] args) {
        LaserPrinter laserPrinter = new LaserPrinter("Pantum",1200,1200,"white",20,
                1000,5,
                1000,10,100);

        laserPrinter.display();
        laserPrinter.print();
        laserPrinter.print(10);
        laserPrinter.printColored();
        laserPrinter.printColored(10);
        laserPrinter.display();
        laserPrinter.print(1000);


    }
}
