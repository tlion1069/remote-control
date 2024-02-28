package edu.iu.habahram.remotecontroller.model;

public class Stereo {
    String location = "";
    int volume;
    String current;

    public Stereo(String location) {
        this.location = location;
    }

    public String on(){
        return location + " is on";
    }
    public String off(){
        return location + " is off";
    }
    public String setCD(){
        current = "cd";
        return location + " is now playing CD";
    }
    public String setDVD(){
        current = "dvd";
        return location + " is now playing dvd";
    }
    public String setRadio(){
        current = "radio";
        return location + " is now playing Radio";
    }
    public String setVolume(int volume){
        this.volume = volume;
        return location + " volume is set to 8";
    }
}
