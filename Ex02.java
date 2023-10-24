public class Ex02 {
    public static void main(String[] args) {
        short numero1 = 0;
        short numero2 = 1;
        System.out.print("0, 1, ");
        while(true) {
            short fibonacci = (short) (numero1 + numero2);
            numero1 = numero2;
            numero2 = fibonacci;
            System.out.print(fibonacci + ", ");
        }
    }
}
