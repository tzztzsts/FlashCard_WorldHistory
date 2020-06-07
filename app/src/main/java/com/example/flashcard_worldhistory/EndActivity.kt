package com.example.flashcard_worldhistory

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EndActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val retry = findViewById<Button>(R.id.retry)
        val finish = findViewById<Button>(R.id.finish)

        retry.setOnClickListener {
            val intent = Intent(application, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        finish.setOnClickListener { finish() }

    }
}