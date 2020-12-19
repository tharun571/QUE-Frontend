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
import androidx.cardview.widget.CardView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.que_frontend.R
import com.example.que_frontend.UserData.Data
import com.example.que_frontend.UserData.Delete
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
        as CardView

        return QueViewHolder(
                view
        )
    }


    override fun onBindViewHolder(holder: RecyclerAdapter.QueViewHolder, position: Int) {



       holder.quecode.text=   que.get(position)
       holder.quecount.text=   queCount.get(position).toString()


        holder.deleteque.setOnClickListener {
            Delete.pos = position
            viewModel.deleteQue(que.get(position),Data.id, "Bearer "+Data.auth)
        }


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

   inner class QueViewHolder(val view : CardView):RecyclerView.ViewHolder(view), View.OnClickListener {

        val deleteque = view.findViewById(R.id.deleteque) as TextView
        val quecode = view.findViewById(R.id.quecode) as TextView
        val quecount = view.findViewById(R.id.quecount) as TextView
       val recyclerView1 = view.findViewById(R.id.namesRecycler)as RecyclerView

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