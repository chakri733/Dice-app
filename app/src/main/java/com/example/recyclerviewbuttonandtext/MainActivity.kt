package com.example.recyclerviewbuttonandtext

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewbuttonandtext.adapter.ItemAdapter
import com.example.recyclerviewbuttonandtext.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val button2: Button = findViewById(R.id.button2)

        var list2 = mutableListOf<String>()

        button.setOnClickListener {
            val image: ImageView = findViewById(R.id.iv1)
            val image2: ImageView = findViewById(R.id.iv2)
            val myDataset: MutableList<String> = Datasource().main()


            val num1 = Datasource().rolldice1()
            val num2 = Datasource().rolldice2()
            when (num1) {
                1 -> image.setImageResource(R.drawable.dice_1)
                2 -> image.setImageResource(R.drawable.dice_2)
                3 -> image.setImageResource(R.drawable.dice_3)
                4 -> image.setImageResource(R.drawable.dice_4)
                5 -> image.setImageResource(R.drawable.dice_5)
                6 -> image.setImageResource(R.drawable.dice_6)
            }
            image.contentDescription = num1.toString()
            val num1txt: TextView = findViewById(R.id.tv1)
            num1txt.text = num1.toString()

            when (num2) {
                1 -> image2.setImageResource(R.drawable.dice_1)
                2 -> image2.setImageResource(R.drawable.dice_2)
                3 -> image2.setImageResource(R.drawable.dice_3)
                4 -> image2.setImageResource(R.drawable.dice_4)
                5 -> image2.setImageResource(R.drawable.dice_5)
                6 -> image2.setImageResource(R.drawable.dice_6)
            }
            image2.contentDescription = num2.toString()
            val num2txt: TextView = findViewById(R.id.tv2)
            num2txt.text = num2.toString()

            var join = num1.toString()
            join += ","
            join += num2.toString()

            list2.addAll(myDataset)

            recyclerView.adapter = ItemAdapter(this, list2)

        }
        button2.setOnClickListener {
            for (i in 0..9) {
                list2.removeAt(0)
            }

            recyclerView.adapter = ItemAdapter(this, list2)
        }

    }
}



