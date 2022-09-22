package com.tunahan.kotlinadvancedfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var myInt :Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //let

        if (myInt!=null){
                val num = myInt!!+1
        }

        myInt?.let {
            val num = it + 1

        }

        val myNum = myInt?.let {
            it + 1

        }?:0

        //also

        val tunahan = Person("Tunahan",19)
        val ahmet = Person("Ahmet",9)
        val hasan = Person("Hasan",32)

        val people = listOf<Person>(tunahan,ahmet,hasan)

        people.filter { it.age>18 }.also {
            for (num in it){
                println(num.name)
            }
        }

        //apply

        val intent = Intent()
        intent.putExtra("","")
        intent.`package` = ""
        intent.action = ""

        val intentApply = Intent().apply {
            putExtra("","")
            `package`=""
            action = ""
        }

        //with

        Person("tunahan",19).apply {
            name = "Tunahan"
        }.also {
            println(it.name)
        }

        val newTunahan = Person("tunahan",19).apply {
            name = "Tunahan"
        }
        println(newTunahan.name)

        val withTunahan = Person("tunahan",17)

        with(withTunahan){
            name = "Tunahan"
            age = 19
        }
        println("with:"+withTunahan.name)
    }
}

data class Person(var name:String,var age:Int)