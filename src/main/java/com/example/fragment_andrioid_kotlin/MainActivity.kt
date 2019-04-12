package com.example.fragment_andrioid_kotlin

import ListFragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.listFragment, ListFragment.newInstance(), "ListFragment")
            .commit()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.detailFragment, DetailFragment.newInstance(0), "DetailFragment")
            .commit()

    }

}
