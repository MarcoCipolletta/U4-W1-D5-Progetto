package it.epicode.esercizio;

public class Audio extends Playable{
    public Audio(String title, int duration, int volume) {
        super(title, duration, volume);
    }

    @Override
    public void play(){
        for (int i = 0; i < getDuration(); i++) {
            System.out.println(getTitle() + " " + "!".repeat(getVolume()));
        }
    };

    @Override
    public void display() {
        play();
    }
}
