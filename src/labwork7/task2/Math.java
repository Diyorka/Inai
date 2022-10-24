package labwork7.task2;

public class Math <T>{
    private T[] mas;

    public Math(T[] mas) {
        this.mas = mas;
    }

    public T[] getMas() {
        return mas;
    }

    public void setMas(T[] mas) {
        this.mas = mas;
    }

    public void sumNum(){
        double sum = 0;
        for (T element:mas){
            sum += Double.parseDouble(element.toString());
        }
        System.out.println(sum);
    }
}
