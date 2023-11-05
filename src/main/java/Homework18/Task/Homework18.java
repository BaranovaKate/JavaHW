package Homework18.Task;
import Homework18.Entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class Homework18 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = null;
        List<Student> list = new ArrayList<>();
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            int id = 1;
            Student stud = session.get(Student.class, id++);
            while (stud != null){
                list.add(stud);
                stud = session.get(Student.class, id++);
            }
            for (Student s : list){
                System.out.println(s);
            }
        } finally {
            session.close();
            factory.close();
        }
    }
}
