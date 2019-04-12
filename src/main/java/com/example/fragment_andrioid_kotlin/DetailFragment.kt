package com.example.fragment_andrioid_kotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_detail.view.*


class DetailFragment : Fragment() {

    companion object {
        fun newInstance(position: Int): DetailFragment {
            val bundle = Bundle()
            bundle.putInt("POS", position)
            var fragment = DetailFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        val position: Int = arguments!!.getInt("POS")
        val list = Utility(activity!!.applicationContext).getArrayList()
        view.textView.text = list[position].about
        Picasso.get()
            .load(list[position].image)
            .placeholder(R.mipmap.ic_launcher)
            .error(R.mipmap.ic_launcher)
            .into(view.image)

        return view
    }


}
