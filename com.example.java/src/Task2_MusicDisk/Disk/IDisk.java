package Task2_MusicDisk.Disk;

import Task2_MusicDisk.Song.Song;

public interface IDisk {

    public void detailsSongs(Song[]songs);
    public void getDetails();
    public double TotalDuration(Song[] songs);
    public String GetSongs(Song[]songs);
}
