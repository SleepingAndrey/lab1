import pack1.SecondClass;

public class FirstClass {
    public static void main(String[] args) {
        SecondClass o = new SecondClass();
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setA(i);
                o.setB(j);
                System.out.print(o.getSum());
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}