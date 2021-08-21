package com.example.caim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Subscribe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subscribe)
    }

    fun goToLogin(view: View) {
        val i: Intent = Intent(this, Login::class.java)
        startActivity(i)
    }
}