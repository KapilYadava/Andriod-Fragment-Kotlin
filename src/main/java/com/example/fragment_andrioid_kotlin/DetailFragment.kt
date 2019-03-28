package com.example.fragment_andrioid_kotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        var position: Int = arguments!!.getInt("POS")
        view.textView.text = Utility(activity!!.applicationContext).getArrayList().get(position).about
        return view
    }


}
