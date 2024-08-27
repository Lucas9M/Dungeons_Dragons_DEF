class Personagem(
    var nome: String,
    var raca: Raca,
    var atributos: Atributos
) {
    var pontosDeVida: Int = 10 + atributos.obterModificador(atributos.constituicao)

    fun exibirInformacoesPersonagem() {
        println("Nome: $nome")
        println("Raça: $raca")
        println("Força: ${atributos.forca} (Modificador: ${atributos.obterModificador(atributos.forca)})")
        println("Destreza: ${atributos.destreza} (Modificador: ${atributos.obterModificador(atributos.destreza)})")
        println("Constituição: ${atributos.constituicao} (Modificador: ${atributos.obterModificador(atributos.constituicao)})")
        println("Inteligência: ${atributos.inteligencia} (Modificador: ${atributos.obterModificador(atributos.inteligencia)})")
        println("Sabedoria: ${atributos.sabedoria} (Modificador: ${atributos.obterModificador(atributos.sabedoria)})")
        println("Carisma: ${atributos.carisma} (Modificador: ${atributos.obterModificador(atributos.carisma)})")
        println("Pontos de Vida: $pontosDeVida")
    }
}
