package com.galaxe.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.*

import android.view.ViewGroup

class Fragment1 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v : View = layoutInflater.inflate(R.layout.fragment_1, container, false)
        // Inflate the layout for this fragment
        return v
    }


}