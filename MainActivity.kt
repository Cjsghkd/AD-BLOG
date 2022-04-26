package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import androidx.databinding.DataBindingUtil
import com.example.myproject.databinding.ActivityMainBinding

val stockList = ArrayList<Stock>()

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this


        registrationPost(R.drawable.ic_launcher_background, "1", "Java")
        registrationPost(R.drawable.ic_launcher_foreground, "3", "Kotlin | Java")
        registrationPost(R.drawable.ic_launcher_background, "4", "Java")
        registrationPost(R.drawable.ic_launcher_background, "5", "Java | Kotlin")
        registrationPost(R.drawable.ic_launcher_foreground, "6", "Kotlin | Java")
        registrationPost(R.drawable.ic_launcher_background, "8", "Kotlin")

        val adapter = Adapter(stockList)

        val mainRecyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        mainRecyclerView.layoutManager
        mainRecyclerView.adapter = adapter


        val registrationButton = findViewById<Button>(R.id.registrationButton)
        val myPageButton = findViewById<Button>(R.id.myPageButton)

        registrationButton.setOnClickListener {
            val intent = Intent(this, registrationPage::class.java)
            startActivity(intent)
        }

        myPageButton.setOnClickListener {
            val intent2 = Intent(this, myPage::class.java)
            startActivity(intent2)

        }

    }
}


fun registrationPost(image: Int, name: String, divide: String) {
    stockList.add(Stock(image, name, divide))
}


//private fun <E> ArrayList<E>.add(image: E, name: String, divide: String) {
//
//}
