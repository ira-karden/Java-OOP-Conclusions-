package Task2_MusicDisk.Song.Genres;

import Task2_MusicDisk.Genre.Genre;
import Task2_MusicDisk.Song.Song;

public class ClubSong extends Song {
    public ClubSong(String name, String singerName, double duration) {
        super(Genre.CLUB, name, singerName, duration);
    }
}
