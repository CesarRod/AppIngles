package com.example.cesar.uvminglesapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu2.*

class Menu2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
        val bundle  = intent.extras
        val subject = bundle.getString("subject")

        button4.setOnClickListener{
            var intent1 = Intent(this,Concepts::class.java)
            intent1.putExtra("subject",subject)
            startActivity(intent1)
            finish()
        }
        button5.setOnClickListener{

            var intent1 = Intent(this,Listening::class.java)
            intent1.putExtra("subject",subject)
            startActivity(intent1)
           finish()
            //Toast.makeText(this,"Aun no funciona esta parte", Toast.LENGTH_LONG).show()

        }
        button6.setOnClickListener{

            var intent1 = Intent(this, Reading::class.java)
            intent1.putExtra("subject", subject)
            startActivity(intent1)
            finish()
            //Toast.makeText(this,"Aun no funciona esta parte", Toast.LENGTH_LONG).show()

        }

    }

}
