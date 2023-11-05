package Homework18.Entity;
import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    int id;
    @Column(name = "FirstName")
    String firstName;
    @Column(name = "SecondName")
    String secondName;
    @Column(name = "City")
    String city;

    public Student(String firstName, String secondName, String city) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.city = city;
    }

    public Student() {}

    @Override
    public String toString() {
        return "Студент - {" +
                "ID - " + id +
                "; Имя - " + firstName +
                "; Фамилия - " + secondName +
                "; Город - " + city +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}