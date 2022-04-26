package org.launchcode.studio7;

public class Track {

    private int length;
    private String title;

    public Track(String aTitle){
        title = aTitle;
    }

    public Track(String aTitle, int aLength){
        title = aTitle;
        length = aLength;
    }

    //GETTERS & SETTERS
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
