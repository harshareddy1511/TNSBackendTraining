// Java Program to find the maximum of three numbers
class Maximum {
    public static void main(String[] args) {
        int a = 69;
        int b = 45;
        int c = 15;

        if (a > b && a > c) {
            System.out.println("The greatest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest number is: " + b);
        } else {
            System.out.println("The greatest number is: " + c);
        }
    }
}