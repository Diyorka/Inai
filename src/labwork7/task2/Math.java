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
            try{
                sum += Double.parseDouble(element.toString());
            }catch (Exception e){
                System.out.println("Массив содержит не числовой тип данных!");
            }
        }
        System.out.println("Сумма числовых элементов массива: " + sum);
    }
}
