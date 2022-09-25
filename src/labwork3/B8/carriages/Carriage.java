package labwork3.B8.carriages;

public abstract class Carriage {
    private int carriageId;
    private int passengersNumber;
    private double goodsWeight;
    private int comfortLevel;


    public Carriage(int carriageId, int passengersNumber, double goodsWeight, int comfortLevel) {
        this.carriageId = carriageId;
        this.passengersNumber = passengersNumber;
        this.goodsWeight = goodsWeight;
        this.comfortLevel = comfortLevel;
    }

    public int getCarriageId() {
        return carriageId;
    }

    public void setCarriageId(int carriageId) {
        this.carriageId = carriageId;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = comfortLevel;
    }
}
