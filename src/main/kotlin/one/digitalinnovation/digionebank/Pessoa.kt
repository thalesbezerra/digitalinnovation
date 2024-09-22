package one.digitalinnovation.digionebank

class Pessoa{
    var nome: String = "Jether"

    var cpf: String = "123.123.123-11"
    private set // Não é mais possivel trocar o cpf que é o logico


//    Criando uma class inner para representar o endereço dentro da class Pessos.
//
//    inner class Endereco {
//        var rua: String = "Rua test"
//    }

}


fun main(){
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)

//    println(jether.Endereco().rua)

}