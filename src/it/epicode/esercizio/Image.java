package it.epicode.esercizio;

import it.epicode.esercizio.interfaces.IBrightness;

public class Image extends MultimediaElement implements IBrightness {
    private int brightness;

    public Image(String titolo, int brightness) {
        super(titolo);
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;
    }

    @Override
    public void increaseBrightness() {
        if (brightness == 10) {
            System.out.println("Hai raggiunto la luminosità massima!");
        } else {
            brightness++;
        }

    }

    @Override
    public void decreaseBrightness() {
        if (brightness == 0) {
            System.out.println("Hai raggiunto la luminosità minima!");
        } else {
            brightness--;
        }
    }

    public void show(){
        System.out.println(getTitle() + " " + "*".repeat(getBrightness()));
    }
    @Override
    public void display() {
        show();
    }
}
