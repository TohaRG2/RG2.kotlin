package ru.tohaman.rg2.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.*
import ru.tohaman.rg2.ui.TimerUI


class FragmentTimer : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return TimerUI<Fragment>().createView(AnkoContext.create(context, this))
    }

    override fun onPause() {
        super.onPause()
    }

}

