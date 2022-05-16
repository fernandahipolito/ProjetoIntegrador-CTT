package com.example.minhastarefas.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.minhastarefas.databinding.ListTasksBinding
import com.example.minhastarefas.model.Tasks
import com.example.minhastarefas.ui.list.TasksAdapter

class ListTasksActivity : AppCompatActivity() {

    private val binding: ListTasksBinding by lazy { ListTasksBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root) //se colocar o layout não aparece a lista

        val typedTaskTitle = intent.extras?.get("NOME").toString()
        val typedTaskDescription = intent.extras?.get("DESCRICAO").toString()


        val rvTasks = binding.rvMyTasks
        //val adapterTarefas = TasksAdapter(listaTarefas)
        val tasksAdapter = TasksAdapter(listOfTasks)
        rvTasks.adapter = tasksAdapter


        tasksAdapter.addTask(listOfTasks, Tasks(typedTaskTitle, typedTaskDescription))


        rvTasks.layoutManager = LinearLayoutManager(this)

    }

    companion object {
        val listOfTasks: MutableList<Tasks> = mutableListOf(
            Tasks("Pagamento", "Pagar a conta da net que vence dia 10")
        )
    }
}
