package com.mariav.devprofile_new

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bitmap = BitmapFactory.decodeResource(resources,R.mipmap.avatar_macc_lay)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap);
        rounded.cornerRadius = 20f;
        Avatar.setImageDrawable(rounded)
        Company.text = "MacSlopes"
    }
}
