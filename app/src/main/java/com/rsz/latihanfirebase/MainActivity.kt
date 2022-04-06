package com.rsz.latihanfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsz.latihanfirebase.adapter.ViewPagerAdapter
import com.rsz.latihanfirebase.databinding.ActivityMainBinding
import com.rsz.latihanfirebase.fragment.HomeFragment
import com.rsz.latihanfirebase.fragment.UserFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTab()
    }

    private fun setupTab() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(),"Home")
        adapter.addFragment(UserFragment(),"Profile")

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_home)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.ic_user)
    }
}