package devdojo.poo.metodos.test;

import devdojo.poo.metodos.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setName("Carl");
        funcionario.setAge(43);

        double[] salaries = {1231.23, 5252.52, 8521.42};
        funcionario.setSalaries(salaries);

        String funcName = funcionario.getName();
        int funcAge = funcionario.getAge();
        double[] salary = funcionario.getSalaries();

        funcionario.printFuncionario();

        funcionario.meanSalary();

    }
}
