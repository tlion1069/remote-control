package edu.iu.habahram.remotecontroller.model;

public class Stereo extends RemoteControl{
    String stereo = "";
//Command Pattern not learned yet
    public Stereo(int numberOfDevices) {
        super(numberOfDevices);
    }

    public String on(){
        return "on";
    }
    public String off(){
        return "off";
    }
    public String setCD(){
        return "";
    }
    public String setDVD(){
        return "";
    }
    public String setRadio(){
        return "";
    }
    public String setVolume(int volume){
        return "";
    }
}
