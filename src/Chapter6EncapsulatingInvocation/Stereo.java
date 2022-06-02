package Chapter6EncapsulatingInvocation;

public class Stereo {

    private String room;
    private boolean stereoOn;
    private int volume;

    public Stereo(String room){

        this.room = room;
        stereoOn = false;
    }

    public void on(){

        stereoOn = true;
    }
    public void off(){

        stereoOn = false;
    }
    public void setCd(){}
    public void setDvd(){}
    public void setRadio(){}
    public void setVolume(int v){

        this.volume = v;
    }
}
