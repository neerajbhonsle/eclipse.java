package enumexampleRunner;

import constant.songs;
import enumexample.spotify;

public class spotifyRunner {

	public static void main(String[] args) {
	spotify app=new spotify(songs.song_1,songs.song_2);
     app.showcase();
	}

}
