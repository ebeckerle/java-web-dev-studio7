package org.launchcode.studio7;

import java.util.ArrayList;

//import static java.lang.String.indexOf;

public abstract class MediaDisc implements Disc{

    private String discName;
    private int discCapacity;
    private int yearReleased;
    private ArrayList<Track> trackList;
    private int trackCount;
    private boolean beingSpun;
    private boolean beingPlayed;

    public MediaDisc(String discName, int yearReleased, ArrayList<Track> trackList){
        this.discName = discName;
        this.yearReleased = yearReleased;
        this.trackList = trackList;
        this.trackCount = trackList.size();
        this.beingSpun = false;
        this.beingPlayed = false;
    }

    //GETTERS & SETTERS
    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public int getDiscCapacity() {
        return discCapacity;
    }

    public void setDiscCapacity(int discCapacity) {
        this.discCapacity = discCapacity;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public ArrayList<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(ArrayList<Track> trackList) {
        this.trackList = trackList;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public boolean isBeingSpun() {
        return beingSpun;
    }

    public void setBeingSpun(boolean beingSpun) {
        this.beingSpun = beingSpun;
    }

    public boolean isBeingPlayed() {
        return beingPlayed;
    }

    public void setBeingPlayed(boolean beingPlayed) {
        this.beingPlayed = beingPlayed;
    }
//METHODS


    @Override
    public void spinDisc() {
        this.beingSpun = true;
    }


    public void playDisc(){
        if (beingSpun) {
            for (Track track :
                    trackList) {
                System.out.println(track.getTitle());
            }
        }else{
            System.out.println("Error: must start disc spinning first.");
        }
    }

    public void playTrack(Track aTrack){
        if (beingSpun) {
            System.out.println(aTrack.getTitle());
        }else{
            System.out.println("Error: must start disc spinning first.");
        }
    }

    public void displayDiscInfo(){

    }

    public void skipTrack(Track currentTrack){
        int currentTrackIndex = 0;
        int nextTrackIndex;
        if (beingSpun && beingPlayed){
            for (Track aTrack:
                 trackList) {
                if(aTrack.equals(currentTrack)){
                    currentTrackIndex = indexOf(aTrack);
                }
            }
        }
        nextTrackIndex = currentTrackIndex++;
        System.out.println(trackList.get(nextTrackIndex).toString());
    }

    private int indexOf(Track aTrack) {
        return indexOf(aTrack);
    }

}
