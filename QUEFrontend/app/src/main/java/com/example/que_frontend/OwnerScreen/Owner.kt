package com.example.que_frontend.OwnerScreen

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.que_frontend.OwnerScreen.Adapter.NamesAdapter
import com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter
import com.example.que_frontend.R
import com.example.que_frontend.UserData.Adapter
import com.example.que_frontend.UserData.Data
import com.example.que_frontend.UserData.Delete
import com.example.que_frontend.UserScreen.User
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.viewmodel.OwnerViewModel

class Owner : AppCompatActivity(), RecyclerAdapter.OnItemClickListener {

    lateinit var createQue: Button
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView1: RecyclerView
    lateinit var adapter: RecyclerAdapter
    lateinit var adapter1: NamesAdapter

    var pos:Int = -1

    private val viewModel: OwnerViewModel by lazy {
        ViewModelProvider(this).get(com.example.que_frontend.viewmodel.OwnerViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owner)

        createQue = findViewById(R.id.createQue)
        recyclerView = findViewById(R.id.ownerRecycler)
        recyclerView1 = findViewById(R.id.namesRecycler)


        var i=0
        while(i<Data.que.size){
            Data.queCount.add(0)
            ++i
        }

        getCount()
        recycler()
        observeLiveData()



        createQue!!.setOnClickListener {
            viewModel.createQue(Data.id, "Bearer " + Data.auth)
        }
    }


    private fun observeLiveData() {
        viewModel.createQueResponse.observe(this, Observer {
            response ->
            when(response) {
                is Resource.Success -> {

                    Toast.makeText(this, "Que Created", Toast.LENGTH_SHORT).show()
                    Data.que.add(response.data?.data?._id)

                    while(!Data.que.contains(response.data?.data?._id)){

                    }

                    adapter.display(Data.que,Data.queCount)

                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })

        viewModel.deleteQueResponse.observe(this, Observer {
            response ->
            when(response) {
                is Resource.Success -> {
                    pos = Delete.pos

                    Toast.makeText(this, "Que Deleted", Toast.LENGTH_SHORT).show()
                    val value = Data.que.get(pos)
                    Data.que.remove(value)
                    adapter.notifyItemRemoved(pos)

                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })

        viewModel.totalCountResponse.observe(this, Observer {
            response ->
            when(response) {
                is Resource.Success -> {

                   Data.queCount.add(response.data?.data?.count)

                    if(Data.que.size == Data.queCount.size){
                        adapter.display(Data.que,Data.queCount)
                    }

                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })

        viewModel.totalNamesResponse.observe(this, Observer {
            response ->
            when(response) {
                is Resource.Success -> {




                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })


    }


    private fun getCount(){

       for(ele in Data.que){
           viewModel.getCount(ele, "Bearer "+Data.auth)
       }

    }

    private fun recycler(){

        lateinit var linearLayoutManager: LinearLayoutManager
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        adapter = RecyclerAdapter(Data.que,Data.queCount, viewModel,this,this,recyclerView,this)
        recyclerView.adapter = adapter
        Adapter.adapter=adapter
    }

    override fun onItemClick(position: Int) {

        if(recyclerView1.visibility == View.GONE){
            recyclerView1.visibility == View.VISIBLE
        }
        else{
            recyclerView1.visibility == View.GONE
        }

        Log.w("asd","qwsa")
        val delete = findViewById<TextView>(R.id.deleteque)

            Log.w("asd","qwsa1")

              pos=position
                viewModel.getNames(Data.que.get(position),"Bearer "+Data.auth)


    }


}