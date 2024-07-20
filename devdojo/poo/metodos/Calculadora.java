package devdojo.poo.metodos;

public class Calculadora {

    public String name;

    public static void say() {
        System.out.println("Calculadora");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public void sayName() {
        System.out.println(this.name);
    }

    public static void sumArrVarags(int... arr) {

        int sum = 0;

        for (int n : arr) {
            sum += n;
        }

        System.out.println(sum);

    }

}
