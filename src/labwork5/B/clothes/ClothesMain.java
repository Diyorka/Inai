package labwork5.B.clothes;

public class ClothesMain {
    public static void main(String[] args) {
        Clothes[] allClothes = {
                new TShirt(Sizes.M, "Синий", 2700),
                new Pants(Sizes.L, "Черный", 5500),
                new Skirt(Sizes.M, "Красный", 3400),
                new Tie(Sizes.M, "Черный", 500),
                new Pants(Sizes.M, "Синий", 5000),
                new TShirt(Sizes.S, "Красный", 2000)
        };

        Atelier atelier = new Atelier();
        atelier.dressMan(allClothes);
        System.out.println();
        atelier.dressWoman(allClothes);
    }
}
