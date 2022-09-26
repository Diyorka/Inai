package labwork4.B8.carriages;

public class EconomClassCarriage implements Carriage {
    private int id;
    private int passengersNumber;
    private double goodsWeight;
    private int comfortLevel;

    public EconomClassCarriage(int id, int passengersNumber, double goodsWeight, int comfortLevel) {
        this.id = id;
        this.passengersNumber = passengersNumber;
        this.goodsWeight = goodsWeight;
        this.comfortLevel = comfortLevel;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    @Override
    public double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    @Override
    public int getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    @Override
    public String toString() {
        return "EconomClassCarriage{" +
                "id=" + id +
                ", passengersNumber=" + passengersNumber +
                ", goodsWeight=" + goodsWeight +
                ", comfortLevel=" + comfortLevel +
                '}';
    }
}

