/*
Name    : Mazharul Islam Tohin
ID      : 2012020190
Section : 5(D)
Email   : cse_2012020190@lus.ac.bd
Date    : 07-08-2021
 */

package MazharulIslamTohin;

public class Student
{
    String name;
    int id;
    static String universityName;

    Student() {
        System.out.println("Default constructor");
    }

    Student (String name)
    {
        this.name = name;
        System.out.println("Name :"+this.name);
    }
    Student (int id)
    {
        this.id = id;
        System.out.println("ID :"+this.id);
    }
     void display()
    {
        System.out.println("University Name :" + universityName);
    }

}


