package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist1 = new MusicArtist("Oleg", 25);
        MusicArtist artist2 = new MusicArtist("Ivan", 36);
        MusicArtist artist3 = new MusicArtist("Olga", 660);

        List<MusicArtist> listArtist1 = new ArrayList<>();
        listArtist1.add(artist1);
        listArtist1.add(artist2);

        List<MusicArtist> listArtist2 = new ArrayList<>();
        listArtist2.add(artist3);

        MusicBand mb1 = new MusicBand("Na-na", 2015, listArtist1);
        MusicBand mb2 = new MusicBand("Pol Okin", 1986, listArtist2);

        mb1.printMembers();
        mb2.printMembers();
        MusicBand.transferMembers(mb1, mb2);
        mb1.printMembers();
        mb2.printMembers();

    }
}
