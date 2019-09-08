package com.nonprimitivearray;

public class Playlist {

	public static void main(String[] args) {
		Songs[] Playlist = new Songs[7];
		Playlist[0]=new Songs("Teri-meri",4.0,"Rahat fateh Ali khan");
		Playlist[1]=new Songs("Tagaru", 4.0,"Antony");
		Playlist[2]=new Songs("Nannaku prematho",5.0,"DSP");
		Playlist[3]=new Songs("Malare",5.0,"Yesudas");
		Playlist[4]=new Songs("Ankhya ka kajal",4.5,"Prasanna");
		Playlist[5]=new Songs("Senorita",4.5,"Shawn mendes");
		Playlist[6]=new Songs("vande mataram",4.5,"A R Rehman");
		
	     Songs.listening(Playlist);

	}

}
