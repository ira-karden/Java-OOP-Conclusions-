package Task2_MusicDisk.MusicTools;

import Task1_Salad.Vegetable.Vegetable;
import Task2_MusicDisk.Song.Song;

import java.util.ArrayList;
import java.util.List;

public class DurationPicker {
    Song[] songsForPicker;

    public Song[] getNotLongSongs(Song[] songsForPicker){
        List<Song> NotLongSongs = new ArrayList<>();

        for (Song s : songsForPicker){
            if(s.getDuration()<=4.0 && s.getDuration()>0){
                NotLongSongs.add(s);
            }
        }
        return NotLongSongs.toArray(new Song[0]);
    }
}
