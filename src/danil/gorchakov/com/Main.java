package danil.gorchakov.com;

public class Main {

    public static void main(String[] args) {

        /* Delegate test*/
        Artist artist = new Artist();
        artist.setGraphics(new Square());
        artist.draw();
        artist.setGraphics(new Circle());
        artist.draw();

         /* Facade test*/

//        Power power = new Power();
//        power.on();
//
//        DVDRom dvd = new DVDRom();
//        dvd.load();
//
//        HDD hdd = new HDD();
//        hdd.copyFromDVD(dvd);
        Computer computer = new Computer();
        computer.copy();



    }
}
