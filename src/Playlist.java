public class Playlist {
    private String songName, artist, genre;

    public Playlist() {
        this.songName = songName;
        this.artist = artist;
        this.genre = genre;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "Song Name='" + songName + '\'' +
                ", Artist='" + artist + '\'' +
                ", Genre='" + genre + '\'' +
                '}';
    }
}