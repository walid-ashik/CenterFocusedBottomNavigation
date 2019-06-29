package com.alwalidashik.centerfocusednav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation_main.itemIconTintList = null
        iv_add.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.iv_add ->{
                Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show()
            }
        }
    }


}
