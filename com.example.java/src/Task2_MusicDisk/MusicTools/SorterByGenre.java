package Task2_MusicDisk.MusicTools;

import Task2_MusicDisk.Song.Song;

import java.util.Comparator;

public class SorterByGenre implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
