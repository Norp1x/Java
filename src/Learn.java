public class Learn {

    public static void main(String[] args) {
    Test tab = new Test();
    tab.write("Greg", "Dudek");
    tab.write("Madeline", "Szcześniewska");
    }
    static class Test {
        void write (String name, String surname){
            System.out.println();
            System.out.println("Name: " + name + "\nSurname: " + surname);
            System.out.println();
        }
    }
}