package ch06_class_0802;

public class Song {

	String title;
	String artist;
	int year;
	String country;
	
	Song(){
		this("title", "artist", 0000, "country");
	}
	
	Song(String title, String artist, int year, String country ){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
		
	}
	
	public void showSongInfo() {
		System.out.println(year +"��" + country + "������" + artist +"�� �θ�"+ title);
	}
	
	
	public static void main(String[] args) {
		
		Song song = new Song ("Dancing Queen", "ABBA", 1979,"������");
		song.showSongInfo();

	}

}
