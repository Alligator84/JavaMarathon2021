package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Nenci", 1995);
        MusicBand musicBand2 = new MusicBand("Na-Na", 1996);
        MusicBand musicBand3 = new MusicBand("Morga", 2019);
        MusicBand musicBand4 = new MusicBand("Stasyan", 2015);
        MusicBand musicBand5 = new MusicBand("Carmen", 1991);
        MusicBand musicBand6 = new MusicBand("Coy", 1992);
        MusicBand musicBand7 = new MusicBand("Ivan Dorn", 2012);
        MusicBand musicBand8 = new MusicBand("Nautilus", 1986);
        MusicBand musicBand9 = new MusicBand("Leningrad", 2000);
        MusicBand musicBand10 = new MusicBand("Fabrica", 2007);

        List<MusicBand> musicBandList = new ArrayList<>();

        musicBandList.add(musicBand1);
        musicBandList.add(musicBand2);
        musicBandList.add(musicBand3);
        musicBandList.add(musicBand4);
        musicBandList.add(musicBand5);
        musicBandList.add(musicBand6);
        musicBandList.add(musicBand7);
        musicBandList.add(musicBand8);
        musicBandList.add(musicBand9);
        musicBandList.add(musicBand10);

        Collections.shuffle(musicBandList);

        System.out.println(musicBandList);
        System.out.println(groupsAfter2000(musicBandList));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> mb = new ArrayList<>();
        for (MusicBand element : bands) {
            if (element.getYear() > 2000) {
                mb.add(element);
            }
        }
        return mb;
    }
}
