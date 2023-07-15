import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для списка А");
        for (int i = 0; i < 2 ; i++) {
            A.add(scanner.next());
        }
        System.out.println(A);
        System.out.println("Введите данные для списка B");
        for (int i = 0; i < 2 ; i++) {
            B.add(scanner.next());
        }
        System.out.println(B);

        Collections.reverse(B);


        C.addAll(A);
        int j = 1;
        for (int i = 1; i < A.size() + B.size(); i += 2) {
            C.add(i , B.get(i-j));
            j++;
        }
        System.out.println(C);

        Collections.sort(C, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(C);

    }
}