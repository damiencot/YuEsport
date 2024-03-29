package fr.nansty.yuesport.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import fr.nansty.yuesport.R
import fr.nansty.yuesport.controllers.esport.apiEsport.EsportWrapper

class GameAdapter(private val dataList: List<EsportWrapper>, private val context: Context) : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var gameNameView: TextView
        init {
            gameNameView = itemView.findViewById(R.id.game_name)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.fragment_game_item,
                parent,
                false
            )
        )

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val esportWrapper = dataList[position]
        holder.gameNameView.text = esportWrapper.slugName

    }


}
