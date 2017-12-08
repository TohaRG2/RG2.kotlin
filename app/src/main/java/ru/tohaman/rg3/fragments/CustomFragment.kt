package ru.tohaman.rg3.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.withArguments

class CustomFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = PagerFragmentUI<Fragment>().createView(AnkoContext.create(context, this))
        val message = arguments.getString("message")
        (view.findViewById(PagerFragmentUI.Ids.textViewFragmentMessage) as TextView).text = message
        return view
    }

    companion object {
        fun newInstance(message: String): CustomFragment {
            return CustomFragment().withArguments("message" to message)
        }
    }
}
