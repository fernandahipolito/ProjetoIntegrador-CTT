package com.example.minhastarefas.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.minhastarefas.R
import com.example.minhastarefas.databinding.ListTasksBinding
import com.example.minhastarefas.model.Tarefa

class ListTasksActivity : AppCompatActivity() {
    val binding: ListTasksBinding by lazy { ListTasksBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root) //se colocar o layout não aparece a lista

        val tarefaDigitada = intent.extras?.get("NOME").toString()
        val descricaoDigitada = intent.extras?.get("DESCRICAO").toString()


        val rvTarefas = binding.rvMyTasks
        val adapterTarefas = TasksAdapter(listaTarefas)
        rvTarefas.adapter = adapterTarefas


        adapterTarefas.adicionarTarefa(listaTarefas,Tarefa(tarefaDigitada,descricaoDigitada))

        rvTarefas.layoutManager = LinearLayoutManager(this)

    }

    companion object{
        val listaTarefas: MutableList<Tarefa> = mutableListOf(
            Tarefa("Pagamento", "Pagar a conta da net que vence dia 10")
        )
    }
}
