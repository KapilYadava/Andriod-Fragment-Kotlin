package com.example.fragment_andrioid_kotlin

import android.content.Context

class Utility(val context: Context) {

    private var list: ArrayList<Player> = ArrayList<Player>()

    fun getArrayList(): ArrayList<Player> {
        list.add(Player("Sachin Tendulkar", context.resources.getString(R.string.sachin)))
        list.add(Player("Virendra Sahwag", context.resources.getString(R.string.virendra)))
        list.add(Player("Yuvraj Singh", context.resources.getString(R.string.yuvraj)))
        list.add(Player("Virat Kohali", context.resources.getString(R.string.virat)))
        list.add(Player("MS Dhoni", context.resources.getString(R.string.dhoni)))
        list.add(Player("Ajay Jadeja", context.resources.getString(R.string.ajay)))
        list.add(Player("Sourav Ganguly", context.resources.getString(R.string.sourav)))
        return list
    }
}