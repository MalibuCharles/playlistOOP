import java.util.Scanner;

public class PlaySongs {
    //main method
    public static void main(String[] args) {
        // new instance of the ManageSong class
        ManageSongs manager = new ManageSongs();

        Scanner scan = new Scanner(System.in);

        String choice = "y";

        while (true) {
        System.out.println("Welcome to your Playlist\n" +
                "1.Add a new song to your playlist\n" +
                "2.Listen to a song\n" +
                "3.Update a song\n" +
                "4.Delete a song from your playlist\n" +
                "5.View your playlist");
        String answer = scan.nextLine();

        //while loop
            //if statements
            if (answer.equals("1")) {
                //create a new instance of a playlist
                while (choice.equals("y")) {
                    Playlist song = new Playlist();
                    System.out.println("What is the name of the song?");
                    String name = scan.nextLine();
                    song.setSongName(name);
                    System.out.println("What is the artist name?");
                    String aName = scan.nextLine();
                    song.setArtist(aName);
                    System.out.println("What is the genre?");
                    String genre = scan.nextLine();
                    song.setGenre(genre);

                    manager.create(song);

                    System.out.println("Would you like to add another song.");
                    choice = scan.nextLine();
                }
            } else if (answer.equals("2")) {
                System.out.println("What is the song name?");
                String search = scan.nextLine();
                System.out.println(manager.read(search).toString());

            } else if (answer.equals("3")) {
                System.out.println("Let's change a song");
                String updates = scan.nextLine();
                manager.update(updates);

            } else if (answer.equals("4")) {
                System.out.println("What song would you like to delete");
                String delete = scan.nextLine();
                manager.delete(delete);

            } else if (answer.equals("5")) {
                System.out.println("Here's your playlist");
                manager.display();
            }
        }
    }
}
