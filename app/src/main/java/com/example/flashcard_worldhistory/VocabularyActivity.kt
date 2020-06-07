package com.example.flashcard_worldhistory

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class VocabularyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocabulary)

        val getData = intent
        val position = (getData.extras?.getInt(MainActivity.DATA) ?: "").toString()

        val sqLite = SQLite(this)
        val db: SQLiteDatabase = sqLite.readableDatabase
        val sql = "SELECT * FROM MyTable$position ORDER BY RANDOM()"
        val c: Cursor = db.rawQuery(sql, null)

        var word: String
        var mean: String

        var ansOrNext = true

        val question: TextView = findViewById(R.id.question)
        val answer: TextView = findViewById(R.id.answer)
        val next: Button = findViewById(R.id.Next2)
        val back: Button = findViewById(R.id.back3)

        c.moveToFirst()

        word = c.getString(c.getColumnIndex("Word"))
        mean = c.getString(c.getColumnIndex("Mean"))

        question.text = mean

        next.setOnClickListener {
            if (ansOrNext) {

                answer.text = word
                ansOrNext = false

            } else {

                if (c.moveToNext()) {

                    word = c.getString(c.getColumnIndex("Word"))
                    mean = c.getString(c.getColumnIndex("Mean"))

                } else {

                    val intent = Intent(application, EndActivity::class.java)
                    startActivity(intent)
                    finish()

                }

                question.text = mean
                answer.text = ""
                ansOrNext = true

            }
        }

        back.setOnClickListener {
            c.close()
            db.close()

            val intent = Intent(application, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
