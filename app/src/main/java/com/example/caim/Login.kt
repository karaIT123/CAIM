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
        i.putExtra("status",0)
        startActivity(i)
    }

    fun Login(view: View) {
        val i:Intent = Intent(this, MainPage::class.java)
        i.putExtra("status",1)
        startActivity(i)
    }
}