package com.example.cesar.uvminglesapp

import android.util.Log
import java.io.Serializable

class Programming{
    private var mapImages = mapOf(
            R.mipmap.progra1.toString() to arrayListOf("Program","Lenguajes","Programming","Gramming"),
            R.mipmap.progra2.toString() to arrayListOf("Codding","Kotlin","Toast","Roast"),
            R.mipmap.progra3.toString() to arrayListOf("Thinking","Tincking","Though","Throw"),
            R.mipmap.progra4.toString() to arrayListOf("Freimguor","Framework","Dreimbrok","Remgor"),
            R.mipmap.progra5.toString() to arrayListOf("Good practices","DevOps","Eigth","Infinity"),
            R.mipmap.progra6.toString() to arrayListOf("Comments","Commit","Counturing","Selfi"))

    private var images:List<String> = listOf(
            R.mipmap.progra1.toString(),
            R.mipmap.progra2.toString(),
            R.mipmap.progra3.toString(),
            R.mipmap.progra4.toString(),
            R.mipmap.progra5.toString(),
            R.mipmap.progra6.toString())

    private var mapAnswers = mapOf(
            R.mipmap.progra1.toString() to "Program",
            R.mipmap.progra2.toString() to "Codding",
            R.mipmap.progra3.toString() to "Thinking",
            R.mipmap.progra4.toString() to "Framework",
            R.mipmap.progra5.toString() to "DevOps",
            R.mipmap.progra6.toString() to "Comments")

    fun getImages(): Array<Map<String, Serializable>> {

        images = images.shuffled().take(3)

        var filteredAnswers = mapAnswers.filter { it.key in images }
        var filteredImages = mapImages.filter { it.key in images }
        Log.wtf("LIST",mapImages.toString())
        return arrayOf(filteredImages,filteredAnswers)
    }

}
class Networking{
    private var mapImages = mapOf(
            R.mipmap.net1.toString() to arrayListOf("Cable","Internet Cable","Ethernet Cable","Phone Cable"),
            R.mipmap.net2.toString() to arrayListOf("Firewall","Firewal","Fairgual","Arduino"),
            R.mipmap.net3.toString() to arrayListOf("Fail Transfer Protocoll","File Transfer Process","Fire Transformer Protocol","File Transfer Protocol"),
            R.mipmap.net4.toString() to arrayListOf("OSI Modem","ISO Model","OSI Model","OSI ISO 9000"),
            R.mipmap.net5.toString() to arrayListOf("Ruter","Router","Modem","Rauter"),
            R.mipmap.net6.toString() to arrayListOf("Transistor Central Process","Transformer Control Protocol","Transfer Control Protocol","Transfer Console Protocol"))

    private var images:List<String> = listOf(
            R.mipmap.net1.toString(),
            R.mipmap.net2.toString(),
            R.mipmap.net3.toString(),
            R.mipmap.net4.toString(),
            R.mipmap.net5.toString(),
            R.mipmap.net6.toString())

    private var mapAnswers = mapOf(
            R.mipmap.net1.toString() to "Ethernet Cable",
            R.mipmap.net2.toString() to "Firewall",
            R.mipmap.net3.toString() to "File Transfer Protocol",
            R.mipmap.net4.toString() to "OSI Model",
            R.mipmap.net5.toString() to "Router",
            R.mipmap.net6.toString() to "Transfer Control Protocol")

    fun getImages(): Array<Map<String, Serializable>> {

        images = images.shuffled().take(3)

        var filteredAnswers = mapAnswers.filter { it.key in images }
        var filteredImages = mapImages.filter { it.key in images }
        Log.wtf("LIST",mapImages.toString())
        return arrayOf(filteredImages,filteredAnswers)
    }
}
class Support{
    private var mapImages = mapOf(
            R.mipmap.sup1.toString() to arrayListOf("Processor","Proccesor","Prosseccor","Proses"),
            R.mipmap.sup2.toString() to arrayListOf("Pawer Supply","Poweer Supply","Power Suplai","Power Supply"),
            R.mipmap.sup3.toString() to arrayListOf("Randy Atcess Memory","Random Access Memory","Ramsus Alfa Memory","Radio Alen Merch"),
            R.mipmap.sup4.toString() to arrayListOf("Soccer","Sooket","Socket","Saket"),
            R.mipmap.sup5.toString() to arrayListOf("Graphic Card","Grapic Card","Graphic Card","Grafic Car"),
            R.mipmap.sup6.toString() to arrayListOf("Fan","Fen","Fin","Fun"))

    private var images:List<String> = listOf(
            R.mipmap.sup1.toString(),
            R.mipmap.sup2.toString(),
            R.mipmap.sup3.toString(),
            R.mipmap.sup4.toString(),
            R.mipmap.sup5.toString(),
            R.mipmap.sup6.toString())

    private var mapAnswers = mapOf(
            R.mipmap.sup1.toString() to "Processor",
            R.mipmap.sup2.toString() to "Power Supply",
            R.mipmap.sup3.toString() to "Random Access Memory",
            R.mipmap.sup4.toString() to "Socket",
            R.mipmap.sup5.toString() to "Graphic Card",
            R.mipmap.sup6.toString() to "Fan")

    fun getImages(): Array<Map<String, Serializable>> {

        images = images.shuffled().take(3)

        var filteredAnswers = mapAnswers.filter { it.key in images }
        var filteredImages = mapImages.filter { it.key in images }
        Log.wtf("LIST",mapImages.toString())
        return arrayOf(filteredImages,filteredAnswers)
    }
}