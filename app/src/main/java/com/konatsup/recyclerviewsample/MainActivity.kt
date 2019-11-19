package com.konatsup.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // テストデータを一旦作る
        val date = SimpleDateFormat("yyyy/MM/dd").format(Date())
        val taskList = mutableListOf<Task>()
        for (i in 0..10) {
            taskList.add(Task(R.drawable.ic_launcher_background, "やること $i", date))
        }

        taskRecyclerView.adapter = TaskViewAdapter(this, taskList)
        taskRecyclerView.layoutManager = LinearLayoutManager(this)

    }

}
