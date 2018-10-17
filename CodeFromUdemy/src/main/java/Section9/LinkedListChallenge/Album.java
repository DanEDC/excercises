package Section9.LinkedListChallenge;

import java.util.ArrayList;

public class Album {
    private String artistName;
    private String albumName;
    private ArrayList<Song> listOfSongsInAlbum;


    public Album(String artistName, String albumName) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.listOfSongsInAlbum = new ArrayList<>();
    }

    public boolean addSongToAlbum(String title, double duration) {
        Song song = new Song(title, duration);
        if (listOfSongsInAlbum.size() == 0) {
            listOfSongsInAlbum.add(song);
            return true;
        } else {
            if (findSongInAlbum(title) == null) {
                listOfSongsInAlbum.add(song);
                return true;
            }

            System.out.println("Song " + title + " is already in album " + getAlbumName());
            return false;
        }

    }


    public Song findSongInAlbum(String songTitle) {
        if (listOfSongsInAlbum.size() == 0) {
            return null;
        } else {
            for (int i = 0; i < this.listOfSongsInAlbum.size(); i++) {
                if (listOfSongsInAlbum.get(i).getTitle().equals(songTitle)) {
                    return listOfSongsInAlbum.get(i);
                }
            }
        }
        return null;
    }


    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artistName='" + artistName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", listOfSongsInAlbum=" + listOfSongsInAlbum +
                '}';
    }
}

