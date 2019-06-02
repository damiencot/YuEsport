package fr.nansty.yuesport.controllers.esport.apiEsport

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class EsportWrapper(
    //@Expose @SerializedName("videogame")val videoGame: VideoGameData,
    @SerializedName("slug")val slugName : String
    //val series: Array<SeriesData>
)


data class VideoGameData(
    @SerializedName("slug") val slugGame: String
) {

}

data class SeriesData(
    @SerializedName("year") val yearSeries: Int,
    @SerializedName("slug") val slugSeries: String
) {

}
