public class Main {
    public static void main(String[] args) {

        byte drawNumber = Entry.readByte("Draw. To participate, choose a number in the range -128 to 127: ");
        System.out.println("The chosen number is: " + drawNumber);

        int age = Entry.readInt("Enter your age: ");
        System.out.println("Your age is: " + age);

        float height = Entry.readFloat("Enter your height in meters: ");
        System.out.println("Your height is: " + height);

        double salary = Entry.readDouble("Enter your gross monthly salary: ");
        System.out.println("Your gross monthly salary is: " + salary);

        char character = Entry.readChar("Enter a character. The character '.' is not allowed: ");
        System.out.println("Accepted character: " + character);

        String username = Entry.readString("Enter a username: ");
        System.out.println("Accepted username: " + username);

        boolean isMember = Entry.readBoolean("Are you a registered member? -t- or -f-: ");
        System.out.println("Registered member: " + isMember);
    }
}