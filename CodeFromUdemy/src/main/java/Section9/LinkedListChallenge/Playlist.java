package Section9.LinkedListChallenge;

import java.util.ArrayList;
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

    public boolean addSongToPlaylist(LinkedList<Song> linkedList, String songTitle) {
        if (checkIfSongExistInAlbum(songTitle) == null) {
            System.out.println(songTitle + " song is not found in any album you own");
            return false;
        } else {

            ListIterator<Song> songListIterator = linkedList.listIterator();

            while (songListIterator.hasNext()) {
                int comparison = songListIterator.next().getTitle().compareTo(songTitle);
                if (comparison == 0) {
                    System.out.println(songTitle + " song is already in playlist");
                    return false;
                }
                if (comparison > 0) {
                    songListIterator.previous();
                    myPlaylist.add(checkIfSongExistInAlbum(songTitle));
                    return true;
                } else if (comparison < 0) {
                }
            }
            songListIterator.add(checkIfSongExistInAlbum(songTitle));
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





}




