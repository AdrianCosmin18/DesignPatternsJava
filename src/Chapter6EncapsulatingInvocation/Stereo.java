package Chapter6EncapsulatingInvocation;

public class Stereo {

    int volume;

    public void on(){}
    public void off(){}
    public void setCd(){}
    public void setDvd(){}
    public void setRadio(){}
    public void setVolume(int v){

        this.volume = v;
    }
}
