package it.epicode.esercizio;

import it.epicode.esercizio.interfaces.IBrightness;

public class Video extends Playable implements IBrightness {
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title, duration, volume);
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

    @Override
    public void play() {
        for (int i = 0; i < getDuration(); i++) {
            System.out.println(getTitle() + " " + "!".repeat(getVolume()) + " " + "*".repeat(getBrightness()));
        }
    }

    @Override
    public void display() {
        play();
    }
}
