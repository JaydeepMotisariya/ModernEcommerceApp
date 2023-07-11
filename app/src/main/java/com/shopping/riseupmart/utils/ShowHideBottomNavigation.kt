package com.shopping.riseupmart.utils

import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.shopping.riseupmart.activities.ShoppingActivity

fun Fragment.hideBottomNavigationView() {
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.shopping.riseupmart.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView() {
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.shopping.riseupmart.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}