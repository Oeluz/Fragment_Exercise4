/*
* Author:       Zhencheng Chen
* Program:      Exercise 4 - Fragment
* Course:       Mobile App Development II
* Date:         10/19/2021
* */

package com.chen.zhencheng.fragment_exercise4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ChoicesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choices, container, false)
    }

}