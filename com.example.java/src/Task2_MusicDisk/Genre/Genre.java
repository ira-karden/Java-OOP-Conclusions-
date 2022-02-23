package Task2_MusicDisk.Genre;

public enum Genre {
    ROCK("Rock"), POP("Pop"), CLUB("Club"), METAL("Metal");
    String name;
    Genre (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
