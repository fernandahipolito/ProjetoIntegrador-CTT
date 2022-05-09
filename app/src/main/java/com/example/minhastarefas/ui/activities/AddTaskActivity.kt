package com.example.minhastarefas.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.minhastarefas.databinding.AddTaskBinding


class AddTaskActivity : AppCompatActivity() {
    //lateinit var binding: AddTaskBinding
     val binding: AddTaskBinding by lazy { AddTaskBinding.inflate(layoutInflater) }
    //lateinit var botaoAdicionarTarefa: Button
   //lateinit var nomeTarefa: EditText
    //lateinit var descricaoTarefa: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // val view = binding.root
        setContentView(binding.root)

        val titleTask = binding.edtTitleAdd
        val descriptionTask = binding.edtAddDescription
       // botaoAdicionarTarefa = findViewById(R.id.btn_add_new_task)
        //nomeTarefa = findViewById(R.id.edt_title_add)
        //descricaoTarefa = findViewById(R.id.edt_add_description)

        binding.btnAddNewTask.setOnClickListener {
            val telaLista = Intent(this, ListTasksActivity::class.java)
            telaLista.putExtra("NOME", titleTask.text)
            telaLista.putExtra("DESCRICAO", descriptionTask.text)
            startActivity(telaLista)
            titleTask.setText("")
            descriptionTask.setText("")
            titleTask.requestFocus()
            //descriptionTask.requestFocus()  deixa com o cursor focado na descrição
        }

       // botaoAdicionarTarefa.setOnClickListener {
         //   val telaLista = Intent(this, ListTasksActivity::class.java)
         //   telaLista.putExtra("NOME", nomeTarefa.text)
         //   telaLista.putExtra("DESCRICAO", descricaoTarefa.text)
         //   startActivity(telaLista)
         //   nomeTarefa.setText("")
         //   descricaoTarefa.setText("")
          //  nomeTarefa.requestFocus()

       // }
    }

}