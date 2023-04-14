import Shop.clothes.Cash;
import Shop.clothes.Cloth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер одежды которую хотите купить:");
            int selectedCloth = scanner.nextInt();
            Cloth cloth = shop.getCloth(selectedCloth);
            shop.getCloth(selectedCloth);
            System.out.println("Вы выбрали одежду:" + cloth.name);

            System.out.println("Выберите цвет одежды ");
            shop.showColorCloth(cloth);
            Scanner scannerColor = new Scanner(System.in);
            int selectedClothColor = scanner.nextInt();
            shop.counter++;
            System.out.println(shop.counter);
            System.out.println("Вы выбрали цвет " + cloth.color.get(selectedClothColor));


            if (shop.counter >= 3) {
                System.out.println("Вы получили скидку 50%");
                shop.discount(cloth);
                System.out.println(Cash.balance + " с учетом скидки");
            } else {
                shop.sell(cloth);
                System.out.println(Cash.balance);
            }
            if (Cash.balance <= 0) {
                System.out.println("У вас закончились бабки");
                break;
            }
        }
        System.out.println(shop.counter);

    }
}