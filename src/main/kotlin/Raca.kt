enum class Raca(
    val bonusForca: Int = 0,
    val bonusDestreza: Int = 0,
    val bonusConstituicao: Int = 0,
    val bonusInteligencia: Int = 0,
    val bonusSabedoria: Int = 0,
    val bonusCarisma: Int = 0
) {
    HUMANO(1, 1, 1, 1, 1, 1),
    ANAO(0, 0, 2, 0, 0, 0),
    ELFO(0, 2, 0, 0, 0, 0),
    HALFLING(0, 2, 0, 0, 0, 0),
    // Adicione outras raças conforme necessário
}

fun aplicarBonusRacial(atributos: Atributos, raca: Raca): Atributos {
    atributos.forca += raca.bonusForca
    atributos.destreza += raca.bonusDestreza
    atributos.constituicao += raca.bonusConstituicao
    atributos.inteligencia += raca.bonusInteligencia
    atributos.sabedoria += raca.bonusSabedoria
    atributos.carisma += raca.bonusCarisma
    return atributos
}
