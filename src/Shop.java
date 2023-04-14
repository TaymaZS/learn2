import Shop.clothes.*;

import java.util.Arrays;

public class Shop {

    public Cash cash = new Cash();
    public Shorts shorts = new Shorts("Шорты", Arrays.asList("красный", "белый") , 1000);
    public Jeans jeans = new Jeans("Джинсы", Arrays.asList("красный", "белый"), 1200);
    public Hoodies hoodies = new Hoodies("Худи", Arrays.asList("красный", "белый"), 2200);
    public Cap cap = new Cap("Кепка", Arrays.asList("красный", "белый"), 500);

    public int counter = 0;
   public Shop() {
        System.out.println("1 - " + jeans.name);
        System.out.println("2 - " + hoodies.name);
        System.out.println("3 - " + shorts.name);
        System.out.println("4 - " + cap.name);


    }



    public Cloth getCloth (int selectedCloth) {
        if (selectedCloth == 1) {
            return jeans;
        } else if (selectedCloth == 2) {
            return hoodies;
        }
        else if (selectedCloth == 3) {
            return shorts;
        }
        else if (selectedCloth == 4) {
            return cap;
        } else
            return null;
        }

        public void showColorCloth(Cloth cloth) {
            for (int i = 0; i < cloth.color.size(); i++) {
                System.out.println("Номер цвета " + i + " " + cloth.color.get(i));
            }


        }
        public void sell(Cloth cloth) {
            Cash.balance = Cash.balance - cloth.price;
        }

        public void discount(Cloth cloth) {

            Cash.balance = Cash.balance - (cloth.price / 2) ;
        }
}



