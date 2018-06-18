package com.example.cesar.uvminglesapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_concepts.*

import java.io.Serializable


class Concepts : AppCompatActivity() {
    private var imagesList = emptyList<Pair<String,Serializable>>()
    private var answersList = emptyList<Pair<String,Serializable>>()
    private var answers =  emptyMap<String,Serializable>()
    private var images = emptyMap<String,Serializable>()
    private var index = 0
    private var currentAnswer= ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_concepts)
        startGame()
        //indice.text = index.toString()


        op1.setOnClickListener{
            nextImage(op1)
        }
        op2.setOnClickListener{
            nextImage(op2)
        }
        op3.setOnClickListener{
            nextImage(op3)
        }
        op4.setOnClickListener{
            nextImage(op4)
        }
    }

    fun nextImage(buttonText: Button) {
        val handler = Handler()
        if(buttonText.text.equals(currentAnswer)) {
            buttonText.setBackgroundColor(Color.GREEN)
            handler.postDelayed({
                index++
                //indice.text = index.toString()
                if (index <= 2) {

                    val image = imagesList[index].first
                    val optionsList = images[image] as ArrayList<String>
                    val answer = answersList[index].first
                    currentAnswer = answers[answer].toString()
                    indice.text = currentAnswer

                    conceptImage.setImageResource(image.toInt())
                    op1.text = optionsList[0]
                    op2.text = optionsList[1]
                    op3.text = optionsList[2]
                    op4.text = optionsList[3]
                    op1.setBackgroundColor(resources.getColor(R.color.button_material_light))
                    op2.setBackgroundColor(resources.getColor(R.color.button_material_light))
                    op3.setBackgroundColor(resources.getColor(R.color.button_material_light))
                    op4.setBackgroundColor(resources.getColor(R.color.button_material_light))
                } else {
                    Toast.makeText(this, "Finished activity", Toast.LENGTH_SHORT).show()
                }
            },1400)

        }else{

            buttonText.setBackgroundColor(Color.RED)
            Toast.makeText(this,"Try again",Toast.LENGTH_SHORT).show()
        }

    }
    fun startGame(){
        var bundle = intent.extras
        var subject = bundle.getString("subject")
        var setOfImages = emptyArray<Map<String,Serializable>>()

        when(subject){
            "programming" -> {setOfImages = Programming().getImages()}
            "networking" -> {setOfImages = Networking().getImages()}
            "support" -> {setOfImages = Support().getImages()}
        }

        images = setOfImages[0]
        answers = setOfImages[1]
        imagesList = images.toList()//Se hace una lista para tener las llaves
        answersList = answers.toList()
        val image = imagesList[index].first
        val optionsList = images[image] as ArrayList<String>
        val answer = answersList[index].first
        currentAnswer = answers[answer].toString()
        indice.text = currentAnswer
        //Asi cambiamos de imagen
        conceptImage.setImageResource(image.toInt())

        op1.text = optionsList[0]
        op2.text = optionsList[1]
        op3.text = optionsList[2]
        op4.text = optionsList[3]




    }
}
