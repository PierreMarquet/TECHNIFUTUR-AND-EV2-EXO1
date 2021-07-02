package be.technifutur.exo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import be.technifutur.exo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun sendTwitter(view: View){
        val intent = Intent(this, TwitterActivity::class.java)
        startActivity(intent)
    }

    fun sendFacebook(view: View){
        val intent = Intent(this, FacebookActivity::class.java)
        startActivity(intent)
    }

    fun sendBloggies(view: View){
        val intent = Intent(this, BloggiesActivity::class.java)
        startActivity(intent)
    }
}