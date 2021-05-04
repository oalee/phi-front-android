package xyz.lrhm.phiapp.core.data.source

import xyz.lrhm.phiapp.core.data.source.remoteDataSource.RemoteDataSource
import javax.inject.Inject

class AppRepository @Inject constructor(
    val remoteDataSource: RemoteDataSource
) {

    suspend fun doLogin(username: String, password: String) = remoteDataSource.login(username, password)


}