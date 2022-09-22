package com.tunahan.kotlinadvancedfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class DelegatesActivity : AppCompatActivity(), LifecycleLogger by LifecycleLoggerImplementation() {

    //not called when not in use
    private val myVariable by lazy {
        println("this is a lazy")
        5
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegates)

        registerLifecycleOwner(this)
        println(myVariable)
    }
}

interface LifecycleLogger{
    fun registerLifecycleOwner(owner: LifecycleOwner)
}

class LifecycleLoggerImplementation : LifecycleLogger,LifecycleEventObserver{
    override fun registerLifecycleOwner(owner: LifecycleOwner) {

        owner.lifecycle.addObserver(this)

    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {

        when(event){
            Lifecycle.Event.ON_RESUME -> println("on resume")
            Lifecycle.Event.ON_PAUSE -> println("on pause")
            else -> Unit
        }
    }

}