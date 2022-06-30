package com.archbrnvch.baranovichsights

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rvarch.*

class RVArch : AppCompatActivity() {

    val data = listOf(
        DataModel(R.drawable.caption, "Sparrow Monument"),
        DataModel(R.drawable.manor, "Museum-Estate of Adam Mitskevich"),
        DataModel(R.drawable.capr, "Fire Department"),
        DataModel(R.drawable.mir, "Mir Castle"),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rvarch)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RVAdapter(data)

    }
}