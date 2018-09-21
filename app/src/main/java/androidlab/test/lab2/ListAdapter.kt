package androidlab.test.lab2

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidlab.test.sampleproject.R
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdapter(var actors: List<Actor>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = actors[position].name
        holder.role.text = actors[position].role
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return actors.size
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }


    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var name: TextView = itemView!!.name
        var role: TextView = itemView!!.role


    }
}