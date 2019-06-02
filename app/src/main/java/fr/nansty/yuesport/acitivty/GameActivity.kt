package fr.nansty.yuesport.acitivty

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ProgressBar
import fr.nansty.yuesport.adapters.GameAdapter
import fr.nansty.yuesport.R
import fr.nansty.yuesport.apiEsport.ApiClient
import fr.nansty.yuesport.controllers.esport.apiEsport.EsportWrapper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GameActivity : AppCompatActivity(){


    companion object {
        private const val API_KEY = "LlLufAuCOgGMZX4Gft13ZYkexa9eCo_iX1_cUSOxHFMaxjHk7uA"
    }

    lateinit var recyclerView: RecyclerView

    var dataList = ArrayList<EsportWrapper>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        recyclerView = findViewById(R.id.recycler_view)

        recyclerView.adapter = GameAdapter(dataList, this)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        getData()

    }

    private fun getData() {
        val call: Call<List<EsportWrapper>> = ApiClient.getClient.getEsport(API_KEY)
        call.enqueue(object : Callback<List<EsportWrapper>> {

            override fun onResponse(call: Call<List<EsportWrapper>>?, response: Response<List<EsportWrapper>>?) {
                dataList.addAll(response!!.body()!!)
                recyclerView.adapter!!.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<EsportWrapper>>?, t: Throwable?) {
            }

        })
    }


}
