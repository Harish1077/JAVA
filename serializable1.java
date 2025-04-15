import java.io.*;
class serializable1{
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