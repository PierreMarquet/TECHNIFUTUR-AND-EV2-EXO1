package be.technifutur.exo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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