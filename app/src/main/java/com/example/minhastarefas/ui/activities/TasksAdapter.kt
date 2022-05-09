package com.example.minhastarefas.ui.activities

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.minhastarefas.R
import com.example.minhastarefas.model.Tarefa

class TasksAdapter(private val listaTarefas:MutableList<Tarefa>): RecyclerView.Adapter<TasksAdapter.TarefasHolder>() {
    fun adicionarTarefa(listaTarefas: MutableList<Tarefa>, tarefa:Tarefa) {
        listaTarefas.add(tarefa)
        notifyDataSetChanged()
    }

    class TarefasHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeTarefa: TextView = view.findViewById(R.id.tv_title_task)
        val descricaoTarefa: TextView = view.findViewById(R.id.txt_description_task)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefasHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_task, parent, false)
        return TarefasHolder(view)

    }

    override fun onBindViewHolder(holder: TarefasHolder, position: Int) {

        holder.nomeTarefa.text = listaTarefas[position].nome
        holder.descricaoTarefa.text = listaTarefas[position].descricao

        holder.itemView.setOnClickListener {
            val builder = AlertDialog.Builder(it.context)
            builder.setTitle("Tarefa")
            builder.setMessage("Você deseja realmente deletar essa tarefa?")
            builder.setPositiveButton("Sim") { dialog, which ->
                listaTarefas.removeAt(position)
                notifyDataSetChanged()
            }
            builder.setNegativeButton("Nâo") { dialog, which ->}

                val dialog: AlertDialog = builder.create()
                dialog.show()

            }
        }

        override fun getItemCount(): Int {
            return listaTarefas.size
        }

}


