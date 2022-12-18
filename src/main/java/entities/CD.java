package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CD {
    @Id
    private int id;
    private String title;
    private String artist;
    private int price;


    public CD() {
    }

    public CD(String title, String artist, int price) {
            this.title = title;
            this.artist = artist;
            this.price = price;
        }

    public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Cd{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", artist='" + artist + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
