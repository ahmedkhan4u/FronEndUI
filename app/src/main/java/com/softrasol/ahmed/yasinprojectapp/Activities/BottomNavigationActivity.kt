package com.softrasol.ahmed.yasinprojectapp.Activities

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TabHost
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.softrasol.ahmed.yasinprojectapp.Fragments.ScanFragment
import com.softrasol.ahmed.yasinprojectapp.Fragments.SearchFragment
import com.softrasol.ahmed.yasinprojectapp.Fragments.SettingsFragment
import com.softrasol.ahmed.yasinprojectapp.Fragments.ShareFragment
import com.softrasol.ahmed.yasinprojectapp.R
import com.tenclouds.fluidbottomnavigation.FluidBottomNavigation
import com.tenclouds.fluidbottomnavigation.FluidBottomNavigationItem
import com.tenclouds.fluidbottomnavigation.listener.OnTabSelectedListener

class BottomNavigationActivity : AppCompatActivity(), OnTabSelectedListener {

    lateinit var fluidBottomNavigation : FluidBottomNavigation
    var list = listOf<Fragment>(ScanFragment(), SearchFragment(), ShareFragment(), SettingsFragment())

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        setFragmnet(ScanFragment())

        fluidBottomNavigation = findViewById(R.id.fluidBottomNavigation)

        fluidBottomNavigation.onTabSelectedListener = this
        onTabSelected(fluidBottomNavigation.getSelectedTabPosition())

        fluidBottomNavigation.items =
                listOf(
                        FluidBottomNavigationItem(
                                getString(R.string.scan),
                                ContextCompat.getDrawable(this, R.drawable.ic_scan)),
                        FluidBottomNavigationItem(
                                getString(R.string.search),
                                ContextCompat.getDrawable(this, R.drawable.ic_search)),
                        FluidBottomNavigationItem(
                                getString(R.string.share),
                                ContextCompat.getDrawable(this, R.drawable.ic_share)),
                        FluidBottomNavigationItem(
                                getString(R.string.settings),
                                ContextCompat.getDrawable(this, R.drawable.ic_settings)),
                        )
    }

    fun setFragmnet(fragmnent : Fragment){
        var transaction = supportFragmentManager.beginTransaction().replace(R.id.fragment, fragmnent)
        transaction.commit()
    }

    override fun onTabSelected(position: Int) {
        setFragmnet(list.get(position))
    }
}