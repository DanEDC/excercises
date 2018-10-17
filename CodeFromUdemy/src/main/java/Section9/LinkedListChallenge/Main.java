package Section9.LinkedListChallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist myPlaylist = new Playlist();

        Album hardwired = new Album("Metallica", "Hardwired");
        Album ultra = new Album("Depeche Mode", "Ultra");

        myPlaylist.addAlbumToPlaylist(hardwired);
        myPlaylist.addAlbumToPlaylist(ultra);

        hardwired.addSongToAlbum("Hardwired", 3.00);
        hardwired.addSongToAlbum("Dream no more", 6.57);

        ultra.addSongToAlbum("No good", 3.45);
        ultra.addSongToAlbum("Sister of night", 5.07);

        myPlaylist.addSongToPlaylist("No good");
        myPlaylist.addSongToPlaylist("Dream no more");
        myPlaylist.addSongToPlaylist("AAA");
        myPlaylist.addSongToPlaylist("No good");

        boolean quit = false;
        int choice = 0;
        printMenu();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    myPlaylist.skipForward();
                    break;
                case 2:
                    myPlaylist.skipBackwards();
                    break;
                case 3:
                    myPlaylist.repeatSong();
                    break;
                case 4:
                    myPlaylist.removeSong();
                    break;
                case 5:
                    myPlaylist.printMyPlayList();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("\nPress ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To skip forward to the next song");
        System.out.println("\n 2 - To skip forward to the previous song");
        System.out.println("\n 3 - To repeat the song");
        System.out.println("\n 4 - To remove the song from playlist");
        System.out.println("\n 5 - To print my playlist");
        System.out.println("\n 6 - To quit the application");
    }

}
