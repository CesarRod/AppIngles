package com.example.cesar.uvminglesapp

import android.util.Log
import java.io.Serializable

class ProgrammingAudios{
    private var mapImages = mapOf(
            R.raw.prog1java.toString() to arrayListOf("Jave","Jawi","Jama","Java"),
            R.raw.prog2com.toString() to arrayListOf("Algorithm","Algorit","Argotim","Algorhirthm"),
            R.raw.prog3poo.toString() to arrayListOf("Orned Oject Process","Orientes Object Program","Oriented Object Programming","Orience Object Programming"),
            R.raw.prog4sw.toString() to arrayListOf("Software","Soware","Somwhere","Sofwar"),
            R.raw.prog5javascript.toString() to arrayListOf("John Script","JavaScript","TypeScript","Emma Script"),
            R.raw.prog6cpp.toString() to arrayListOf("C less plus","C#","C plus plus","F"))

    private var images:List<String> = listOf(
            R.raw.prog1java.toString(),
            R.raw.prog2com.toString(),
            R.raw.prog3poo.toString(),
            R.raw.prog4sw.toString(),
            R.raw.prog5javascript.toString(),
            R.raw.prog6cpp.toString())

    private var mapAnswers = mapOf(
            R.raw.prog1java.toString() to "Java",
            R.raw.prog2com.toString() to "Algorithm",
            R.raw.prog3poo.toString() to "Oriented Object Programming",
            R.raw.prog4sw.toString() to "Software",
            R.raw.prog5javascript.toString() to "JavaScript",
            R.raw.prog6cpp.toString() to "C plus plus")

    fun getImages(): Array<Map<String, Serializable>> {

        images = images.shuffled().take(3)

        var filteredAnswers = mapAnswers.filter { it.key in images }
        var filteredImages = mapImages.filter { it.key in images }
        Log.wtf("LIST",mapImages.toString())
        return arrayOf(filteredImages,filteredAnswers)
    }

}
class NetworkingAudio{
    private var mapImages = mapOf(
            R.raw.net1lan.toString() to arrayListOf("Lucas Arean Network","Local Area Network","Locl Are Network","Lol Area Network"),
            R.raw.net2gateway.toString() to arrayListOf("Gayteguay","Gatewat","Gateway","Gatway"),
            R.raw.net3fibra.toString() to arrayListOf("Optic Fiber","Octic Fiver","Ortic Fiva","Octic Fiber"),
            R.raw.net4firewall.toString() to arrayListOf("Firewall","Firewal","Fairgual","Arduino"),
            R.raw.net5ftp.toString() to arrayListOf("Fail Transfer Protocoll","File Transfer Process","Fire Transformer Protocol","File Transfer Protocol"),
            R.raw.net6tcpip.toString() to arrayListOf("Transistor Central Process","Transformer Control Protocol","Transfer Control Protocol","Transfer Console Protocol"))

    private var images:List<String> = listOf(
            R.raw.net1lan.toString(),
            R.raw.net2gateway.toString(),
            R.raw.net3fibra.toString(),
            R.raw.net4firewall.toString(),
            R.raw.net5ftp.toString(),
            R.raw.net6tcpip.toString())

    private var mapAnswers = mapOf(
            R.raw.net1lan.toString() to "Local Area Network",
            R.raw.net2gateway.toString() to "Gateway",
            R.raw.net3fibra.toString() to "Optic Fiber",
            R.raw.net4firewall.toString() to "Firewall",
            R.raw.net5ftp.toString() to "File Transfer Protocol",
            R.raw.net6tcpip.toString() to "Transfer Control Protocol")

    fun getImages(): Array<Map<String, Serializable>> {

        images = images.shuffled().take(3)

        var filteredAnswers = mapAnswers.filter { it.key in images }
        var filteredImages = mapImages.filter { it.key in images }
        Log.wtf("LIST",mapImages.toString())
        return arrayOf(filteredImages,filteredAnswers)
    }
}
class SupportAudio{
    private var mapImages = mapOf(
            R.raw.supp1comp.toString() to arrayListOf("Processor","Proccesor","Prosseccor","Proses"),
            R.raw.supp2socket.toString() to arrayListOf("Soccer","Sooket","Socket","Saket"),
            R.raw.supp3ram.toString() to arrayListOf("Randy Atcess Memory","Random Access Memory","Ramsus Alfa Memory","Radio Alen Merch"),
            R.raw.supp4fuente.toString() to arrayListOf("Pawer Supply","Poweer Supply","Power Suplai","Power Supply"),
            R.raw.supp5cpu.toString() to arrayListOf("CPU","GPU","FPU","FPS"),
            R.raw.supp6software.toString() to arrayListOf("Software","Soware","Somwhere","Sofwar"))

    private var images:List<String> = listOf(
            R.raw.supp1comp.toString(),
            R.raw.supp2socket.toString(),
            R.raw.supp3ram.toString(),
            R.raw.supp4fuente.toString(),
            R.raw.supp5cpu.toString(),
            R.raw.supp6software.toString())

    private var mapAnswers = mapOf(
            R.raw.supp1comp.toString() to "Processor",
            R.raw.supp2socket.toString() to "Socket",
            R.raw.supp3ram.toString() to "Random Access Memory",
            R.raw.supp4fuente.toString() to "Power Supply",
            R.raw.supp5cpu.toString() to "CPU",
            R.raw.supp6software.toString() to "Software")

    fun getImages(): Array<Map<String, Serializable>> {

        images = images.shuffled().take(3)

        var filteredAnswers = mapAnswers.filter { it.key in images }
        var filteredImages = mapImages.filter { it.key in images }
        Log.wtf("LIST",mapImages.toString())
        return arrayOf(filteredImages,filteredAnswers)
    }
}


