package one.digitalinnovation.digionebank

class Pessoa{
    var nome: String = "Jether"
    var cpf: String = "123.123.123-11"
        private set

    /*Criando uma class inner para representar o endereço dentro da class
    Pessos.
    Estudar sobre inner no chatgpt

     =============

    inner class Endereco {
        var rua: String = "Rua test"
    }

     */
}


fun main(){
    val jether = Pessoa()
    println(jether.nome)
    println(jether.cpf)

    //println(jether.Endereco().rua)
}