public class Student extends Person {
    public void set() {
        age = 30;
        name = "John";
        height = 175;
        // weight = 99; //weight is private in Person, so it cannot be accessed directly here
        setWeight(99);
    }
}
