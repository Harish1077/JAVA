import java.io.*;
class serializable2 {
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