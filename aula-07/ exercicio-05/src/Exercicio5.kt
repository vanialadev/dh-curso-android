fun main(){

    val carro = Veiculo("fiat", "palio", 2020, "branco", 10)
    val cliente = Cliente("Ana",  "Lima ", "85988888888")
    val venda = Venda(1000.0, carro, cliente)

    val concessionaaria = Concessionaaria()

    concessionaaria.registrarVenda(carro, cliente, venda.valorDaVenda)
}

//e criar a função main. Dentro da função main, criar um carro,
//criar um cliente e registrar a venda desse veículo a esse cliente pela Concessionária.