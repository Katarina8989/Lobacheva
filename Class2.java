public class Class2 {public static void main(String[] args) {
    int a = 2;
    int b = 7;

    System.out.println(a+b);
    System.out.println(b-a);
    System.out.println(a*b);
    System.out.println(b/a);

    if (a > b) {
        System.out.println("a > b");
    } else if (a < b) {
        System.out.println("a < b");
    } else {
        System.out.println("a = b");
        if (b == 0) {
            System.out.println("Деление на ноль невозможно.");
        } else {
            System.out.println("Частное: " + ((double) a / b));
        }

    }}}