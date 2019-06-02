package fr.nansty.yuesport.adapters

import android.net.sip.SipSession
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import fr.nansty.yuesport.R
import fr.nansty.yuesport.controllers.esport.apiEsport.EsportWrapper
import fr.nansty.yuesport.fragment.GameFragment

class GameAdapter(
    private val dataList: List<EsportWrapper>,
    val listener: Listener
) : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    interface Listener {
        fun onItemClick(esportWrapper: EsportWrapper)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var gameNameView: TextView = itemView.findViewById(R.id.game_name)

        fun bind(esportWrapper: EsportWrapper, listener: Listener) {
            itemView.setOnClickListener { listener.onItemClick(esportWrapper) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
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
        holder.bind(esportWrapper, listener)

    }


}
