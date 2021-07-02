package be.technifutur.exo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class TwitterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twitter)


    }


    fun connexion(view: View){

        val loginOK = findViewById(R.id.twitterTextEmailAddress) as EditText

        if(loginOK.text.isNotEmpty()){
            connexionVerification(view)
        }else{
            alertMessage(view)
        }
    }

    fun connexionVerification(view: View){
        val intent = Intent(this, TwitterConnexion::class.java)
        startActivity(intent)
    }

    fun alertMessage(view: View){
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setMessage("Login incomplet")
            .setTitle("Erreur")

        val dialog: AlertDialog = builder.create()

        dialog.show()

    }
}