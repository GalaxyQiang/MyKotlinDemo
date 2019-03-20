package com.john.history.mykotlindemo.recycleviewtest

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.john.history.mykotlindemo.R

class RvAdapter : RecyclerView.Adapter<RvAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        Log.d("AAA","onCreateViewHolder   "+i)
        return ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_aaa,viewGroup,false))
    }

    override fun onBindViewHolder(viewHolder: RvAdapter.ViewHolder, i: Int) {
        viewHolder.textView!!.text="top"+i
        Log.d("AAA","onBindViewHolder   "+i)

    }

    override fun getItemCount(): Int {
        return 15
    }

     class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView? = itemView.findViewById(R.id.textView)
    }


}
