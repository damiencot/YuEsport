package fr.nansty.yuesport.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fr.nansty.yuesport.R

class GameDetailsFragment : Fragment(){

    companion object {

        fun newInstance() : GameDetailsFragment = GameDetailsFragment()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_game_detail, container, false)
    }
}