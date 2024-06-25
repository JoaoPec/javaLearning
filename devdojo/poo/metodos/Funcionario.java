package devdojo.poo.metodos;

public class Funcionario {

    private String name;
    private int age;
    private double[] salaries;

    public void printFuncionario() {

        if (this.salaries == null) {
            System.out.println("Salary is null");
            return;
        }

        System.out.print("name: " + this.name + " age: " + this.age + " salaries: ");
        for (double s : this.salaries) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void meanSalary() {

        if (this.salaries == null) {
            System.out.println("Salary is null");
            return;
        }

        int quantity = this.salaries.length;

        double sum = 0;

        for (double n : this.salaries) {
            sum += n;
        }

        double mean = sum / quantity;

        System.out.println(mean);


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }
}
