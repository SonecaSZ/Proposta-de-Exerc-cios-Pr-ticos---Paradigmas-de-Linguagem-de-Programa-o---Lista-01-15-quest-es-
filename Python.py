#Questão 1:

class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

carro1 = Carro("Ford", "Mustang", 2020)
carro2 = Carro("Chevrolet", "Camaro", 2021)
carro3 = Carro("Toyota", "Corolla", 2019)

print(carro1.__dict__)
print(carro2.__dict__)
print(carro3.__dict__)


#Questão 2:

class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def acelerar(self):
        self.velocidade += 10

    def frear(self):
        self.velocidade -= 10

    def mostrar_velocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h")

carro = Carro("Ford", "Mustang", 2020)
carro.acelerar()
carro.mostrar_velocidade()
carro.frear()
carro.mostrar_velocidade()



#Questão 3:

class ContaBancaria:
    def __init__(self, titular):
        self.__saldo = 0
        self.titular = titular

    def depositar(self, valor):
        self.__saldo += valor

    def sacar(self, valor):
        if valor <= self.__saldo:
            self.__saldo -= valor
        else:
            print("Saldo insuficiente")

    def mostrar_saldo(self):
        print(f"Saldo: R${self.__saldo}")

conta = ContaBancaria("Maria")
conta.depositar(1000)
conta.mostrar_saldo()
conta.sacar(500)
conta.mostrar_saldo()
conta.sacar(600)


#Questão 4:

class Animal:
    def som(self):
        raise NotImplementedError("Subclasse deve implementar este método")

class Cachorro(Animal):
    def som(self):
        return "Latido"

class Gato(Animal):
    def som(self):
        return "Miau"

cachorro = Cachorro()
gato = Gato()

print(cachorro.som())
print(gato.som())



#Questão 5:

def emitir_som(animais):
    for animal in animais:
        print(animal.som())

cachorro = Cachorro()
gato = Gato()
emitir_som([cachorro, gato])



#Questão 6:

class Motor:
    def __init__(self, potencia):
        self.potencia = potencia

class Carro:
    def __init__(self, marca, motor):
        self.marca = marca
        self.motor = motor

motor = Motor(100)
carro = Carro("Ford", motor)
print(f"Marca: {carro.marca}, Potência do motor: {carro.motor.potencia}")


#Questão 7:

class Professor:
    def __init__(self, nome):
        self.nome = nome

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        self.professores.append(professor)

escola = Escola("Escola A")
professor = Professor("Prof. B")
escola.adicionar_professor(professor)
print([prof.nome for prof in escola.professores])


#Questão 8:


class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

empresa = Empresa("Empresa X")
empregado = Empregado("João", "Gerente", 5000)
empresa.adicionar_empregado(empregado)
print([(emp.nome, emp.cargo, emp.salario) for emp in empresa.empregados])


#Questão 9:

from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def imprimir(self):
        print("Imprimindo relatório")

class Contrato(Imprimivel):
    def imprimir(self):
        print("Imprimindo contrato")

relatorio = Relatorio()
contrato = Contrato()
relatorio.imprimir()
contrato.imprimir()


#Questão 10:

class Calculadora:
    def somar(self, a, b):
        return a + b

    def somar_tres(self, a, b, c):
        return a + b + c

calc = Calculadora()
print(calc.somar(1, 2))
print(calc.somar_tres(1, 2, 3))


#Questão 11:

from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def calcular_salario(self):
        return "Salário baseado nas horas trabalhadas"

class FuncionarioAssalariado(Funcionario):
    def calcular_salario(self):
        return "Salário fixo mensal"

func_horista = FuncionarioHorista()
func_assalariado = FuncionarioAssalariado()
print(func_horista.calcular_salario())
print(func_assalariado.calcular_salario())


#Questão 12:

class Produto:
    def __init__(self, preco):
        self.preco = preco

    def __add__(self, outro_produto):
        return self.preco + outro_produto.preco

p1 = Produto(100)
p2 = Produto(200)
print(p1 + p2)


#Questão 13:

class Matematica:
    @staticmethod
    def fatorial(n):
        if n == 0:
            return 1
        else:
            return n * Matematica.fatorial(n-1)

print(Matematica.fatorial(5))


#Questão 14:

class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
        return cls._instancia

config1 = Configuracao()
config2 = Configuracao()
print(config1 is config2)


#Questão 15:

class SaldoInsuficienteException(Exception):
    pass

class ContaBancaria:
    def __init__(self, saldo):
        self.saldo = saldo

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException("Saldo insuficiente para o saque")
        self.saldo -= valor

try:
    conta = ContaBancaria(100)
    conta.sacar(200)
except SaldoInsuficienteException as e:
    print(e)



