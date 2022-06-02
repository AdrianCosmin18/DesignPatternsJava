package Chapter6EncapsulatingInvocation;

public class CeilingFan {

    private String room;
    private boolean activate;

    public CeilingFan(String room){

        this.room = room;
        activate = false;
    }


    public void on(){

        activate = true;
    }

    public void off(){

        activate = false;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}
