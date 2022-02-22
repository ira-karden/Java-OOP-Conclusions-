package Task2_MusicDisk.Song.Genres;

import Task2_MusicDisk.Genre.Genre;
import Task2_MusicDisk.Song.Song;

public class PopSong extends Song {
    public PopSong(String name, String singerName, double duration) {
        super(Genre.POP, name, singerName, duration);
    }
}
