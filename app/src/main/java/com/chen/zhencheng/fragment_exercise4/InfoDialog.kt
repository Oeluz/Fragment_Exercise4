/*
* Author:       Zhencheng Chen
* Program:      Exercise 4 - Fragment
* Course:       Mobile App Development II
* Date:         10/19/2021
* */

package com.chen.zhencheng.fragment_exercise4

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class InfoDialog : DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(activity)
            .setTitle("About")
            .setMessage("Zhencheng Chen - Exercise 4 Fragment")
            .create()
    } //onCreateDialog
}//class