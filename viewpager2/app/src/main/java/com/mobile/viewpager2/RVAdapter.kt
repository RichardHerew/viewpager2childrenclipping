package com.mobile.viewpager2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView


class RVAdapter() : RecyclerView.Adapter<RVAdapter.MyViewHolder>() {
    class MyViewHolder(private val constraintLayout: ConstraintLayout) : RecyclerView.ViewHolder(constraintLayout)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): RVAdapter.MyViewHolder {
        val constraintLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder, parent, false) as ConstraintLayout
        return MyViewHolder(constraintLayout)
    }

    override fun getItemCount() = 5
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }
}
