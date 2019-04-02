package com.maideveloper.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //we don't need to find id in kotlin
    fun change(view: View){//fun=function  view:View means functions is called by View that is button in this case
        imageView2.setImageResource(R.drawable.pic2)


    }
}
