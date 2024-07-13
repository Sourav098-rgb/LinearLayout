package com.example.linearlayout

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class surajkarki2 : AppCompatActivity() {
    var btn:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_surajkarki2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn=findViewById(R.id.ssave)
        btn?.setOnClickListener {
            Toast.makeText(this, "Saved successfully", Toast.LENGTH_SHORT).show()
        }
        btn=findViewById(R.id.scancle)
        btn?.setOnClickListener {
            Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show()
        }


    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "on Stop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "On Restart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show()
    }

}

