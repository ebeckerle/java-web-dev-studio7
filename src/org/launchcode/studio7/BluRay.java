package org.launchcode.studio7;

import java.util.ArrayList;

public class BluRay extends MediaDisc implements Disc {

    public BluRay(String discName, int yearReleased, ArrayList<Track> trackList) {
        super(discName, yearReleased, trackList);
    }
}
