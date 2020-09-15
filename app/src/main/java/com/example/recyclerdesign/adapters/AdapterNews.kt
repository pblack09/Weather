package com.example.recyclerdesign.adapters

import android.content.Context
import android.graphics.Color
import android.graphics.Color.*
import android.graphics.ColorFilter
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerdesign.R
import com.example.recyclerdesign.models.News
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.row_news_adapter.view.*

class AdapterNews(var mContext: Context, var mList: ArrayList<News>) : RecyclerView.Adapter<AdapterNews.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(mContext).inflate(R.layout.row_news_adapter, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var news = mList[position]
        holder.bind(news)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(news: News){
            itemView.row_layout_title.text = news.title
            itemView.row_layout_date.text = news.date.toString()
            itemView.row_layout_image.setImageResource(news.image)

            itemView.setOnClickListener{
                val toast = Toast.makeText(mContext, news.weather, Toast.LENGTH_SHORT)
                toast.view!!.setBackgroundColor(R.drawable.toast_background)
                toast.show()
            }
        }


    }

}

