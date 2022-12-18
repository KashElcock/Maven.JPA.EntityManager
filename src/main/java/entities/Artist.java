package entities;

import jakarta.persistence.*;

@Entity
public class Artist {
    @Id
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String instrument;

    public Artist() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public Artist(String firstName, String lastName, String instrument) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.instrument = instrument;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getInstrument() {
            return instrument;
        }

        public void setInstrument(String instrument) {
            this.instrument = instrument;
        }

        @Override
        public String toString() {
            return "Artist{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", instrument='" + instrument + '\'' +
                    '}';
        }
    }
