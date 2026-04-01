public class ForEachExample {
    enum Week {Mon, Tues, Wednes, Thurs, Fri, Satur, Sun}
    public static void main(String[] args) {
        int [] n = {1, 2, 3, 4, 5};
        String names [] = {"Apple", "Banana", "Cherry", "Strawberry"};

        int sum = 0;
        for(int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("Sum is: " + sum);

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (Week day : Week.values()) {
            System.out.print(day + "day ");
        }
        System.out.println();
    }
}
