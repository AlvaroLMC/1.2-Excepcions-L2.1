import java.util.Scanner;
import java.util.InputMismatchException;

public class Entry {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        byte value;
        while (true) {
            try {
                System.out.print(message);
                value = scanner.nextByte();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number in the range (-128 to 127).");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        int value;
        while (true) {
            try {
                System.out.print(message);
                value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        float value;
        while (true) {
            try {
                System.out.print(message);
                value = scanner.nextFloat();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a decimal number (float).");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        double value;
        while (true) {
            try {
                System.out.print(message);
                value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a decimal number (double).");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        String input;
        char character;
        while (true) {
            try {
                System.out.print(message);
                input = scanner.nextLine().trim();
                if (input.length() != 1) {
                    System.out.println("Invalid input. Must be a single character.");
                    continue;
                }
                character = input.charAt(0);
                if (character == '.') {
                    throw new WrongEntry("The character '" + character + "' is reserved and cannot be used.");
                }
                return character;
            } catch (WrongEntry e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        String userInput;
        while (true) {
            try {
                System.out.print(message);
                userInput = scanner.nextLine().trim();
                if (userInput.isEmpty()) {
                    System.out.println("The name cannot be empty.");
                    continue;
                }
                if (userInput.equalsIgnoreCase("administrator")) {
                    throw new WrongEntry("The name '" + userInput + "' is reserved and cannot be used.");
                }
                return userInput;
            } catch (WrongEntry e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static boolean readBoolean(String message) {
        String input;
        while (true) {
            try {
                System.out.print(message);
                input = scanner.nextLine().trim().toLowerCase();
                if (input.equals("t")) {
                    return true;
                } else if (input.equals("f")) {
                    return false;
                } else {
                    throw new WrongEntry("Only -t- or -f- are accepted as valid input.");
                }
            } catch (WrongEntry e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}