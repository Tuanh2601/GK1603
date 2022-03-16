package com.example.lab2.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2.databinding.ItemUserBinding

class UserViewHolder private constructor(
    private val binding: ItemUserBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): UserViewHolder {
            val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return UserViewHolder(binding)
        }
    }

    fun bind(user: User) {
        binding.name.text = user.name
        binding.phone.text = user.phone
    }
}
