package com.example.fragment_andrioid_kotlin

import android.content.Context

class Utility(val context: Context) {

    private var list: ArrayList<Player> = ArrayList<Player>()

    fun getArrayList(): ArrayList<Player> {
        list.add(
            Player(
                "Sachin Tendulkar",
                context.resources.getString(R.string.sachin),
                context.resources.getString(R.string.sachin_image)
            )
        )
        list.add(
            Player(
                "Virendra Sahwag",
                context.resources.getString(R.string.virendra),
                context.resources.getString(R.string.virendra_image)
            )
        )
        list.add(
            Player(
                "Yuvraj Singh",
                context.resources.getString(R.string.yuvraj),
                context.resources.getString(R.string.yuvraj_image)
            )
        )
        list.add(
            Player(
                "Virat Kohali",
                context.resources.getString(R.string.virat),
                context.resources.getString(R.string.virat_image)
            )
        )
        list.add(
            Player(
                "MS Dhoni",
                context.resources.getString(R.string.dhoni),
                context.resources.getString(R.string.dhoni_image)
            )
        )
        list.add(
            Player(
                "Ajay Jadeja",
                context.resources.getString(R.string.ajay),
                context.resources.getString(R.string.ajay_image)
            )
        )
        list.add(
            Player(
                "Sourav Ganguly",
                context.resources.getString(R.string.sourav),
                context.resources.getString(R.string.sourav_image)
            )
        )

        return list
    }
}