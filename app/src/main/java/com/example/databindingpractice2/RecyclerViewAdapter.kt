package com.example.databindingpractice2
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingpractice2.databinding.RecyclerViewItemBinding

class RecyclerViewAdapter(private val data:List<Model >):RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RecyclerViewItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:Model){
            binding.listItem=item
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
        val inflater=LayoutInflater.from(parent.context)
        val listItemBinding=RecyclerViewItemBinding.inflate(inflater,parent,false)
        return MyViewHolder(listItemBinding)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int){
        holder.bind(data[position])
    }
    override fun getItemCount(): Int {
        return data.size
    }
}
