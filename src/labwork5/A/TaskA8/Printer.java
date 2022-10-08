package labwork5.A.TaskA8;

public abstract class Printer implements PrintingDevice{

    private String mark;
    private double width;
    private double height;
    private String color;
    private int pagesPerMinute;
    private double paintsAmount;
    private double paintsConsumption;

    public Printer(String mark, double width, double height, String color, int pagesPerMinute,
                   double paintsAmount,double paintsConsumption) {
        this.mark = mark;
        this.width = width;
        this.height = height;
        this.color = color;
        this.pagesPerMinute = pagesPerMinute;
        this.paintsAmount = paintsAmount;
        this.paintsConsumption = paintsConsumption;
    }



    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void print() {
        System.out.println("Printer is printing in white and black");
    }
    @Override
    public void print(int amount) {
        System.out.println("Printer is printing " + amount + " pages in white and black");
    }

    @Override
    public void printColored() {
        if(paintsAmount > paintsConsumption){
            System.out.println("Printer is printing in colored");
            paintsAmount -= paintsConsumption;
        }else{
            System.out.println("Not enough paints");
        }


    }

    @Override
    public void printColored(int amount) {
        if(paintsAmount > amount * paintsConsumption){
            System.out.println("Printer is printing " + amount + " pages in colored");
            paintsAmount -= amount*paintsConsumption;
        }else{
            System.out.println("Not enough paints");
        }

    }


    @Override
    public String toString() {
        return "Printer{" +
                "mark='" + mark + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", pagesPerMinute=" + pagesPerMinute +
                ", paintsAmount=" + paintsAmount +
                ", paintsConsumption=" + paintsConsumption +
                '}';
    }

    public double getPaintsAmount() {
        return paintsAmount;
    }

    public void setPaintsAmount(double paintsAmount) {
        this.paintsAmount = paintsAmount;
    }
    public void fillPaintsAmount(double paintsAmount){
        this.paintsAmount += paintsAmount;
    }

    public double getPaintsConsumption() {
        return paintsConsumption;
    }

    public void setPaintsConsumption(double paintsConsumption) {
        this.paintsConsumption = paintsConsumption;
    }

    public int getPagesPerMinute() {
        return pagesPerMinute;
    }

    public void setPagesPerMinute(int pagesPerMinute) {
        this.pagesPerMinute = pagesPerMinute;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
