package it.epicode.esercizio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title;
        int volume;
        int brightness;
        int duration;
        ArrayList<MultimediaElement> elements = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Seleziona un opzione digitando il numero corrispondente:");
            System.out.println("1. Immagine");
            System.out.println("2. Audio");
            System.out.println("3. Video");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Seleziona il titolo dell' immagine");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    System.out.println("Imposta la luminosità con un valore tra 0 e 10 ");
                    brightness = scanner.nextInt();
                    if (brightness < 0) {
                        System.out.println("Hai inserito un valore troppo basso. Luminosità impostata a 0");
                        brightness = 0;
                    } else if (brightness > 10) {
                        System.out.println("Hai inserito un valore troppo alto. Luminosità impostata a 10");
                        brightness = 10;
                    }
                    Image image = new Image(title, brightness);
                    elements.add(image);
                    break;
                case 2:
                    System.out.println("Seleziona il titolo dell' audio");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    System.out.println("Imposta il volume con un valore tra 0 e 10 ");
                    volume = scanner.nextInt();
                    if (volume < 0) {
                        System.out.println("Hai inserito un valore troppo basso. Volume impostato a 0");
                        volume = 0;
                    } else if (volume > 10) {
                        System.out.println("Hai inserito un valore troppo alto. Volume impostato a 10");
                        volume = 10;
                    }
                    System.out.println("Imposta la durata");
                    duration = scanner.nextInt();
                    Audio audio = new Audio(title, duration, volume);
                    elements.add(audio);
                    break;
                case 3:
                    System.out.println("Seleziona il titolo del video");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    System.out.println("Imposta il volume con un valore tra 0 e 10 ");
                    volume = scanner.nextInt();
                    if (volume < 0) {
                        System.out.println("Hai inserito un valore troppo basso. Volume impostato a 0");
                        volume = 0;
                    } else if (volume > 10) {
                        System.out.println("Hai inserito un valore troppo alto. Volume impostato a 10");
                        volume = 10;
                    }
                    System.out.println("Imposta la luminosità con un valore tra 0 e 10 ");
                    brightness = scanner.nextInt();
                    if (brightness < 0) {
                        System.out.println("Hai inserito un valore troppo basso. Luminosità impostata a 0");
                        brightness = 0;
                    } else if (brightness > 10) {
                        System.out.println("Hai inserito un valore troppo alto. Luminosità impostata a 10");
                        brightness = 10;
                    }
                    System.out.println("Imposta la durata");
                    duration = scanner.nextInt();
                    Video video = new Video(title, duration, volume, brightness);
                    elements.add(video);
                    break;
                default:
                    System.out.println("Seleziona un opzione corretta");
                    i--;
                    break;
            }


        }
        ;

        while (true) {
            System.out.println("Quale elemento vuoi riprodurre?\nPer selezionarlo digita un numero da 1 a 5; se vuoi interrompere digita 0 ");
            int choice = scanner.nextInt();
            if (choice == 0) break;
            if (choice < 0 || choice > 5) {
                System.out.println("Hai digitato un numero non valido. Riprova!");
            } else {
                elements.get(choice - 1).display();
            }
        }
        scanner.close();
    }
}
