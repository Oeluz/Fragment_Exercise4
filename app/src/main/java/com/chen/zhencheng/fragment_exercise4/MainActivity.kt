/*
* Author:       Zhencheng Chen
* Program:      Exercise 4 - Fragment
* Course:       Mobile App Development II
* Date:         10/19/2021
* */

package com.chen.zhencheng.fragment_exercise4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportFragmentManager.findFragmentById(R.id.display) == null){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.display, WelcomeFragment())
                .commit()
        }
    } // onCreate

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_info -> InfoDialog()
                .show(supportFragmentManager, "info")
        }
        return super.onOptionsItemSelected(item)
    }

    fun answerDisplay(view: android.view.View) {
        val fragment = DisplayFragment()
        val args = Bundle()
        when(view.id){
            R.id.vegetable_1 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.asparagus)
                args.putString(DisplayFragment.ARG_TEXT_ID, "ASPARAGUS")
            }
            R.id.vegetable_2 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.bambo_shoots)
                args.putString(DisplayFragment.ARG_TEXT_ID, "BAMBOO SHOOT")
            }
            R.id.vegetable_3 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.carrots)
                args.putString(DisplayFragment.ARG_TEXT_ID, "CARROT")
            }
            R.id.vegetable_4 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.daikon)
                args.putString(DisplayFragment.ARG_TEXT_ID, "DAIKON")
            }
            R.id.vegetable_5 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.eggplant)
                args.putString(DisplayFragment.ARG_TEXT_ID, "EGGPLANT")
            }
            R.id.vegetable_6 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.fiddleheads)
                args.putString(DisplayFragment.ARG_TEXT_ID, "FIDDLEHEAD")
            }
            R.id.vegetable_7 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.ginger_root)
                args.putString(DisplayFragment.ARG_TEXT_ID, "GINGER ROOT")
            }
            R.id.vegetable_8 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.horseradish)
                args.putString(DisplayFragment.ARG_TEXT_ID, "HORSERADISH")
            }
            R.id.vegetable_9 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.jicama)
                args.putString(DisplayFragment.ARG_TEXT_ID, "JICAMA")
            }
            R.id.vegetable_10 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.kale)
                args.putString(DisplayFragment.ARG_TEXT_ID, "KALE")
            }
            R.id.vegetable_11 -> {
                args.putInt(DisplayFragment.ARG_IMAGE_ID, R.drawable.leeks)
                args.putString(DisplayFragment.ARG_TEXT_ID, "LEEK")
            }
        }
        fragment.arguments = args
        supportFragmentManager.beginTransaction()
            .replace(R.id.display, fragment)
            .commit()}
}