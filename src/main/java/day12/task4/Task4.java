package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> bandMembers = new ArrayList<>(2);
        bandMembers.add("Oleg Petrov");
        bandMembers.add("Ivan Hors");

        MusicBand mb1 = new MusicBand("Nin", 2020, bandMembers);
        MusicBand mb2 = new MusicBand("Noni", 2015, new ArrayList<>());

        MusicBand.transferMembers(mb1, mb2);

        mb1.printMembers();
        mb2.printMembers();
    }
}
