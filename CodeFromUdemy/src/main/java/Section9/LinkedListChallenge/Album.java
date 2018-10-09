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

    public void addSongToAlbum(String title, double duration) {
        Song song = new Song(title, duration);
        if (listOfSongsInAlbum.size() == 0) {
            this.listOfSongsInAlbum.add(song);
        } else {
            for (int i = 0; i < this.listOfSongsInAlbum.size(); i++) {
                if (!listOfSongsInAlbum.get(i).getTitle().equals(title)) {
                    this.listOfSongsInAlbum.add(song);
                }
            }
        }
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

}

