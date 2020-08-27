package com.poc.frontandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import br.com.zup.beagle.android.utils.loadView
import br.com.zup.beagle.android.view.ScreenRequest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()//esconde a barra que vem por padrão no empity project
        }
        val frameLayout = findViewById<FrameLayout>(R.id.fr_server_driven)
        frameLayout.loadView(this, ScreenRequest("/pag"))
    }
}