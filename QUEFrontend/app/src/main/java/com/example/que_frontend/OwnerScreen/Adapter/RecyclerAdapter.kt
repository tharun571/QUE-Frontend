package com.example.que_frontend.OwnerScreen.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.que_frontend.R
import com.example.que_frontend.UserData.Data
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.viewmodel.OwnerViewModel


class RecyclerAdapter(val que: List<String>,val queCount:List<Int>, val viewModel: OwnerViewModel, val con: LifecycleOwner, val context: Context, val recyclerView: RecyclerView,
                      val listener: OnItemClickListener):
        RecyclerView.Adapter<RecyclerAdapter.QueViewHolder>() {


    val listen = listener
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



       holder.quecode.text=   que.get(position)
       holder.quecount.text=   queCount.get(position).toString()









    }

    @SuppressLint("NewApi")
    override fun getItemCount() = Data.que.size


    fun display(que1: List<String>, queCount1: List<Int>){
        Log.w("QWE","QWERTY")

        que.toMutableList().clear()
        que.toMutableList().addAll(que1)

        queCount.toMutableList().clear()
        queCount.toMutableList().addAll(queCount1)

        this.notifyDataSetChanged()

    }

   inner class QueViewHolder(val view : RelativeLayout):RecyclerView.ViewHolder(view), View.OnClickListener {

        val container = view.findViewById(R.id.container) as RelativeLayout
        val deleteque = view.findViewById(R.id.deleteque) as TextView
        val quecode = view.findViewById(R.id.quecode) as TextView
        val quecount = view.findViewById(R.id.quecount) as TextView

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val posit = adapterPosition
            if (posit != RecyclerView.NO_POSITION) {
                listener.onItemClick(posit)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }



    private fun observelivedata(holder: RecyclerAdapter.QueViewHolder){

        viewModel.totalCountResponse.observe(con, Observer {
            response ->
            when(response) {
                is Resource.Success -> {

                    holder.quecount.text = response.data?.data?.count.toString()

                }
                is Resource.Error -> {

                    Toast.makeText(context, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })


//        viewModel.deleteQueResponse.observe(con, Observer {
//            response ->
//            when(response) {
//                is Resource.Success -> {
//
//                    Toast.makeText(context, "Que Deleted", Toast.LENGTH_SHORT).show()
//
//
//
//                }
//                is Resource.Error -> {
//
//                    Toast.makeText(context, response.message, Toast.LENGTH_SHORT).show()
//                }
//            }
//        })

    }
}