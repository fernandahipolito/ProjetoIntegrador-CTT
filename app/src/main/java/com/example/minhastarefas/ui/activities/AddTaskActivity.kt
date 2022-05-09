package com.example.minhastarefas.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.minhastarefas.R


class AddTaskActivity : AppCompatActivity() {
    lateinit var botaoAdicionarTarefa: Button
    lateinit var nomeTarefa: EditText
    lateinit var descricaoTarefa: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_task)

        botaoAdicionarTarefa = findViewById(R.id.btn_add_new_task)
        nomeTarefa = findViewById(R.id.edt_title_add)
        descricaoTarefa = findViewById(R.id.edt_add_description)

        botaoAdicionarTarefa.setOnClickListener {
            val telaLista = Intent(this, ListTasksActivity::class.java)
            telaLista.putExtra("NOME", nomeTarefa.text)
            telaLista.putExtra("DESCRICAO", descricaoTarefa.text)
            startActivity(telaLista)
            nomeTarefa.setText("")
            descricaoTarefa.setText("")
            nomeTarefa.requestFocus()

        }
    }

}