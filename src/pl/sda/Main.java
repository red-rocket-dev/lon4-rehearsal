package pl.sda;

public class Main {

    public static void main(String[] args) {
        Long[] strings = {1L, 2L, 3L, 4L};
        print(2L, strings);
        print(1000L, 4L, 5L, 10_000L); //var args
    }

    public static void print(Long a, Long... array) {
        System.out.println(a);
        for (Long element : array) {
            System.out.println(element);
        }
    }
}
