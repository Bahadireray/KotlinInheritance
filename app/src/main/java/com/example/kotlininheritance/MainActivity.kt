package com.example.kotlininheritance

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
Miras alma yoluyla tekrar eden parametre tanımlamalarından uzak duruyoruz.
Temiz okunabilir bir ve sürdürülebilir bir yapı oluşuyor.
 */

        var car=Car("Mercedes",1995,4)
        var engine=Engine("elektrik","bmw",1990,4)


    }
}