package com.example.que_frontend.OwnerScreen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter
import com.example.que_frontend.R
import com.example.que_frontend.UserData.Data
import com.example.que_frontend.UserScreen.User
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.viewmodel.OwnerViewModel

class Owner : AppCompatActivity() {

    lateinit var createQue: Button
    lateinit var recyclerView: RecyclerView
    private val viewModel: OwnerViewModel by lazy {
        ViewModelProvider(this).get(com.example.que_frontend.viewmodel.OwnerViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owner)

        createQue = findViewById(R.id.createQue)
        recyclerView = findViewById(R.id.ownerRecycler)

        observeLiveData()
        ques()


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

                    Data.que.toMutableList().add(response.data?.data?._id)


                    ques()
                    recycler()

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

                    Toast.makeText(this, "Que Created", Toast.LENGTH_SHORT).show()

                    Data.queCount.toMutableList().add(response.data?.data?.count)
                    Log.w("QWER",""+response.data?.data?.count)



                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun ques(){
     for(ele in Data.que){
         Log.w("QWER",ele)
         viewModel.getCount(ele,"Bearer "+Data.auth)
     }

    }

    private fun recycler(){

//        lateinit var linearLayoutManager: LinearLayoutManager
//        linearLayoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = linearLayoutManager
//        lateinit var adapter: RecyclerAdapter
//
//            adapter = RecyclerAdapter(Data.que, Data.queCount)
//
//
//        recyclerView.adapter = adapter
    }
}