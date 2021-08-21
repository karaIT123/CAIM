package com.example.caim

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class MainPage : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = title

        val i = intent
        val status =  i.getIntExtra("status",0)

        if (status == 0) {
            findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
                Snackbar.make(view, "Non connecter", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                }
        }
        else {
            findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
                Snackbar.make(view, "Connecter", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
            }
        }
        /*findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/
    }




}