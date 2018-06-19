package com.example.cesar.uvminglesapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import kotlinx.android.synthetic.main.activity_listening.*
import kotlinx.android.synthetic.main.content_menu.*
import java.io.Serializable

class Listening : AppCompatActivity() {

    private var audiosList = emptyList<Pair<String,Serializable>>()
    private var answersList = emptyList<Pair<String,Serializable>>()
    private var answers = emptyMap<String,Serializable>()
    private var audios = emptyMap<String,Serializable>()
    private var index = 0

    private lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listening)
        //mp = MediaPlayer.create(this,R.raw.prog1java)
        //audioClicker.setOnClickListener{
          //  mp.start()
        //}
        option1.setOnClickListener{

        }
        option2.setOnClickListener{

        }
        option3.setOnClickListener{

        }
        option4.setOnClickListener{

        }
    }
    fun startGame(){
        var bundle = intent.extras
        var subject = bundle.getString("subject")
        var setOfAudios = emptyArray<Map<String,Serializable>>()

        when(subject){
            "programming" -> {setOfAudios = ProgrammingAudios().getImages()}
            "networking" -> {setOfAudios = NetworkingAudio().getImages()}
            "support" -> {setOfAudios = SupportAudio().getImages()}
        }

        //audios = setOfAudios
    }

}
