package Task2_MusicDisk.run;

import Task1_Salad.Vegetable.Vegetable;
import Task2_MusicDisk.Disk.Disk;
import Task2_MusicDisk.MusicTools.DurationPicker;
import Task2_MusicDisk.MusicTools.SorterByGenre;
import Task2_MusicDisk.Song.Genres.ClubSong;
import Task2_MusicDisk.Song.Genres.MetalSong;
import Task2_MusicDisk.Song.Genres.PopSong;
import Task2_MusicDisk.Song.Genres.RockSong;
import Task2_MusicDisk.Song.Song;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DurationPicker durationPicker = new DurationPicker();
        SorterByGenre sorterByGenre = new SorterByGenre();

        Song[] songsForDisk = new Song[]{
                new RockSong("New Divide", "Linkin Park", 3.25),
                new PopSong("Bored", "Billie Eilish", 6.12),
                new ClubSong("Bulletproof", "La Roux", 2.00),
                new MetalSong("Unsainted", "Slipknot", 2.55),
                new RockSong("Break", "Three Days Grace", 3.07),
                new RockSong("The Diary of Jane", "Breaking Benjamin", 4.01),
                new MetalSong("Bittersweet Memories", "Bullet For My Valentine", 3.20)
        };

        Disk newDisk = new Disk(songsForDisk, "Top songs");
        System.out.println(newDisk);
        System.out.println("--------------------Details about Songs on Disk------------------------");
        newDisk.getDetails();
        System.out.println("--------------------PICKER SONGS WITH NOT LONG DURATION----------------");
        Song[] notLongSongs = durationPicker.getNotLongSongs(songsForDisk);
                for (Song s: notLongSongs){
            s.shortInfo();
        }
        System.out.println("---------------------Disk with short songs-------------------------------");
        Disk diskNotLongSongs = new Disk(notLongSongs, "Short Songs");
        System.out.println(diskNotLongSongs);

        System.out.println("--------------------SORT BY GENRE SONGS ON THE DISK--------------------");
        Arrays.sort(songsForDisk, sorterByGenre);
        for (Song s : songsForDisk){
            System.out.println("Genre: "+s.getGenre()+ " | " + s.getName()+" - "+s.getSingerName());
        }
    }
}
