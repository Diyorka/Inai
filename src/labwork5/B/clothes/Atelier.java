package labwork5.B.clothes;

public class Atelier {
    public void dressWoman(Clothes[] clothes){
        System.out.println("Женская одежда:");
        for(Clothes clothes1 : clothes){
            if(clothes1 instanceof WomensClothes){
                System.out.println(clothes1);
            }
        }
    }

    public void dressMan(Clothes[] clothes){
        System.out.println("Мужская одежда:");
        for(Clothes clothes1 : clothes){
            if(clothes1 instanceof MensClothes){
                System.out.println(clothes1);
            }
        }
    }
}
