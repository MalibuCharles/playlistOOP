import java.util.ArrayList;
import java.util.Scanner;

public class ManageSongs {
    //list to store data
    ArrayList<Playlist> list = new ArrayList<>();

    //create method
    public void create(Playlist song){

        list.add(song);
    }

    //read method
    public Playlist read(String name){
        for (Playlist song: list) {
            if (song.getSongName().equals(name)){
                return song;
            }
        }return null;
    }

    //update method
    public void update(String name){
        Playlist songs = read(name);
        if (name != null){
            System.out.println("Change the song name: ");
            //scanner
            Scanner scan = new Scanner(System.in);
            String newName = scan.nextLine();
            songs.setSongName(newName);

            System.out.println("Change the artist name: ");
            String newArtist = scan.nextLine();
            songs.setArtist(newArtist);

            System.out.println("What is the genre");
            String newGenre = scan.nextLine();
            songs.setGenre(newGenre);

            System.out.println("Song updated!");

        }
    }

    public void delete(String name){
        Playlist song = read(name);
        if (name != null){
            list.remove(song);
            System.out.println("We have deleted the song!");
        }
    }

    public void display(){
        for (Playlist song: list) {
            System.out.println(song.toString());
        }
    }
}
