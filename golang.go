//Questão 1:

package main
import "fmt"

type Carro struct {
    Marca  string
    Modelo string
    Ano    int
}

func main() {
    carro1 := Carro{"Ford", "Mustang", 2020}
    carro2 := Carro{"Chevrolet", "Camaro", 2021}
    carro3 := Carro{"Toyota", "Corolla", 2019}

    fmt.Println(carro1)
    fmt.Println(carro2)
    fmt.Println(carro3)
}

//Questão 2:

package main
import "fmt"

type Carro struct {
    Marca      string
    Modelo     string
    Ano        int
    Velocidade int
}

func (c *Carro) Acelerar() {
    c.Velocidade += 10
}

func (c *Carro) Frear() {
    c.Velocidade -= 10
}

func (c Carro) MostrarVelocidade() {
    fmt.Printf("Velocidade atual: %d km/h\n", c.Velocidade)
}

func main() {
    carro := Carro{"Ford", "Mustang", 2020, 0}
    carro.Acelerar()
    carro.MostrarVelocidade()
    carro.Frear()
    carro.MostrarVelocidade()
}

//Questão 3:



package main
import "fmt"

type ContaBancaria struct {
    titular string
    saldo   float64
}

func (c *ContaBancaria) Depositar(valor float64) {
    c.saldo += valor
}

func (c *ContaBancaria) Sacar(valor float64) {
    if valor <= c.saldo {
        c.saldo -= valor
    } else {
        fmt.Println("Saldo insuficiente")
    }
}

func (c ContaBancaria) MostrarSaldo() {
    fmt.Printf("Saldo: R$%.2f\n", c.saldo)
}

func main() {
    conta := ContaBancaria{"Maria", 0}
    conta.Depositar(1000)
    conta.MostrarSaldo()
    conta.Sacar(500)
    conta.MostrarSaldo()
    conta.Sacar(600)
}

//Questão 4:


package main
import "fmt"

type Animal interface {
    Som() string
}

type Cachorro struct{}

func (Cachorro) Som() string {
    return "Latido"
}

type Gato struct{}

func (Gato) Som() string {
    return "Miau"
}

func main() {
    var cachorro Animal = Cachorro{}
    var gato Animal = Gato{}

    fmt.Println(cachorro.Som())
    fmt.Println(gato.Som())
}

//Questão 5:

func EmitirSom(animais []Animal) {
    for _, animal := range animais {
        fmt.Println(animal.Som())
    }
}

func main() {
    animais := []Animal{Cachorro{}, Gato{}}
    EmitirSom(animais)
}

//Questão 6:

package main
import "fmt"

type Motor struct {
    Potencia int
}

type Carro struct {
    Marca string
    Motor Motor
}

func main() {
    motor := Motor{100}
    carro := Carro{"Ford", motor}
    fmt.Printf("Marca: %s, Potência do motor: %d\n", carro.Marca, carro.Motor.Potencia)
}

//Questão 7:

package main
import "fmt"

type Professor struct {
    Nome string
}

type Escola struct {
    Nome       string
    Professores []Professor
}

func (e *Escola) AdicionarProfessor(p Professor) {
    e.Professores = append(e.Professores, p)
}

func main() {
    escola := Escola{"Escola A", []Professor{}}
    professor := Professor{"Prof. B"}
    escola.AdicionarProfessor(professor)

    for _, prof := range escola.Professores {
        fmt.Println(prof.Nome)
    }
}

//Questão 8:

package main
import "fmt"

type Empregado struct {
    Nome   string
    Cargo  string
    Salario float64
}

type Empresa struct {
    Nome       string
    Empregados []Empregado
}

func (e *Empresa) AdicionarEmpregado(emp Empregado) {
    e.Empregados = append(e.Empregados, emp)
}

func main() {
    empresa := Empresa{"Empresa X", []Empregado{}}
    empregado := Empregado{"João", "Gerente", 5000}
    empresa.AdicionarEmpregado(empregado)

    for _, emp := range empresa.Empregados {
        fmt.Printf("%s - %s - %.2f\n", emp.Nome, emp.Cargo, emp.Salario)
    }
}

//Questão 9:

package main
import "fmt"

type Imprimivel interface {
    Imprimir()
}

type Relatorio struct{}
func (Relatorio) Imprimir() {
    fmt.Println("Imprimindo relatório")
}

type Contrato struct{}
func (Contrato) Imprimir() {
    fmt.Println("Imprimindo contrato")
}

func main() {
    var relatorio Imprimivel = Relatorio{}
    var contrato Imprimivel = Contrato{}
    relatorio.Imprimir()
    contrato.Imprimir()
}

//Questão 10:

package main
import "fmt"

type Calculadora struct{}

func (Calculadora) Somar(a, b int) int {
    return a + b
}

func (Calculadora) SomarTres(a, b, c int) int {
    return a + b + c
}

func main() {
    calc := Calculadora{}
    fmt.Println(calc.Somar(1, 2))
    fmt.Println(calc.SomarTres(1, 2, 3))
}

//Questão 11:

package main
import "fmt"

type Funcionario interface {
    CalcularSalario() string
}

type FuncionarioHorista struct{}
func (FuncionarioHorista) CalcularSalario() string {
    return "Salário baseado nas horas trabalhadas"
}

type FuncionarioAssalariado struct{}
func (FuncionarioAssalariado) CalcularSalario() string {
    return "Salário fixo mensal"
}

func main() {
    var funcHorista Funcionario = FuncionarioHorista{}
    var funcAssalariado Funcionario = FuncionarioAssalariado{}
    fmt.Println(funcHorista.CalcularSalario())
    fmt.Println(funcAssalariado.CalcularSalario())
}

//Questão 12:

package main
import "fmt"

type Produto struct {
    Preco float64
}

func (p Produto) Somar(outro Produto) float64 {
    return p.Preco + outro.Preco
}

func main() {
    p1 := Produto{100}
    p2 := Produto{200}
    fmt.Println(p1.Somar(p2))
}

//Questão 13:

package main
import "fmt"

type Matematica struct{}

func (Matematica) Fatorial(n int) int {
    if n == 0 {
        return 1
    }
    return n * Matematica{}.Fatorial(n-1)
}

func main() {
    fmt.Println(Matematica{}.Fatorial(5))
}

//Questão 14:

package main
import "fmt"

type Configuracao struct{}

var instancia *Configuracao

func GetInstancia() *Configuracao {
    if instancia == nil {
        instancia = &Configuracao{}
    }
    return instancia
}

func main() {
    config1 := GetInstancia()
    config2 := GetInstancia()
    fmt.Println(config1 == config2)
}

//Questão 15:

package main
import (
    "errors"
    "fmt"
)

type ContaBancaria struct {
    Saldo float64
}

func (c *ContaBancaria) Sacar(valor float64) error {
    if valor > c.Saldo {
        return errors.New("saldo insuficiente para o saque")
    }
    c.Saldo -= valor
    return nil
}

func main() {
    conta := ContaBancaria{100}
    err := conta.Sacar(200)
    if err != nil {
        fmt.Println(err)
    }
}





