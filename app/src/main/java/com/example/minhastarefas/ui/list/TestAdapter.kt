package com.example.minhastarefas.ui.list


/*class TestAdapter(private val listTarefa: MutableList<Tarefa>) :
    RecyclerView.Adapter<TestAdapter.TasksViewHolder>() { -> TestAdapter.TaskViewHolder é pra acessar o viewHolder que está dentro do adapter
    fun addTask(taskList: MutableList<Tarefa>, tarefa: Tarefa) {
        taskList.add(tarefa)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val binding = ItemTaskBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        //criei o binding

        //val view: View = binding.root //get view (layout, item dentro do xml)
        //root tras a view (o layout inteiro, constraint,linear)
        //binding trás o conteúdo da view
        //val view: View =
         //   LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TasksViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        with(holder){
            with(listTarefa[position]) {
                title.text = this.nome
                description.text = this.descricao
            }

            itemView.setOnClickListener {
                val builder = AlertDialog.Builder(it.context)
                builder.setTitle("Tarefa")
                builder.setMessage("Você deseja realmente deletar essa tarefa?")
                builder.setPositiveButton("Sim") { dialog, which ->
                    listTarefa.removeAt(position)
                    notifyDataSetChanged()
                }
                builder.setNegativeButton("Nâo") { dialog, which ->}

                val dialog: AlertDialog = builder.create()
                dialog.show()

            }
        }
        //holder.title.text = listTarefa[position].nome
        // holder.description.text = listTarefa[position].descricao
    }

    override fun getItemCount() = listTarefa.size

    class TasksViewHolder(binding: ItemTaskBinding) : //sem val ou var significa que está recebendo as variaveis
        RecyclerView.ViewHolder(binding.root) {
        //não preciso de view pq o binding tem acesso à view
        val title: TextView by lazy { binding.tvTitleTask }
        val description: TextView by lazy { binding.txtDescriptionTask }

        //mantem todos os itens da tela

        // private val binding: ItemTaskBinding by viewBinding()
        //    title = taskView.findViewById(R.id.edt_title_add)
        //val description: TextView by lazy { taskView.findViewById(R.id.txt_description_task) }
        // val title: TextView by lazy { taskView.findViewById(R.id.tv_title_task) }
        // val binding: ItemTaskBinding by lazy { ItemTaskBinding.bind(taskView) }
        //init {
        //    description = taskView.findViewById(R.id.edt_add_description)
    }
}
*/






