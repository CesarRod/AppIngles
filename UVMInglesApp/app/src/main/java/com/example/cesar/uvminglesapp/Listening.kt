package com.example.cesar.uvminglesapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import kotlinx.android.synthetic.main.activity_listening.*
import kotlinx.android.synthetic.main.content_menu.*

class Listening : AppCompatActivity() {

    private lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listening)
        mp = MediaPlayer.create(this,R.raw.prog1java)
        audioClicker.setOnClickListener{
            mp.start()
        }
    }
}
