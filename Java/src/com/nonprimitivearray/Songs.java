package com.nonprimitivearray;

public class Songs {
	String title;
	double duration;
	String singer;
	Songs()
	{
		
	}
    Songs(String title, double duration, String singer)
    {
    	this.title=title;
    	this.duration=duration;
    	this.singer=singer;
    }
    static void listening(Songs[] Playlist){
    for(int i=0;i<Playlist.length;i++)
    
    	System.out.println(" title:"+ Playlist[i].title+"\n duration:"+Playlist[i].duration+ "\n singer:"+Playlist[i].singer+"\n******");

    }

}
