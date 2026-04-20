
public class App {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World!");
        } else {
            String result = "Hello ";

            for (String name : args) {
                result += name + " ";
            }

            // remove last space
            result = result.substring(0, result.length() - 1);

            System.out.println(result);
        }

    }
}