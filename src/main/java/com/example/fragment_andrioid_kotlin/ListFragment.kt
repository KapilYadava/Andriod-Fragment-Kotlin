import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment_andrioid_kotlin.DetailFragment
import com.example.fragment_andrioid_kotlin.MyAdapter
import com.example.fragment_andrioid_kotlin.MyAdapter.CallFragment
import com.example.fragment_andrioid_kotlin.R
import com.example.fragment_andrioid_kotlin.Utility
import kotlinx.android.synthetic.main.fragment_item_list.view.*

class ListFragment : Fragment(), CallFragment {

    companion object {

        fun newInstance(): ListFragment {
            return ListFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_item_list, container, false)

        var list = Utility(activity!!.applicationContext)
        view.list.layoutManager = LinearLayoutManager(activity)
        var adapter = MyAdapter(list.getArrayList())
        view.list.adapter = adapter
        adapter.setOnCallFragment(this)

        return view
    }

    override fun call(position: Int) {
        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.detailFragment, DetailFragment.newInstance(position))
            ?.commit()
    }
}