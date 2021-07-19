package com.example.myapplication.homework13

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.example.myapplication.databinding.ActivityMyBinding
import com.example.myapplication.homework10.Candy


class MyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val messageBrand =
            SharedPreferencesUtils.getString(SharedPrefsKeys.PREFS_MESSAGE_BRAND_KEY)
        val messageBarcode: Int =
            SharedPreferencesUtils.getInt(SharedPrefsKeys.PREFS_MESSAGE_BARCODE_KEY)

        val toast = Toast.makeText(
            applicationContext,
            "Candy brand: $messageBrand\n Barcode candy: $messageBarcode", Toast.LENGTH_LONG
        )
        toast.show()

        val fragment = supportFragmentManager.findFragmentByTag(
            InfoCandyFragment.TAG
        ) ?: supportFragmentManager.findFragmentByTag(BarcodeCandyFragment.BARCODE_CANDY_FRAGMENT)

        if (fragment != null) {
            supportFragmentManager.beginTransaction().replace(
                binding.fragmentContainerView.id,
                fragment
            )
                .commit()
        } else {
            supportFragmentManager.beginTransaction().replace(
                binding.fragmentContainerView.id,
                BarcodeCandyFragment(),
                BarcodeCandyFragment.BARCODE_CANDY_FRAGMENT
            )
                .commit()
        }

    }

    fun barcodeClickListener(candy: Candy) {
        val fragmentInfo = InfoCandyFragment().apply {
            arguments = bundleOf(InfoCandyFragment.KEY_INFO_CANDY_FRAGMENT to candy)
        }
        supportFragmentManager.beginTransaction()
            .replace(
                binding.fragmentContainerView.id,
                fragmentInfo,
                InfoCandyFragment.TAG
            )
            .addToBackStack(InfoCandyFragment.TAG)
            .commit()
    }


}