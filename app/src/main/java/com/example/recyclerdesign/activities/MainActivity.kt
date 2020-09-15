package com.example.recyclerdesign.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerdesign.R
import com.example.recyclerdesign.adapters.AdapterNews
import com.example.recyclerdesign.models.News
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mList: ArrayList<News> = ArrayList()
    var switch: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        generateData()
        var adapterNews = AdapterNews(this, mList)

            // Switch layouts if button is clicked
        button_layout.setOnClickListener {
            when(switch){
                false -> {
                    recycler_view.layoutManager = GridLayoutManager(this,7)
                    recycler_view.adapter = adapterNews
                    switch = true
                }
                true -> {
                    recycler_view.layoutManager = LinearLayoutManager(this)
                    recycler_view.adapter = adapterNews
                    switch = false
                }
            }
        }

            // Default Layout
        recycler_view.layoutManager = GridLayoutManager(this,7)
        recycler_view.adapter = adapterNews
    }

    private fun generateData(){
        mList.add(News("Sun", R.drawable.storm, "Storms expected",1))
        mList.add(News("Mon", R.drawable.sunshine,"Sunny and Warm", 2))
        mList.add(News("Tues", R.drawable.sunshine,"Sunny and Warm",  3))
        mList.add(News("Wed", R.drawable.cloudy,"Cloudy Skies", 4))
        mList.add(News("Thur", R.drawable.storm,"Storms expected",5))
        mList.add(News("Fri", R.drawable.sunshine,"Sunny and Warm", 6))
        mList.add(News("Sat", R.drawable.storm,"Storms expected",7))
        mList.add(News("Sun", R.drawable.storm,"Storms expected",8))
        mList.add(News("Mon", R.drawable.cloudy,"Cloudy Skies",9))
        mList.add(News("Tues", R.drawable.cloudy,"Cloudy Skies",10))
        mList.add(News("Wed", R.drawable.cloudy,"Cloudy Skies",11))
        mList.add(News("Thur", R.drawable.cloudy,"Cloudy Skies",12))
        mList.add(News("Fri", R.drawable.sunshine,"Sunny and Warm", 13))
        mList.add(News("Sat", R.drawable.storm,"Storms expected",14))
        mList.add(News("Sun", R.drawable.storm,"Storms expected",15))
        mList.add(News("Mon", R.drawable.sunshine,"Sunny and Warm", 16))
        mList.add(News("Tues", R.drawable.storm,"Storms expected",17))
        mList.add(News("Wed", R.drawable.sunshine,"Sunny and Warm", 18))
        mList.add(News("Thur", R.drawable.sunshine,"Sunny and Warm", 19))
        mList.add(News("Fri", R.drawable.sunshine,"Sunny and Warm", 20))
        mList.add(News("Sat", R.drawable.sunshine,"Sunny and Warm", 21))
        mList.add(News("Sun", R.drawable.storm,"Storms expected",22))
        mList.add(News("Mon", R.drawable.storm,"Storms expected",23))
        mList.add(News("Tues", R.drawable.storm,"Storms expected",24))
        mList.add(News("Wed", R.drawable.storm,"Storms expected",25))
        mList.add(News("Thur", R.drawable.cloudy,"Cloudy Skies",26))
        mList.add(News("Fri", R.drawable.sunshine,"Sunny and Warm", 27))
        mList.add(News("Sat", R.drawable.sunshine,"Sunny and Warm", 28))
        mList.add(News("Sun", R.drawable.storm,"Storms expected",29))
        mList.add(News("Mon", R.drawable.sunshine,"Sunny and Warm", 30))
        mList.add(News("Tues", R.drawable.sunshine,"Sunny and Warm", 31))
        mList.add(News("Wed", R.drawable.cloudy,"Cloudy Skies",1))
        mList.add(News("Thur", R.drawable.storm,"Storms expected",2))
        mList.add(News("Fri", R.drawable.sunshine,"Sunny and Warm", 3))
        mList.add(News("Sat", R.drawable.storm,"Storms expected",4))
        mList.add(News("Sun", R.drawable.storm,"Storms expected",5))
        mList.add(News("Mon", R.drawable.cloudy,"Cloudy Skies",6))
        mList.add(News("Tues", R.drawable.cloudy,"Cloudy Skies",7))
        mList.add(News("Wed", R.drawable.cloudy,"Cloudy Skies",8))
        mList.add(News("Thur", R.drawable.cloudy,"Cloudy Skies",9))
        mList.add(News("Fri", R.drawable.sunshine,"Sunny and Warm", 10))
        mList.add(News("Sat", R.drawable.storm,"Storms expected",11))
        mList.add(News("Sun", R.drawable.storm,"Storms expected",12))
        mList.add(News("Mon", R.drawable.sunshine,"Sunny and Warm", 13))
        mList.add(News("Tues", R.drawable.storm,"Storms expected",14))
        mList.add(News("Wed", R.drawable.sunshine,"Sunny and Warm", 15))
        mList.add(News("Thur", R.drawable.sunshine,"Sunny and Warm", 16))
        mList.add(News("Fri", R.drawable.sunshine,"Sunny and Warm", 17))
        mList.add(News("Sat", R.drawable.sunshine,"Sunny and Warm", 18))
        mList.add(News("Sun", R.drawable.storm,"Storms expected",19))
        mList.add(News("Mon", R.drawable.storm,"Storms expected",20))
        mList.add(News("Tues", R.drawable.storm,"Storms expected",21))
        mList.add(News("Wed", R.drawable.storm,"Storms expected",22))
        mList.add(News("Thur", R.drawable.cloudy,"Cloudy Skies",23))
        mList.add(News("Fri", R.drawable.sunshine,"Sunny and Warm", 24))
        mList.add(News("Sat", R.drawable.sunshine,"Sunny and Warm", 25))
    }
}