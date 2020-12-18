package com.example.que_frontend.UserScreen

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.que_frontend.R
import com.example.que_frontend.UserData.Data
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.viewmodel.OwnerViewModel
import com.example.que_frontend.viewmodel.UserViewModel

class User : AppCompatActivity() {

    lateinit var joinque : Button
    lateinit var leave : Button
    lateinit var code : EditText
    lateinit var pos : TextView
    lateinit var queId: String
    lateinit var title: TextView
    val CHANNEL = "Channel1"
    private val viewModel: UserViewModel by lazy {
        ViewModelProvider(this).get(com.example.que_frontend.viewmodel.UserViewModel::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)




        code = findViewById(R.id.code)
        joinque = findViewById(R.id.joinque)
        leave = findViewById(R.id.leave)
        pos = findViewById(R.id.pos)
        title = findViewById(R.id.title)


        if(Data.alreadyInQue){
            queId = Data.que[0]
            joinque()

        }

        pos.text=""
        title.text= "Hi There, "+Data.Name

        observeLiveData()

        joinque.setOnClickListener {
            viewModel.joinQue( code.text.toString(), Data.id,"Bearer "+Data.auth)
        }
        

    }


    private fun observeLiveData(){

        viewModel.joinQueResponse.observe(this, Observer {
            response ->
            when(response) {
                is Resource.Success -> {

                    queId = code.text.toString()
                    joinque()



                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })

        viewModel.quePositionResponse.observe(this, Observer {
            response ->
            when(response) {
                is Resource.Success -> {



                    val position  = response.data?.data?.plus(1)

                    pos.text = position.toString()




                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })


        viewModel.leaveQueResponse.observe(this, Observer {
            response ->
            when(response) {
                is Resource.Success -> {



                    pos.text=""

                    Toast.makeText(this, "Left Que", Toast.LENGTH_SHORT).show()
                    joinque.visibility = View.VISIBLE
                    code.visibility = View.VISIBLE

                    leave.visibility = View.GONE
                    pos.visibility = View.GONE


                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })


    }

    private fun joinque(){


        title.text = "Sit Back and Relax. We Will Notify You."

        Toast.makeText(this, "Joined Que", Toast.LENGTH_SHORT).show()
        joinque.visibility = View.GONE
        code.visibility = View.GONE

        leave.visibility = View.VISIBLE
        pos.visibility = View.VISIBLE

        quejoined()
    }

    private fun quejoined(){
        viewModel.quePosition(queId, Data.id, "Bearer "+Data.auth)

        leave.setOnClickListener {
            viewModel.leaveQue(queId, Data.id, "Bearer "+Data.auth)
        }



    }

    

}