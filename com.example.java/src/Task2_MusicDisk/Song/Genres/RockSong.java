package Task2_MusicDisk.Song.Genres;

import Task2_MusicDisk.Genre.Genre;
import Task2_MusicDisk.Song.Song;

public class RockSong extends Song {

    public RockSong(String name, String singerName, Double duration) {
        super(Genre.ROCK, name, singerName, duration);
    }
}
