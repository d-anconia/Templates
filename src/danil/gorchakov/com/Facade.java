package danil.gorchakov.com;

/**
 * Created by danilgorchakov on 03.05.16.
 */
public class Facade {
}

class Power{
    void on(){
        System.out.println("turn on");
    }
    void off(){
        System.out.println("turn off");
    }

}
class DVDRom{
    private boolean data = false;
    public boolean hasData(){
        return data;
    }
    void load(){
        data = true;
    }
    void unload(){
        data = false;
    }
}

class HDD{
    void copyFromDVD(DVDRom dvd){
        if(dvd.hasData()){
            System.out.println("coping data from disk");
        }else{
            System.out.println("insert disk with data");
        }
    }
}

class Computer{
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}
