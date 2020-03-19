package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val clickeableViews : List<View> =
            listOf(one_box_text,box_two,box_three,box_four,box_five, constrain)

        for(item in clickeableViews){
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(view: View){
        when(view.id){
            R.id.one_box_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two-> view.setBackgroundColor(Color.GRAY)

            R.id.box_three-> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_four-> view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.box_five-> view.setBackgroundResource(android.R.color.holo_green_light)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
