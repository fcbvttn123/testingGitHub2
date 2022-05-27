import java.lang.reflect.Array;
import java.util.Arrays;

public class testing2 {
    public static void main(String[] args) {
        Student obj = new Student("David", "3903", 18);
        Student obj2 = new Student("DTNQ", "11", 18);
        System.out.println(obj.toString());
        System.out.println(obj2.toString());
        }
    }

  class Student {
    private String name; 
    private String number;
    int age; 
    
    public Student(String name, String number, int age) {
        this.name = name; 
        this.number = number; 
        this.age = age; 
    }

    public String toString() {
        return "[people: "+name+", "+number+", "+age+"]";
    }
}



    
    


