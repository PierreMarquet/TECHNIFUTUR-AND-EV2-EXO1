package be.technifutur.exo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class TwitterActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twitter)

       //binding = ActivityMainBinding.inflate(layoutInflater)
       //setContentView(binding.root)

        connexion()

    }


    private fun connexion() {

        val loginOK = findViewById<EditText>(R.id.twitterTextEmailAddress)

        if(loginOK.text.isNotEmpty()){
            connexionVerification()

        }else{
            alertMessage()

        }
    }

    fun connexionVerification() {
        val intent = Intent(this, TwitterConnexion::class.java)
        startActivity(intent)
    }

    private fun alertMessage() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setMessage("Login incomplet")
            .setTitle("Erreur")

        val dialog: AlertDialog = builder.create()

        dialog.show()

    }
}