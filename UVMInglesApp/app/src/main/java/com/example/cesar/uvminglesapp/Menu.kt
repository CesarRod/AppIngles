package com.example.cesar.uvminglesapp

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.content_menu.*

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(toolbar)

        val intent = Intent(this,Menu2::class.java)
        button3.setOnClickListener{
            intent.putExtra("subject","technicalSupport")
            startActivity(intent)
            finish()
        }
        button2.setOnClickListener{
            intent.putExtra("subject", "programming")
            startActivity(intent)
            finish()
        }
        button.setOnClickListener{
            intent.putExtra("subject","networking")
            startActivity(intent)
            finish()
        }
    }

}
