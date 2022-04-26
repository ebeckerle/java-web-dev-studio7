package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends MediaDisc implements Disc {


    public CD(String discName, int yearReleased, ArrayList<Track> trackList) {
        super(discName, yearReleased, trackList);
        setBeingSpun(false);
        setBeingPlayed(false);
        setDiscCapacity(900);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


}
