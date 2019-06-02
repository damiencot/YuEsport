package fr.nansty.yuesport.controllers.esport.apiEsport

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query



 const val API_KEY = "LlLufAuCOgGMZX4Gft13ZYkexa9eCo_iX1_cUSOxHFMaxjHk7uA"

interface OpenApiServiceEsport {

    @GET("leagues")
    fun getEsport(@Query("token") apiKey : String) : Call<List<EsportWrapper>>
}