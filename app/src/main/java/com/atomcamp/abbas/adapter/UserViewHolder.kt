package com.atomcamp.abbas.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atomcamp.abbas.Profile
import com.atomcamp.abbas.R

class UserViewHolder(
    view: View,
): RecyclerView.ViewHolder(view) {

    private val userName: TextView
    private val name: TextView

    init {
        userName = view.findViewById(R.id.userName)
        name = view.findViewById(R.id.name)
    }

    fun bind(
        profileData: Profile
    ) {
        userName.text = profileData.userName
        name.text = profileData.name
    }
}