package com.konatsup.realmtodo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewAdapter(private val context: Context, private val taskList: List<Task>) :
    RecyclerView.Adapter<TaskViewAdapter.TaskViewHolder>() {

    class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val contentTextView: TextView = view.findViewById(R.id.contentTextView)
        val dateTextView: TextView = view.findViewById(R.id.dateTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder =
        TaskViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))

    override fun getItemCount(): Int = taskList.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.imageView.setImageResource(taskList[position].imageId)
        holder.contentTextView.text = taskList[position].content
        holder.dateTextView.text = taskList[position].date
    }
}