package com.softhans.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("African Food", "Thai Food", "Chinese Food", "French Food", "Italian Food")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            //Do a random selection from the foodList
            val randomFood= Random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {

            //collect new item from addFoodTxt...
            val newFood = addFoodTxt.text.toString()

            //and adding to foodlist
            foodList.add(newFood)

            //Clear the addFoodTxt field
            addFoodTxt.text.clear()

            //Show Toast to confirm
            val confirmedAdd = Toast.makeText(this, "New food had been added to collection",Toast.LENGTH_SHORT).show()
        }
    }
}