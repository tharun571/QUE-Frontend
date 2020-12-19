package com.example.que_frontend.OwnerScreen.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.que_frontend.R

class NamesAdapter(val names:List<String>) : RecyclerView.Adapter<NamesAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesAdapter.NamesViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.names_item, parent, false)
                as ConstraintLayout

        return NamesViewHolder(
                view
        )
    }

    fun display(que1: List<String>){
        Log.w("QWE","QWERTY")

        names.toMutableList().clear()
        names.toMutableList().addAll(que1)

        this.notifyDataSetChanged()

    }

    override fun getItemCount() = names.size

    override fun onBindViewHolder(holder: NamesAdapter.NamesViewHolder, position: Int) {

        holder.pos.text = (position+1).toString()
        holder.name.text = names.get(position)
    }

    inner class NamesViewHolder(val view : ConstraintLayout):RecyclerView.ViewHolder(view){

        val pos = view.findViewById<TextView>(R.id.posName)
        val name = view.findViewById<TextView>(R.id.name1)
    }

}