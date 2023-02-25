public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 25, 100, 80, 40);
        Fighter f2 = new Fighter("Osman", 20, 150, 90, 25);
        Match match = new Match(f1, f2, 75, 95);
        match.run();
    }
}