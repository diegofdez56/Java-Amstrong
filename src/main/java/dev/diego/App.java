package dev.diego;

public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int number = Integer.parseInt(args[0]);
                if (ArmstrongNumber.isArmstrong(number)) {
                    System.out.println(number + " es un número de Armstrong.");
                } else {
                    System.out.println(number + " no es un número de Armstrong.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        } else {
            System.out.println("Por favor, ingrese un número como argumento.");
        }
    }
}
