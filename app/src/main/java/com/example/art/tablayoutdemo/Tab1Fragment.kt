package com.example.art.tablayoutdemo


import android.app.Activity
import android.app.FragmentManager
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.util.Printer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


/**
 * A simple [Fragment] subclass.
 */
class Tab1Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab1, container, false)
        val textView = view.findViewById<TextView>(R.id.textView)
        val button = view.findViewById<Button>(R.id.button)
        val button2 = view.findViewById<Button>(R.id.button2)
        button.setOnClickListener {
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
        button2.setOnClickListener{
            textView.text = "BLABLA"
            Log.d("asd", textView.text as String)
        }
        return view
    }

}// Required empty public constructor
