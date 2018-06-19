package com.example.cesar.uvminglesapp

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import android.view.View
import kotlinx.android.synthetic.main.activity_listening.*
import java.io.Serializable

class Listening : AppCompatActivity() {

    private var audiosList = emptyList<Pair<String,Serializable>>()
    private var answersList = emptyList<Pair<String,Serializable>>()
    private var answers = emptyMap<String,Serializable>()
    private var audios = emptyMap<String,Serializable>()
    private var index = 0
    private var  currentAnswer = ""
    var subject = ""

    private lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listening)
        startGame()
        //mp = MediaPlayer.create(this,R.raw.prog1java)
        audioClicker.setOnClickListener{
            mp.start()
        }
        option1.setOnClickListener{
            nextAudio(option1)
        }
        option2.setOnClickListener{
            nextAudio(option2)
        }
        option3.setOnClickListener{
            nextAudio(option3)
        }
        option4.setOnClickListener{
            nextAudio(option4)
        }
        Ok2.setOnClickListener {
            val cambio = Intent(this,Menu2::class.java)
            cambio.putExtra("subject",subject)
            startActivity(cambio)
        }
    }
    fun startGame(){
        var bundle = intent.extras
        subject = bundle.getString("subject")
        var setOfAudios = emptyArray<Map<String,Serializable>>()

        when(subject){
            "programming" -> {setOfAudios = ProgrammingAudios().getImages()}
            "networking" -> {setOfAudios = NetworkingAudio().getImages()}
            "technicalSupport" -> {setOfAudios = SupportAudio().getImages()}
        }

        audios = setOfAudios[0]
        answers = setOfAudios[1]
        audiosList = audios.toList()
        answersList = answers.toList()
        val audio = audiosList[index].first
        val optionList = audios[audio] as ArrayList<String>
        val answer = answersList[index].first
        currentAnswer = answers[answer].toString()

        mp = MediaPlayer.create(this,audio.toInt())

        option1.text = optionList[0]
        option2.text = optionList[1]
        option3.text = optionList[2]
        option4.text = optionList[3]

    }
    fun nextAudio(buttonText: Button){
        val handler = Handler()
        if(buttonText.text.equals(currentAnswer)){
            buttonText.setBackgroundColor(Color.GREEN)
            handler.postDelayed({
                index++
                if(index <= 2){
                    val audio = audiosList[index].first
                    val optionList = audios[audio] as ArrayList<String>
                    val answer =  answersList[index].first
                    currentAnswer = answers[answer].toString()

                    mp = MediaPlayer.create(this,audio.toInt())

                    option1.text = optionList[0]
                    option2.text = optionList[1]
                    option3.text = optionList[2]
                    option4.text = optionList[3]

                    option1.setBackgroundColor(resources.getColor(R.color.button_material_light))
                    option2.setBackgroundColor(resources.getColor(R.color.button_material_light))
                    option3.setBackgroundColor(resources.getColor(R.color.button_material_light))
                    option4.setBackgroundColor(resources.getColor(R.color.button_material_light))
                } else {
                    Ok2.visibility = View.VISIBLE

                }
            },1300)
        }else{
            buttonText.setBackgroundColor(Color.RED)
            Toast.makeText(this,"Wrong answer",Toast.LENGTH_SHORT).show()
        }
    }
}
