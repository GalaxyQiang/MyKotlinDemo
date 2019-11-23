package com.john.history.mykotlindemo

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import com.john.history.mykotlindemo.coroutine.CoroutineActivity
import com.john.history.mykotlindemo.databindingtest.DatabindingActivity
import com.john.history.mykotlindemo.fragmentest.FragmentLifeCycleActivity
import com.john.history.mykotlindemo.livedatatest.LiveDataTestActivity
import com.john.history.mykotlindemo.livedatatest.MediatorLiveDataActivity
import com.john.history.mykotlindemo.livedatatest.SwitchMapActivity
import com.john.history.mykotlindemo.livedatatest.TransformationsActivity
import com.john.history.mykotlindemo.recycleviewtest.RecycleViewActivity
import com.john.history.mykotlindemo.uitest.GestureActivity
import com.john.history.mykotlindemo.uitest.SystemUiActivity
import com.john.history.mykotlindemo.viewmodel.ViewModelActivity

class MainAdapter(var data: List<String>): androidx.recyclerview.widget.RecyclerView.Adapter<MainAdapter.ViewHolder>(){

    override fun onCreateViewHolder(view: ViewGroup, p1: Int): ViewHolder {
        Log.d("xxx","oncreateviewholder")
        return ViewHolder(LayoutInflater.from(view.context).inflate(R.layout.main_adapter_item,view,false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onBindViewHolder(viewholder: ViewHolder, item: Int) {
        val destination:String=data[item]
        val context:Context=viewholder.button.context
        viewholder.button.text=destination
        when(destination){
            "SystemUiActivity"-> viewholder.button.setOnClickListener { context.startActivity(Intent(context, SystemUiActivity::class.java)) }
            "GestureActivity"-> viewholder.button.setOnClickListener { context.startActivity(Intent(context, GestureActivity::class.java)) }
            "SwitchMapActivity"-> viewholder.button.setOnClickListener { context.startActivity(Intent(context, SwitchMapActivity::class.java)) }
            "TransformationsActivity"-> viewholder.button.setOnClickListener { context.startActivity(Intent(context, TransformationsActivity::class.java)) }
            "MediatorLiveDataActivity"-> viewholder.button.setOnClickListener { context.startActivity(Intent(context, MediatorLiveDataActivity::class.java)) }
            "CoroutineActivity"-> viewholder.button.setOnClickListener { context.startActivity(Intent(context, CoroutineActivity::class.java)) }
            "FragmentLifeCycleActivity" -> viewholder.button.setOnClickListener { context.startActivity(Intent(context, FragmentLifeCycleActivity::class.java)) }
            "DatabindingActivity" -> viewholder.button.setOnClickListener { context.startActivity(Intent(context, DatabindingActivity::class.java)) }
            "RecycleViewActivity" -> viewholder.button.setOnClickListener { context.startActivity(Intent(context, RecycleViewActivity::class.java)) }
            "ViewModelActivity" -> viewholder.button.setOnClickListener { context.startActivity(Intent(context, ViewModelActivity::class.java)) }
        }
    }

    class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
        var button:Button=itemView.findViewById(R.id.IntentButton)
    }
}