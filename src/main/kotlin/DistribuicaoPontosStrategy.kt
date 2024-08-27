class DistribuicaoPontosStrategy : DistribuicaoDeAtributosStrategy {
    override fun distribuirAtributos(): Atributos {
        val pontosDisponiveis = 27
        val atributos = Atributos(8, 8, 8, 8, 8, 8) // Valores iniciais base

        var pontosUtilizados = 0

        while (pontosUtilizados < pontosDisponiveis) {
            println("Distribua seus pontos entre os atributos (restantes: ${pontosDisponiveis - pontosUtilizados})")
            println("1. Força (FOR): ${atributos.forca}")
            println("2. Destreza (DES): ${atributos.destreza}")
            println("3. Constituição (CON): ${atributos.constituicao}")
            println("4. Inteligência (INT): ${atributos.inteligencia}")
            println("5. Sabedoria (SAB): ${atributos.sabedoria}")
            println("6. Carisma (CAR): ${atributos.carisma}")

            println("Escolha um atributo para incrementar (1-6): ")
            val escolha = readLine()?.toIntOrNull()

            println("Quantos pontos deseja adicionar? (1-15, custo baseado no valor final do atributo): ")
            val incremento = readLine()?.toIntOrNull()

            if (escolha != null && incremento != null && incremento > 0 && pontosUtilizados + incremento <= pontosDisponiveis) {
                val custo = calcularCusto(atributos, escolha, incremento)
                if (pontosUtilizados + custo <= pontosDisponiveis) {
                    pontosUtilizados += custo
                    aplicarIncremento(atributos, escolha, incremento)
                } else {
                    println("Não há pontos suficientes para essa distribuição.")
                }
            } else {
                println("Entrada inválida, tente novamente.")
            }
        }
        return atributos
    }

    private fun calcularCusto(atributos: Atributos, escolha: Int, incremento: Int): Int {
        var custo = 0
        val valorBase = when (escolha) {
            1 -> atributos.forca
            2 -> atributos.destreza
            3 -> atributos.constituicao
            4 -> atributos.inteligencia
            5 -> atributos.sabedoria
            6 -> atributos.carisma
            else -> 8
        }

        for (i in 0 until incremento) {
            val novoValor = valorBase + i + 1
            custo += when {
                novoValor in 8..13 -> 1
                novoValor == 14 -> 2
                novoValor == 15 -> 3
                else -> 0
            }
        }
        return custo
    }

    private fun aplicarIncremento(atributos: Atributos, escolha: Int, incremento: Int) {
        when (escolha) {
            1 -> atributos.forca += incremento
            2 -> atributos.destreza += incremento
            3 -> atributos.constituicao += incremento
            4 -> atributos.inteligencia += incremento
            5 -> atributos.sabedoria += incremento
            6 -> atributos.carisma += incremento
        }
    }
}
