package com.example.finalexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.finalexam.databinding.ActivityLoginBinding
import com.google.android.material.navigation.NavigationView

class StorageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    // Navigation
    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController
    lateinit var drawerLayout: DrawerLayout
    lateinit var navHostFragment: NavHostFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storage)

        navHostFragment = supportFragmentManager.findFragmentById(
            R.id.nav_host_fragment
        ) as NavHostFragment
        navController = navHostFragment.navController

        drawerLayout = findViewById(R.id.drawer_layout)

        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)

        configToolbarProps()
        configNavigationViewProps()

        findViewById<NavigationView>(R.id.nav_view).setupWithNavController(navController)
    }

    // Toolbar
    fun configToolbarProps(){
        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        toolbar.setupWithNavController(navController, appBarConfiguration)

    }

    // Navigation View
    fun configNavigationViewProps(){
        val navigationView = findViewById<NavigationView>(R.id.nav_view)

        navigationView.itemIconTintList = null

        navigationView.setItemTextAppearance(R.style.PoppinsMediumViewStyle)
    }
}