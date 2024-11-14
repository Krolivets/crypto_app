package com.kingrabbit.cryptoapp.data.repository

import com.kingrabbit.cryptoapp.data.remote.CoinPaprikaApi
import com.kingrabbit.cryptoapp.data.remote.dto.CoinDetailDto
import com.kingrabbit.cryptoapp.data.remote.dto.CoinDto
import com.kingrabbit.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl
    @Inject
    constructor(
        private val api: CoinPaprikaApi,
    ) : CoinRepository {
        override suspend fun getCoins(): List<CoinDto> = api.getCoins()

        override suspend fun getCoinById(coinId: String): CoinDetailDto = api.getCoinById(coinId)
    }
