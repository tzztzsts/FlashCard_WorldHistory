package com.example.flashcard_worldhistory

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word)

        val getData = intent
        val clickedText = getData.extras?.getString(EditActivity.DATA) ?: ""

        val sqLite = SQLite(this)
        val db: SQLiteDatabase = sqLite.readableDatabase
        var sql: String

        for (i in 1..8) {
            sql = "SELECT * FROM MyTable$i WHERE Mean = '$clickedText'"
            val c: Cursor = db.rawQuery(sql, null)


            if (c.moveToFirst()) {

                val word = c.getString(c.getColumnIndex("Word"))
                val mean = c.getString(c.getColumnIndex("Mean"))

                val textView1 = findViewById<TextView>(R.id.word)
                val textView2 = findViewById<TextView>(R.id.description)

                textView1.text = word
                textView2.text = mean

                break
            }

            c.close()

        }

        val back = findViewById<Button>(R.id.back)

        back.setOnClickListener { finish() }
    }
}