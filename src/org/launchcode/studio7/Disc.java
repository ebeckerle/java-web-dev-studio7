package org.launchcode.studio7;

public interface Disc {

    int discSpinMaxSpeed = 500;

    void spinDisc();


    default int returnMaxSpeed(){
        return discSpinMaxSpeed;
    }

}
