package com.example.fragment_andrioid_kotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.list_item.view.*

class MyAdapter(private val data: ArrayList<Player>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var listener: CallFragment

    fun setOnCallFragment(listener: CallFragment) {
        this.listener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false) as View
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = data[position].name
        holder.textView.setOnClickListener(OnClickListener {
            listener.call(position)
        })
    }

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView = view.text
    }


    interface CallFragment {
        fun call(position: Int)
    }

}