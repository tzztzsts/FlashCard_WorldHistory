package com.example.flashcard_worldhistory

import android.content.Intent
import android.database.DatabaseUtils
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit = findViewById<Button>(R.id.Edit)
        val finish = findViewById<Button>(R.id.Finish)

        val sqLite = SQLite(this)
        val db: SQLiteDatabase = sqLite.readableDatabase

        var tableNumber: String
        var quantity: Long = 0

        for (i in 1..8) {
            tableNumber = i.toString()
            quantity += DatabaseUtils.queryNumEntries(db, "MyTable$tableNumber")
        }

        val range =
            listOf("オリエント", "古代ギリシア", "ギリシア文化", "共和政ローマ", "帝政ローマ", "インド1", "インド2", "黄河文明・殷周・春秋戦国")
        val recyclerView = findViewById<RecyclerView>(R.id.rangeList)

        val adapter = CustomAdapter1(range)
        val layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

        adapter.setOnItemClickListener(object : CustomAdapter1.OnItemClickListener {
            override fun onItemClickListener(view: View, position: Int, clickedText: String) {

                val intent = Intent(application, VocabularyActivity::class.java)
                val data = position + 1
                intent.putExtra(DATA, data)
                startActivity(intent)
                finish()
            }
        })

        edit.setOnClickListener {
            val intent = Intent(application, EditActivity::class.java)
            startActivity(intent)
            finish()
        }

        finish.setOnClickListener { finish() }
    }

    companion object {
        const val DATA = "position"
    }
}
