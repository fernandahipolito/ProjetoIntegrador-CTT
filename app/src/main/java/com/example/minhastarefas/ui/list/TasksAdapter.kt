package com.example.minhastarefas.ui.list

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.minhastarefas.databinding.ItemTaskBinding
import com.example.minhastarefas.model.Tasks

class TasksAdapter(private val tasksList: MutableList<Tasks>) :
    RecyclerView.Adapter<TasksViewHolder>() {

    fun addTask(listTask: MutableList<Tasks>, task: Tasks) {
        listTask.add(task)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val binding = ItemTaskBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return TasksViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        with(holder) {

            holder.titleTask.text = tasksList[position].nome
            holder.descriptionTask.text = tasksList[position].descricao

            holder.itemView.setOnClickListener {
                val builder = AlertDialog.Builder(it.context)
                builder.setTitle("Tarefa")
                builder.setMessage("Você deseja realmente deletar essa tarefa?")
                builder.setPositiveButton("Sim") { dialog, which ->
                    tasksList.removeAt(position)
                    notifyDataSetChanged()
                }
                builder.setNegativeButton("Nâo") { dialog, which -> }

                val dialog: AlertDialog = builder.create()
                dialog.show()
            }
        }

    }

    override fun getItemCount(): Int {
        return tasksList.size
    }

}


