package com.example.que_frontend.OwnerScreen.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.que_frontend.Converter.HexToDec
import com.example.que_frontend.R
import com.example.que_frontend.UserData.Data

class RecyclerAdapter(val que: List<String>, val queCount : List<Int>): RecyclerView.Adapter<RecyclerAdapter.QueViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.QueViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.owner_item, parent, false)
        as RelativeLayout

        return QueViewHolder(
                view
        )
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.QueViewHolder, position: Int) {

       holder.quecode.text=   HexToDec().convert(que.get(position))




    }

    override fun getItemCount() = Data.que.size

    class QueViewHolder(val view : RelativeLayout):RecyclerView.ViewHolder(view) {

        val container = view.findViewById(R.id.container) as RelativeLayout
        val queName = view.findViewById(R.id.quename) as TextView
        val quecode = view.findViewById(R.id.quecode) as TextView
        val quecount = view.findViewById(R.id.quecount) as TextView
    }


}