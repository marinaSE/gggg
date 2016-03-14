package asd;

import org.jcp.xml.dsig.internal.SignerOutputStream;
import sun.java2d.opengl.WGLSurfaceData;

public class App
{
    public static void main( String[] args )
    {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Petya");
        student2.setName("Kolya");

        student1 = student2;

        student2.setName("Angelika");

        System.out.println("Student1 name is:" + student1.getName());
        System.out.println("Student2 name is:" + student2.getName());
        Student student3;
        System.out.println(student3);

    }
}