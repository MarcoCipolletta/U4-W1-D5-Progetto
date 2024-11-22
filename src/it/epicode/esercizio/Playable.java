package it.epicode.esercizio;

import it.epicode.esercizio.interfaces.IVolume;

public abstract class Playable extends MultimediaElement implements IVolume {
    private int duration;
    private int volume;
    public Playable(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void increaseVolume() {
        if (volume == 10) {
            System.out.println("Hai raggiunto il volume massimo!");
        } else {
            volume++;
        }
    }

    @Override
    public void decreaseVolume() {
        if (volume == 0) {
            System.out.println("Hai raggiunto il volume minimo!");
        } else {
            volume--;
        }
    }

    public int getDuration() {
        return duration;
    }

    public abstract  void play();

}
