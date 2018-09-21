package androidlab.test.lab2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import androidlab.test.sampleproject.R
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    val actors = ArrayList<Actor>()
    val adapter = ListAdapter(actors)
    val i2=1
    val i3=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.adapter = adapter

        actors.add(Actor("Actor 1", "Main actor 1"))
        actors.add(Actor("Actor 2", "Main actor 2"))

        for (i in 3..8) {
            i2+1
            actors.add(Actor("Actor $i", "Secondary actor $i2"))
        }


        for (i in 8..30) {
            i3+1
            actors.add(Actor("Actor $i", "Stuff $i2"))
        }
        adapter.notifyDataSetChanged()

    }

    fun onClick2(){
        button1.setOnClickListener{
            actors.add(Actor("Actor 2", "Main actor 1"))
            adapter.notifyDataSetChanged()
        }
    }
}
