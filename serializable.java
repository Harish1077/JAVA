import java.io.Serializable;
public class student implements Serializable{
    int id;
    String name;
    public student(int id, String name) {
        this.id = id;
        this.name = name;
    } 
} 
// The above code is used to create a student class with id and name as its attributes
// The class implements Serializable interface which allows the object of this class to be serialized and deserialized.
// The class has a constructor which initializes the id and name of the student object.

import java.io.*;
class serializable{
    public static void main(String[] arg) {
        student a1=new student(12,"abc");
        FileOutputStream fout=new FileOutputStream("name:.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout); 
        out.writeObject(s1);
        out.close();
        out.close(); 
    }
}
// The above code is used to serialize the object of student class and write it to a file named "name:.txt"
// The file name is "name:.txt" which is not a valid file name in most operating systems.

import java.io.*;
class serializable {
    public static void main(String[] arg) {
        ObjectIutputStream in = new ObjectIutputStream(new FileInputStream("name:.txt"));
        student s = (student) in.readObject();
        in close();
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
    }
}
// The above code is used to deserialize the object of student class from the file "name:.txt"
// and print the id and name of the student object
// The file name is "name:.txt" which is not a valid file name in most operating systems.