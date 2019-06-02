package fr.nansty.yuesport.acitivty

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import fr.nansty.yuesport.adapters.GameAdapter
import fr.nansty.yuesport.R
import fr.nansty.yuesport.apiEsport.ApiClient
import fr.nansty.yuesport.controllers.esport.apiEsport.EsportWrapper
import fr.nansty.yuesport.fragment.GameDetailsFragment
import fr.nansty.yuesport.fragment.GameFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GameActivity : AppCompatActivity() {



    private lateinit var gameFragment: GameFragment



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        gameFragment = supportFragmentManager.findFragmentById(R.id.game_fragment) as GameFragment

    }
}
