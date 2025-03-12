package com.atomcamp.abbas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atomcamp.abbas.Profile
import com.atomcamp.abbas.R

class UsersAdapter(
    private val list: List<Profile>,
): RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): UserViewHolder {
        return UserViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(
                    R.layout.item_layout,
                    parent,
                    false,
                )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(
        holder: UserViewHolder,
        position: Int,
    ) {
        val item = list.get(position)

        holder.bind(item)
    }
}