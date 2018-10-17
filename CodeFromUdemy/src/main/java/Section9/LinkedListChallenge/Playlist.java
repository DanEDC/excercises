package Section9.LinkedListChallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    private LinkedList<Song> myPlaylist;
    private ArrayList<Album> albumList;

    public Playlist() {
        this.myPlaylist = new LinkedList<>();
        this.albumList = new ArrayList<>();

    }

    public void addAlbumToPlaylist(Album album) {
        albumList.add(album);
    }

    public boolean addSongToPlaylist(String songTitle) {
        if (checkIfSongExistInAlbum(songTitle) == null) {
            System.out.println(songTitle + " song is not found in any album you own");
            return false;
        } else {

            ListIterator<Song> songListIterator = this.myPlaylist.listIterator();

            while (songListIterator.hasNext()) {
                int comparison = songListIterator.next().getTitle().compareTo(songTitle);
                if (comparison == 0) {
                    System.out.println(songTitle + " song is already in playlist");
                    return false;
                }
            }
            this.myPlaylist.add(checkIfSongExistInAlbum(songTitle));
            return true;
        }
    }

    private Song checkIfSongExistInAlbum(String songTitle) {
        for (int i = 0; i < albumList.size(); i++) {
            if (albumList.get(i).findSongInAlbum(songTitle) != null) {
                return albumList.get(i).findSongInAlbum(songTitle);
            }
        }
        return null;
    }

    public void printMyPlayList() {
        Iterator<Song> songIterator = this.myPlaylist.iterator();
        while (songIterator.hasNext()) {
            System.out.println(songIterator.next());
        }
    }

    private ListIterator<Song> createListIterator() {
        ListIterator<Song> songListIterator = this.myPlaylist.listIterator();
        return songListIterator;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "myPlaylist=" + myPlaylist +
                '}';
    }

    public void skipForward() {
        createListIterator();
        if (createListIterator().hasNext()) {
            System.out.println("Now listening " + createListIterator().next());
        } else {
            System.out.println("You have reached the end of playlist");
        }
    }

    public void skipBackwards() {
        createListIterator();
        if (createListIterator().hasPrevious()) {
            System.out.println("Now listening " + createListIterator().previous());
        } else {
            System.out.println("You have reached the beginning of playlist");
        }
    }

    public void repeatSong() {
    }

    public void removeSong() {
    }
}




