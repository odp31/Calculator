import java.util.Scanner;

public class Calculator
  {
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter first number: ");

      double num1 = scanner.nextDouble();
      System.out.print("Enter second number: ");
      double num2 = scanner.nextDouble();

      System.out.println("Select an operation: ");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication);
      System.out.println("4. Division");

      int choice = scanner.nextInt();
      double result;

      swtich (choice) {
        case 1:
          result = num1 + num2;
          System.out.println("Result: " + result);
          break;
        case 2:
          result = num1 - num2;
          System.out.println("Result: " + result);
          break;
        case 3:
          result = num1 * num2;
          System.out.println("result: " + result);
          break;
        case 4:
          if (num2 == 0) {
            System.out.println("error: division by zero");
        }
        else {
          result = num1 / num2;
          System.out.println("result; " + result);
        }
        break;
        default:
          System.out.println("invalid choice");
      }
      scanner.close();
    }
  }
