//Questão 1:


class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Mustang", 2020);
        Carro carro2 = new Carro("Chevrolet", "Camaro", 2021);
        Carro carro3 = new Carro("Toyota", "Corolla", 2019);

        carro1.mostrarDetalhes();
        carro2.mostrarDetalhes();
        carro3.mostrarDetalhes();
    }
}


//Questão 2:



class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar() {
        velocidade += 10;
    }

    public void frear() {
        velocidade -= 10;
    }

    public void mostrarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Mustang", 2020);
        carro.acelerar();
        carro.mostrarVelocidade();
        carro.frear();
        carro.mostrarVelocidade();
    }
}


//Questão 3:


class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria");
        conta.depositar(1000);
        conta.mostrarSaldo();
        conta.sacar(500);
        conta.mostrarSaldo();
        conta.sacar(600);
    }
}

//Questão 4:

class Animal {
    public String som() {
        return "Som desconhecido";
    }
}

class Cachorro extends Animal {
    @Override
    public String som() {
        return "Latido";
    }
}

class Gato extends Animal {
    @Override
    public String som() {
        return "Miau";
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println(cachorro.som());
        System.out.println(gato.som());
    }
}


//Questão 5:

public static void emitirSom(Animal[] animais) {
    for (Animal animal : animais) {
        System.out.println(animal.som());
    }
}

public static void main(String[] args) {
    Animal[] animais = {new Cachorro(), new Gato()};
    emitirSom(animais);
}


//Questão 6:

class Motor {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
}

class Carro {
    private String marca;
    private Motor motor;

    public Carro(String marca, Motor motor) {
        this.marca = marca;
        this.motor = motor;
    }

    public void mostrarDetalhes() {
        System.out.println("Marca: " + marca + ", Potência do motor: " + motor.getPotencia());
    }
}

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(100);
        Carro carro = new Carro("Ford", motor);
        carro.mostrarDetalhes();
    }
}



//Questão 7:


import java.util.ArrayList;

class Professor {
    String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
}

class Escola {
    String nome;
    ArrayList<Professor> professores = new ArrayList<>();

    public Escola(String nome) {
        this.nome = nome;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void mostrarProfessores() {
        for (Professor professor : professores) {
            System.out.println(professor.nome);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("Escola A");
        Professor professor = new Professor("Prof. B");
        escola.adicionarProfessor(professor);
        escola.mostrarProfessores();
    }
}


//Questão 8:

import java.util.ArrayList;

class Empregado {
    String nome;
    String cargo;
    double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}

class Empresa {
    String nome;
    ArrayList<Empregado> empregados = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void mostrarEmpregados() {
        for (Empregado emp : empregados) {
            System.out.println(emp.nome + " - " + emp.cargo + " - " + emp.salario);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa X");
        Empregado empregado = new Empregado("João", "Gerente", 5000);
        empresa.adicionarEmpregado(empregado);
        empresa.mostrarEmpregados();
    }
}

//Questão 9:

interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo relatório");
    }
}

class Contrato implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo contrato");
    }
}

public class Main {
    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio();
        Imprimivel contrato = new Contrato();
        relatorio.imprimir();
        contrato.imprimir();
    }
}



//Questão 10:

class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(1, 2));
        System.out.println(calc.somar(1, 2, 3));
    }
}


//Questão 11:


abstract class Funcionario {
    public abstract String calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    @Override
    public String calcularSalario() {
        return "Salário baseado nas horas trabalhadas";
    }
}

class FuncionarioAssalariado extends Funcionario {
    @Override
    public String calcularSalario() {
        return "Salário fixo mensal";
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario funcHorista = new FuncionarioHorista();
        Funcionario funcAssalariado = new FuncionarioAssalariado();
        System.out.println(funcHorista.calcularSalario());
        System.out.println(funcAssalariado.calcularSalario());
    }
}


//Questão 12:


class Produto {
    double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double somar(Produto outroProduto) {
        return this.preco + outroProduto.preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(100);
        Produto p2 = new Produto(200);
        System.out.println(p1.somar(p2));
    }
}



//Questão 13:

class Matematica {
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Matematica.fatorial(5));
    }
}



//Questão 14:


class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {}

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }
}

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();
        System.out.println(config1 == config2);
    }
}


//Questão 15:

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque");
        }
        saldo -= valor;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            ContaBancaria conta = new ContaBancaria(100);
            conta.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}


