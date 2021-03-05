package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> bandMembers;

    public MusicBand(String name, int year, List<MusicArtist> bandMembers) {
        this.name = name;
        this.year = year;
        this.bandMembers = bandMembers;
    }

    public int getYear() {
        return this.year;
    }

    public List<MusicArtist> getMembers() {
        return bandMembers;
    }

    public void printMembers() {
        System.out.println(bandMembers);
    }

    public static void transferMembers(MusicBand mb1, MusicBand mb2) {
        for (MusicArtist element : mb1.bandMembers) {
            mb2.bandMembers.add(element);
        }

        mb1.bandMembers.removeAll(mb1.bandMembers);
    }
}
