package ru.mirea.pkmn.AlievGM;
import ru.mirea.pkmn.Card;

import java.io.IOException;
import java.util.Scanner;

public class PkmnApplication {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("0 - Выход");
        System.out.println("1 - Импорт из текстового файла");
        System.out.println("2 - Импорт из бинарного файла");
        System.out.println("3 - Экспорт в бинарный файл");

        Card card = new Card();
        boolean flag = true;
        while (flag) {
            switch (scanner.nextInt()) {
                case 0:
                    flag = false;
                    break;

                case 1:
                    card = CardImport.importCard("src\\main\\resources\\my_card.txt");
                    System.err.println(card);
                    break;

                case 2:
                    card = CardImport.importCardByte("Magmortar.crd");
                    System.err.println(card);
                    break;

                case 3:
                    CardExport.exportCard(card);
                    break;
            }
        }
    }
}