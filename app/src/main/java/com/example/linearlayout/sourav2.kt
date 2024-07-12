package com.example.linearlayout

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sourav2 : AppCompatActivity() {
    var btn:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sourav2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.sourav)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnsave=findViewById<Button>(R.id.btnsave)
        val btncancle=findViewById<Button>(R.id.btncancle)

        btnsave.setOnClickListener {
            Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show()
        }
        btncancle.setOnClickListener {
            Toast.makeText(this,"Cancled",Toast.LENGTH_SHORT).show()
        }

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"On Start",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"On Stop", Toast.LENGTH_SHORT).show()

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"On Restart", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"On Destroy", Toast.LENGTH_SHORT).show()

    }



}