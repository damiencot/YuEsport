package fr.nansty.yuesport.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fr.nansty.yuesport.R
import fr.nansty.yuesport.acitivty.GameActivity
import fr.nansty.yuesport.adapters.GameAdapter
import fr.nansty.yuesport.apiEsport.ApiClient
import fr.nansty.yuesport.controllers.esport.apiEsport.EsportWrapper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GameFragment : Fragment(){

    companion object {
        private const val API_KEY = "LlLufAuCOgGMZX4Gft13ZYkexa9eCo_iX1_cUSOxHFMaxjHk7uA"
    }


    private lateinit var recyclerView: RecyclerView
    var dataList = ArrayList<EsportWrapper>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getData()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_game, container, false)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.adapter = GameAdapter(dataList, this)
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view

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