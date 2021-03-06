package com.github.thaynarasilvapinto.api.response

import java.time.LocalDateTime

data class DepositoResponse(
        val idOperacao: String,
        val valorOperacao: Double,
        val dataHora: LocalDateTime,
        val tipoOperacao: TipoOperacao
)