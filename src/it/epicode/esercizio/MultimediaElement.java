package it.epicode.esercizio;

public abstract class MultimediaElement {
    private String title;

    public MultimediaElement(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public abstract  void display();
}
