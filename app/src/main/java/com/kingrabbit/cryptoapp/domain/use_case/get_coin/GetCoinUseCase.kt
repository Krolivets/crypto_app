package com.kingrabbit.cryptoapp.domain.use_case.get_coin

import com.kingrabbit.cryptoapp.common.Resource
import com.kingrabbit.cryptoapp.data.remote.dto.toCoinDetail
import com.kingrabbit.cryptoapp.domain.model.CoinDetail
import com.kingrabbit.cryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinUseCase
    @Inject
    constructor(
        private val repository: CoinRepository,
    ) {
        operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> =
            flow {
                try {
                    emit(Resource.Loading<CoinDetail>())
                    val coin = repository.getCoinById(coinId).toCoinDetail()
                    emit(Resource.Success<CoinDetail>(coin))
                } catch (e: HttpException) {
                    emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occurred"))
                } catch (e: IOException) {
                    emit(Resource.Error<CoinDetail>("Couldn't reach server. Check your internet connection!"))
                }
            }
    }
