package com.example.bottomappbartest

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.custom_view.view.*

class CustomView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(context, attrs, defStyleAttr) {


    private lateinit var fragmentManager: FragmentManager

    init {
        View.inflate(context, R.layout.custom_view, this)

    }

    fun  setFragmentManager(fragmentManager: FragmentManager){
        this.fragmentManager =  fragmentManager
        setViews()
    }

    private fun setViews() {
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"))


        viewPager.adapter = ViewPagerAdpater(fragmentManager)
        tabLayout.setupWithViewPager(viewPager)
    }

}