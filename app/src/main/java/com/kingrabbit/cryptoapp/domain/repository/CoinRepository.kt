package com.kingrabbit.cryptoapp.domain.repository

import com.kingrabbit.cryptoapp.data.remote.dto.CoinDetailDto
import com.kingrabbit.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}
