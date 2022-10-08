package labwork5.A.TaskA8;

public class LaserPrinter extends Printer{

    private double powder;
    private double powderConsumption;
    private double temperature;

    public LaserPrinter(String mark, double width, double height, String color,
                        int pagesPerMinute, double paintsAmount, double paintsConsumption,
                        double powder, double powderConsumption, double temperature) {
        super(mark, width, height, color, pagesPerMinute, paintsAmount, paintsConsumption);
        this.powder = powder;
        this.powderConsumption = powderConsumption;
        this.temperature = temperature;
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void print() {
        if(powder > powderConsumption){
            super.print();
            highTemperature();
            powder -= powderConsumption;
        }else{
            System.out.println("not enough powder");
        }
    }

    @Override
    public void print(int amount) {
        if(powder > amount * powderConsumption){
            super.print(amount);
            highTemperature();
            powder -= amount * powderConsumption;
        }else{
            System.out.println("not enough powder");
        }


    }

    @Override
    public void printColored() {
        if(powder >powderConsumption){
            super.printColored();
            highTemperature();
            powder -=powderConsumption;
        }else{
            System.out.println("not enough powder");
        }
    }

    @Override
    public void printColored(int amount) {

        if(powder > amount * powderConsumption){
            super.printColored(amount);
            highTemperature();
            powder -= amount * powderConsumption;
        }else{
            System.out.println("not enough powder");
        }

    }
    public void highTemperature(){
        System.out.println("Temperature is " + temperature + "^C");
    }






    public double getPowder() {
        return powder;
    }

    public void setPowder(double powder) {
        this.powder = powder;
    }
    public void fillPowder(double powder){
        this.powder += powder;
    }

    public double getPowderConsumption() {
        return powderConsumption;
    }

    public void setPowderConsumption(double powderConsumption) {
        this.powderConsumption = powderConsumption;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "LaserPrinter{"+ super.toString() +
                ", powderConsumption=" + powderConsumption +
                ", temperature=" + temperature +
                '}';
    }
}
