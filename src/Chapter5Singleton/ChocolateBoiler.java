package Chapter5Singleton;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler(){//momentul in care bolierul e gol

        empty = true;
        boiled = false;
    }

    public boolean isEmpty(){return empty;}

    public boolean isBoiled(){return boiled;}

    public void fill(){//pt a umple bolierul <=> trebuie sa fie gol si cand
                       //este plin => setam flag-urile pentru empty si boiled
        if(isEmpty()){

            empty = false;
            boiled = false;
        }
    }

    public void drain(){//pt a scurge din boiler trebuie sa fie plin si gatit
                        //=> dupa ce a fost golit => punem ca empty e true
        if(!isEmpty() && isBoiled()){

            empty = true;
        }
    }

    public void boil(){//pentru a gati ciocolata trebuie sa fie plin si sa nu fie
                       //inca gatit => dupa ce e boiled , setam boiled ca true

        if(!isEmpty() && !isBoiled()){

            boiled = true;
        }
    }
}
