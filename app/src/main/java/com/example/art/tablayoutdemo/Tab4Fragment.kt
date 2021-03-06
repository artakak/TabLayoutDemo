package com.example.art.tablayoutdemo


import android.content.Context
import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_tab4.*


/**
 * A simple [Fragment] subclass.
 */
class Tab4Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab4, container, false)
        val button3 = view.findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            Toast.makeText(activity, "Fragment", Toast.LENGTH_LONG).show()
            val string1 = "name"
            val string2 = "test1"
            val preferences = activity!!.getSharedPreferences("pref", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString(string1, string2)
            editor.commit()
            val string3 = preferences.getString(string1, "None")
            Log.d("asd", string3)
        }
        return view
    }

}// Required empty public constructor
