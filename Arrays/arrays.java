import java.util.*;

public class arrays {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {95, 94, 92};
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " "); // Fix: Print marks instead of index
        }
        System.out.println();
    }
}
