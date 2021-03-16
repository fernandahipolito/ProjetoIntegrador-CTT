package com.example.minhastarefas.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.minhastarefas.R
import com.example.minhastarefas.model.Tarefa

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val tarefaDigitada = intent.extras?.get("NOME").toString()
        val descricaoDigitada = intent.extras?.get("DESCRICAO").toString()


        val rvTarefas = findViewById<RecyclerView>(R.id.rvTarefas)
        val adapterTarefas = TarefasAdapter(listaTarefas)
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
