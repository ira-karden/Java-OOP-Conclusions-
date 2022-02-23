package Task2_MusicDisk.Song.Genres;

import Task2_MusicDisk.Genre.Genre;
import Task2_MusicDisk.Song.Song;

public class MetalSong extends Song {
    public MetalSong(String name, String singerName, double duration) {
        super(Genre.METAL, name, singerName, duration);
    }
}
