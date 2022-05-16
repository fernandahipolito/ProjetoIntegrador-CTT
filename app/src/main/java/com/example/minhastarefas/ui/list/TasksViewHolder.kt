package com.example.minhastarefas.ui.list

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.minhastarefas.databinding.ItemTaskBinding

class TasksViewHolder(binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {

    val titleTask: TextView by lazy { binding.tvTitleTask }
    val descriptionTask: TextView by lazy { binding.txtDescriptionTask }
}