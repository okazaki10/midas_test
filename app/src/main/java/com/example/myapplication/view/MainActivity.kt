package com.example.myapplication.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.adapter.ShopAdapter
import com.example.myapplication.config.NetworkConfig
import com.example.myapplication.model.Delivery
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NetworkConfig().getService()
            .getUsers()
            .enqueue(object : Callback<Delivery>{
                override fun onFailure(call: Call<Delivery>, t: Throwable) {
                    Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()
                }
                override fun onResponse(
                    call: Call<Delivery>,
                    response: Response<Delivery>
                ) {
                    rvUser.adapter = ShopAdapter(response.body()?.payload?.get(0)?.shop)
                }
            })
    }
}