package Chapter6EncapsulatingInvocation;

public class Light {

    private String roomLight;
    private boolean activate;

    public Light(String r){

        roomLight = r;
        activate = false;
    }

    public String getRoomLight() {
        return roomLight;
    }

    public void setRoomLight(String roomLight) {
        this.roomLight = roomLight;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }

    public void on(){

        activate = true;
    }
    public void off(){

        activate = false;
    }
}
