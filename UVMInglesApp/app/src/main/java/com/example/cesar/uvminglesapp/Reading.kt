package com.example.ruth.proyecto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_reading.*

class Reading : AppCompatActivity() {

    var respuesta: String = ""
    var contador = 0
    var tema = "technical"
    var opciones: List<Int> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading)

        var numeros: List<Int> = listOf(0,1,2,3,4,5)
        opciones = numeros.shuffled().take(3)

        //val bundle = intent.extras
        //val tema = bundle.getString("subject")
        temaSelect()
        //img.setImageResource(R.mipmap.)
        Log.wtf("opciones", opciones.toString())

        op1.setOnClickListener {
            nextText(op1.text.toString())
        }
        op2.setOnClickListener {
            nextText(op2.text.toString())
        }
        op3.setOnClickListener {
            nextText(op3.text.toString())
        }
        op4.setOnClickListener {
            nextText(op4.text.toString())
        }

        bt1.setOnClickListener {
            finish()
        }

    }

    fun nextText(valor: String){
        val handler = Handler()

        if (valor.equals(respuesta)){
            Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show()
            contador++
            if(contador<3)
                handler.postDelayed({temaSelect()}, 2000)
                //temaSelect()
            else
                //handler.postDelayed({bt1.visibility = View.VISIBLE}, 2000)
                bt1.visibility = View.VISIBLE
        } else{

            Toast.makeText(this, "Respuesta incorrecta, pruebe de nuevo", Toast.LENGTH_SHORT).show()
        }

    }

    fun temaSelect(){
        when(tema){
            "technical" -> { respuesta = technical(opciones.elementAt(contador)) }
            "programming" -> { respuesta = programming(opciones.elementAt(contador)) }
            "networking" -> { respuesta = networking(opciones.elementAt(contador)) }
        }
    }

    fun technical(opt : Int):String{

        val texto1: List<String> = listOf("Two colleagues have identical machines, yet one is running at twice the speed. The solution for the slower worker is likely to be better __________ rather than an expensive upgrade of memory or the replacement of equipment.", "A user calls you to say that he got the blue screen of death. It's important to __________ the error by running anti-virus software, checking whether there's enough memory space and identifying the impact of any recent software or hardware changes.", "Downloads are taking too long, first run a test to find out your download and upload speeds and check if they are consistent with those advertised by your internet provider. One way to hit the accelerator involves the __________ System (DNS), which converts numerical internet protocol addresses into web names.", "There are a lot of pop-up ads, some pop-ups are unavoidable, such as warnings from your operating system highlighting security and performance issues needing attention. But if they come from an unexpected source then that’s a sign all is not well and that the machine may be infected with __________, run security software that will get rid of this kind of malware.", "Printer issues tend to revolve around ensuring that __________ and software are installed on the computer you want to print from. It's possible that the driver has become corrupted, meaning it needs to be reinstalled.","A computer is shutting down for no good reason, it’s important to open it and clean it, a lot of people don’t understand that their computers can __________ and that they may need to be cleared of dust periodically.")

        val respuestas: List<String> = listOf("housekeeping","troubleshoot","Domain Name","adware","drivers","overheat")

        val opciones: Map<Int,List<String>> = hashMapOf (0 to listOf("housekeeping","memory","usage","processor"), 1 to listOf("erase","ignore","delete","troubleshoot"), 2 to listOf("Direct Number","Download Need","Domain Name","Domain Numer"), 3 to listOf("keylogger","software","ransomware","adware"), 4 to listOf("firmware","drivers","platform","devices"), 5 to listOf("overheat","stuck","overload","break"))

        txt1.setText(texto1.get(opt))
        var chose = opciones.get(opt)

        op1.setText(chose!!.get(0))
        op2.setText(chose!!.get(1))
        op3.setText(chose!!.get(2))
        op4.setText(chose!!.get(3))

        return respuestas.get(opt)
    }

    fun programming(opt : Int):String{

        val texto1: List<String> = listOf("If you have to work in a common project __________ code control systems, such as Git or Subversion, are great tools that allow multiple developers to work simultaneously on the same code base without stepping on each others’ toes.","Even the best, most carefully crafted code is going to have bugs. Naturally, developers have to regularly devote time to tracking down and fixing software defects, whether in their own code or in someone else’s. While some bugs can be quickly found and squashed, others can be maddeningly elusive and can lead to many lost hours of good __________ time, there are a lot of IDES that have tools for debug.","There are many __________ that help Java developers execute rapid web application development, some of them include Eclipse, NetBeans and IntelliJ IDEA. Each of them has their own set of features, functions, and benefits. But the decision of choosing it depends on the nature of the Java project, business and application needs.","JavaScript and Java are completely __________ languages, both in concept and design. JavaScript was invented by Brendan Eich in 1995, and became an ECMA standard in 1997. ECMA-262 is the official name of the standard. ECMAScript is the official name of the language.", "When it comes to choosing a __________, one of the biggest decisions is picking a relational (SQL) or non-relational (NoSQL) data structure. There are certain key differences: MySQL is a strong choice for any business that will benefit from its pre-defined structure and set schemas and MongoDB is a good choice for businesses that have rapid growth or databases with no clear schema definitions.", "A good programmer always knows that in computer programming, a __________ is a storage location and an associated symbolic name which contains some known or unknown quantity or information.")

        val respuestas: List<String> = listOf("source","development","IDEs","different","database","variable")

        val opciones: Map<Int,List<String>> = hashMapOf (0 to listOf("base","source","language","database"), 1 to listOf("development","debugger","writing","studying"), 2 to listOf("Platforms","IDEs (Integrated Development Environment)","GUI (Graphical User Interface)","Environment"), 3 to listOf("equal","different","complex","easy"), 4 to listOf("data warehouse","database","structure","schema"), 5 to listOf("list","variable","hash table","constant"))

        txt1.setText(texto1.get(opt))
        var chose = opciones.get(opt)

        op1.setText(chose!!.get(0))
        op2.setText(chose!!.get(1))
        op3.setText(chose!!.get(2))
        op4.setText(chose!!.get(3))

        return respuestas.get(opt)

    }

    fun networking(opt : Int):String{
        val texto1: List<String> = listOf("Think of a __________ as a network's virtual shape or structure. This shape does not necessarily correspond to the current physical layout of the devices on the network.  The computers on a home network may be arranged in a circle in a family room, but it would be highly unlikely to find a ring __________ there.","A __________ network generally requires more cable, but a failure in any star network cable will only take down one computer's network access and not the entire LAN.","When you send or receive data, the message gets divided into little chunks called packets. Each of these packets contains both the sender's Internet address and the receiver's address. Any packet is sent first to a __________ computer that understands a small part of the Internet, who reads the destination address and forwards the packet to an adjacent __________ that in turn reads the destination address and so forth across the Internet until one recognizes the packet as belonging to a computer within its immediate neighborhood or domain.","__________ is a standard that defines how to establish and maintain a network conversation via which application programs can exchange data. It works with the Internet Protocol (IP), which defines how computers send packets of data to each other. Together are the basic rules defining the Internet.","The types of network __________ employed in any network infrastructure is one of the most important aspects of networking, and it has become increasingly critical with the introduction of newer technologies, such as blade servers, virtualization, network storage devices, wireless access points and more.", "__________ cable is certainly the most popular type of network cable by far around the world, is used not only for networking, but also for the traditional telephone. There are six different types of categories and, depending on what you want to achieve, you would need the appropriate type of network cable. CAT5e is the most popular __________ cable; it replaced the old coaxial cable that was unable to keep up with the constantly growing need for faster and more reliable networks.")

        val respuestas: List<String> = listOf("topology","star","gateway","TCP","cables","UTP")

        val opciones: Map<Int,List<String>> = hashMapOf (0 to listOf("topology","network","connection","cable"), 1 to listOf("bus","ring","star","tree"), 2 to listOf("server","gateway","tray","protocol"), 3 to listOf("TCP","OSI","UDP","ISO"), 4 to listOf("switches","fibers","hardware","cables"), 5 to listOf("UTP","Coaxial","Fiber optic","Ethernet"))

        txt1.setText(texto1.get(opt))
        var chose = opciones.get(opt)

        op1.setText(chose!!.get(0))
        op2.setText(chose!!.get(1))
        op3.setText(chose!!.get(2))
        op4.setText(chose!!.get(3))

        return respuestas.get(opt)

    }

}
