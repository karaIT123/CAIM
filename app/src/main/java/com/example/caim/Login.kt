package com.example.caim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun goToSubscribe(view: View) {
        val i:Intent = Intent(this, Subscribe::class.java)
        startActivity(i)
    }

    fun goToMainPage(view: View) {
        val i:Intent = Intent(this, MainPage::class.java)
        startActivity(i)
    }
}