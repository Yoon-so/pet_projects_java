public class InheritanceEx {
    public static void main(String[] args) {
        Student student = new Student();
        student.set();
        
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Height: " + student.height);
        System.out.println("Weight: " + student.getWeight());
    }
}
