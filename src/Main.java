public class Main {
    static int sign(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // Skriv en metod som tar ett heltal som parameter och returnerar
        //   -1  om parametern är negativt
        //    0  om parametern är 0
        //    1  om parametern är större än 0

        int result = sign(-5);
        System.out.println("Metoden returnerade " + result);
    }
}