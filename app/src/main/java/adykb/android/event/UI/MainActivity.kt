package adykb.android.event.UI

import adykb.android.event.R
import adykb.android.event.UI.Data.Event
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ListFragment.OnListFragmentInteractionListener, MapsFragment.OnFragmentInteractionListener {
    lateinit var mapsFragment: MapsFragment
    lateinit var listFragment: ListFragment

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                this.supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, listFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                this.supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, mapsFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listFragment = ListFragment.newInstance(1)
        mapsFragment = MapsFragment.newInstance("A", "B")

        this.supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, listFragment).commit()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun onListFragmentInteraction(item: Event?) {
        Log.i("Test_list", item.toString())
    }

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
