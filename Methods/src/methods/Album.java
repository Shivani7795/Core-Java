package methods;
import java.util.Objects;

public class Album {
    private String title;
    private String artist;
    private String genre;
    private int price;

    public Album(String title, String artist, String genre, int price) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title +
                ", artist='" + artist +
                ", genre='" + genre +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Album) {
            Album album = (Album) obj;
            if (Objects.equals(this.title, album.title) &&
                    Objects.equals(this.artist, album.artist) &&
                    Objects.equals(this.genre, album.genre) &&
                    Objects.equals(this.price, album.price)) {
                System.out.println("Album is matching...");
                return true;
            }
        }
        return false;
    }
}
