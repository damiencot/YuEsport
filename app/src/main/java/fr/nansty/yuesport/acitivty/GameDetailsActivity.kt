package fr.nansty.yuesport.acitivty

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import fr.nansty.yuesport.fragment.GameDetailsFragment

class GameDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().replace(android.R.id.content, GameDetailsFragment.newInstance())
            .commit()
    }
}