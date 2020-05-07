package com.avp.foodcenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_bottom_navigation.*


class BottomNavigationActivity : AppCompatActivity() {
    private lateinit var mNavController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        mNavController = Navigation.findNavController(this,R.id.fragment_main_nav_host)
        mNavController.saveState()
        bottom_nav_view.setupWithNavController(mNavController)
    }
}