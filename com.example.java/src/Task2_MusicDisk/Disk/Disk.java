package Task2_MusicDisk.Disk;

import Task1_Salad.Vegetable.Vegetable;
import Task2_MusicDisk.Song.Song;

import java.util.Arrays;

public class Disk implements IDisk{
    private String tracks;
    private Song[] songs;
    private String name;
    private Double totalDuration;


    public Disk(Song[] songs, String name) {
        this.songs = songs;
        this.name = name;
        this.totalDuration = 0.0;
        setTotalDuration(TotalDuration(songs));
        setSongs(songs);

    }

    public void detailsSongs(Song[]songs) {
        for (int i = 0; i < songs.length; i++){
            System.out.println(songs[i].toString());
            System.out.println("-----------------------------------------------");

        }
    }
    public void getDetails(){
        detailsSongs(songs);
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public double TotalDuration(Song[] songs){
        for (Song s : songs){
            totalDuration = totalDuration + s.getDuration();
        }
        return totalDuration;
    }


    public void setTotalDuration(Double totalDuration) {
        this.totalDuration = totalDuration;
    }


    public String GetSongs(Song[]songs){
        for (int i = 0; i < songs.length; i++){
            tracks = tracks +"\n"+(i+1)+ ". "+songs[i].getName()+" - "+songs[i].getSingerName();
            tracks = tracks.replace("null", "").trim();
        }
        return tracks;
    }

    @Override
    public String toString() {
        return "Disk: "+name+"\n"+"Tracks: "+"\n"+GetSongs(songs)+"\n"+ "Total Duration: "+totalDuration;
    }

}
