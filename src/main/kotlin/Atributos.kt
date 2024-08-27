data class Atributos(
    var forca: Int,
    var destreza: Int,
    var constituicao: Int,
    var inteligencia: Int,
    var sabedoria: Int,
    var carisma: Int
) {
    fun obterModificador(atributo: Int): Int {
        return (atributo - 10) / 2
    }
}
