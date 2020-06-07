package com.example.flashcard_worldhistory

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        var word: String
        var mean: String

        var index = 0

        val wordAndMeanList = ArrayList<FlashCard>()

        val list: ArrayList<FlashCard> = arrayListOf()

        val sqLite = SQLite(this)
        val db: SQLiteDatabase = sqLite.readableDatabase
        var sql: String

        for (i in 1..8) {
            sql = "SELECT * FROM MyTable$i"
            val c: Cursor = db.rawQuery(sql, null)
            c.moveToFirst()
            do {

                word = c.getString(c.getColumnIndex("Word"))
                mean = c.getString(c.getColumnIndex("Mean"))

                wordAndMeanList.add(index, FlashCard(word, mean))

                list.add(index, wordAndMeanList[index])

                index++

            } while (c.moveToNext())

            c.close()

        }

        val simpleRecyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val adapter = CustomAdapter2(list)
        val layoutManager = LinearLayoutManager(this)

        simpleRecyclerView.layoutManager = layoutManager
        simpleRecyclerView.adapter = adapter
        simpleRecyclerView.setHasFixedSize(true)

        adapter.setOnItemClickListener(object : CustomAdapter2.OnItemClickListener {
            override fun onItemClickListener(view: View, position: Int, clickedText: String) {

                val intent = Intent(application, WordActivity::class.java)
                intent.putExtra(DATA, clickedText)
                startActivity(intent)

            }
        })

        val back = findViewById<Button>(R.id.back2)

        back.setOnClickListener {
            val intent = Intent(application, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    companion object {
        const val DATA = "text"
    }
}