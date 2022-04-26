package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends MediaDisc implements Disc {

    private ArrayList<String> menuDisplay;

    public DVD(String discName, int yearReleased, ArrayList<Track> trackList) {
        super(discName, yearReleased, trackList);
        setBeingSpun(false);
        setBeingPlayed(false);
        setDiscCapacity(1200);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void playDisc(){
        System.out.println("Play All");
        for (Track track:
                getTrackList()) {
            System.out.println(track.getTitle());
        }
    }

}
