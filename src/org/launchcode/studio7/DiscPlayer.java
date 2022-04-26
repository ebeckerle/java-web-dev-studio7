package org.launchcode.studio7;

import java.util.ArrayList;

public class DiscPlayer {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        Track t1 = new Track("I Forgot That You Existed", 251);
        Track t2 = new Track("Cruel Summer", 259);
        Track t3 = new Track("Lover", 341);
        Track t4 = new Track("The Man", 310);
        ArrayList<Track> loverTracklist = new ArrayList<>();
        loverTracklist.add(0, t1);
        loverTracklist.add(1, t2);
        loverTracklist.add(2, t3);
        loverTracklist.add(3, t4);

        CD lover = new CD("Lover", 2019, loverTracklist);




        // TODO: Call each CD and DVD method to verify that they work as expected.
        lover.spinDisc();
        lover.playDisc();

        lover.skipTrack(t2);

        lover.playTrack(t3);

    }
}
