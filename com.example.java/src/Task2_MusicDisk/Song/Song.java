package Task2_MusicDisk.Song;

import Task2_MusicDisk.Genre.Genre;

import java.util.Objects;

public abstract class Song {
    private String name;
    private String singerName;
    private Genre genre;
    private Double duration;

    public Song(Genre genre, String name, String singerName, double duration){
        this.genre = genre;
        this.name = name;
        this.singerName = singerName;
        this.duration = duration;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
    public void shortInfo(){
        System.out.println(getName()+" - "+getSingerName()+", "+getDuration());
    }

    @Override
    public String toString() {
        return "Name of song: "+name+"\n"+"Singer: "+singerName+"\n"+"Ganre: "+genre+"\n"+"Duration: "+duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return name.equals(song.name) && singerName.equals(song.singerName) && genre == song.genre && duration.equals(song.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, singerName, genre, duration);
    }
}
