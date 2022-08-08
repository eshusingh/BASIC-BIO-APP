package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butt : Button = findViewById(R.id.done)
        butt.setOnClickListener {
            addname(it)
        }
    }

    private fun  addname (view : View)
    {
        val edits : EditText = findViewById((R.id.urname))
        val nme : TextView = findViewById((R.id.STATEMENT))
        nme.text = edits.text
        edits.visibility = View.GONE
        view.visibility = View.GONE
        nme.visibility = View.VISIBLE


    }

}