package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var mToggleButton: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       mToggleButton = findViewById(R.id.toggle_button)

       mToggleButton.setOnClickListener {
           if (mToggleButton.isChecked)
           {
               Toast.makeText(this@MainActivity,"Toggle Button:-${mToggleButton.text}",Toast.LENGTH_SHORT).show()
               val img = applicationContext.resources.getDrawable(R.drawable.ic_action_on)
               img.setBounds(0,0,60,60)
               mToggleButton.setCompoundDrawables(img,null,null,null)
           }
           else
           {
               Toast.makeText(this@MainActivity,"Toggle Button:-${mToggleButton.text}",Toast.LENGTH_SHORT).show()
               val img = applicationContext.resources.getDrawable(R.drawable.ic_action_off)
               img.setBounds(0,0,60,60)
               mToggleButton.setCompoundDrawables(img,null,null,null)
           }
       }
    }
}