package com.example.minhastarefas.ui.activities

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.minhastarefas.R
import com.example.minhastarefas.model.Tarefa


class AdicionarTarefaActivity : AppCompatActivity() {
    lateinit var botaoAdicionarTarefa: Button
    lateinit var nomeTarefa: EditText
    lateinit var descricaoTarefa: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adicionar_tarefa)

        botaoAdicionarTarefa = findViewById(R.id.btnCriarNovaTarefa)
        nomeTarefa = findViewById(R.id.edtTituloAdd)
        descricaoTarefa = findViewById(R.id.edtDescricaoAdd)

        botaoAdicionarTarefa.setOnClickListener {
            val telaLista = Intent(this, ListaActivity::class.java)
            telaLista.putExtra("NOME", nomeTarefa.text)
            telaLista.putExtra("DESCRICAO", descricaoTarefa.text)
            startActivity(telaLista)
            nomeTarefa.setText("")
            descricaoTarefa.setText("")
            nomeTarefa.requestFocus()

        }
    }

}