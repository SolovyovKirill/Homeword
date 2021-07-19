package com.example.myapplication.homework13

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.lifecycle.withCreated
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentInfoCandyBinding
import com.example.myapplication.homework10.Candy


class InfoCandyFragment : Fragment() {

    private var binding: FragmentInfoCandyBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoCandyBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val info = arguments?.getParcelable<Candy>(KEY_INFO_CANDY_FRAGMENT)

        SharedPreferencesUtils.putString(SharedPrefsKeys.PREFS_MESSAGE_BRAND_KEY, info!!.brand)
        SharedPreferencesUtils.putInt(SharedPrefsKeys.PREFS_MESSAGE_BARCODE_KEY, info.barcode)

        binding?.tvBrand?.text = info.brand
        binding?.tvBarcodeNumber?.text = info.barcode.toString()
        addPicture()

        val animatiom = AnimationUtils.loadAnimation(context, R.anim.anim_alpha_scale_rotate)
        binding!!.ivCandy.startAnimation(animatiom)
    }

    private fun addPicture() {
        val resultValue = binding!!.tvBrand.text
        when (resultValue) {
            BRAND_SNICKERS -> {
                Glide
                    .with(binding!!.root)
                    .load(URL_SNICKERS)
                    .into(binding!!.ivCandy)
            }
            BRAND_MARS -> {
                Glide
                    .with(binding!!.root)
                    .load(URL_MARS)
                    .into(binding!!.ivCandy)
            }
            BRAND_BOUNTY -> {
                Glide
                    .with(binding!!.root)
                    .load(URL_BOUNTY)
                    .into(binding!!.ivCandy)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        const val KEY_INFO_CANDY_FRAGMENT = "KEY_INFO_CANDY_FRAGMENT"
        const val TAG = "INFO_CANDY_FRAGMENT"
        const val BRAND_SNICKERS = "Snickers"
        const val BRAND_MARS = "Mars"
        const val BRAND_BOUNTY = "Bounty"
        const val URL_SNICKERS =
            "https://telegka.com/image/cache/catalog/category/shokolad/07bd376b340e4ff36ccb113fe96cb2ce-1000x1000.jpg"
        const val URL_MARS =
            "https://ae01.alicdn.com/kf/Ue81e157831af483c93f86e98b611f80dh/Mars.jpg"
        const val URL_BOUNTY =
            "http://storage.googleapis.com/p24-photos/products/4011100977624/site/1_4011100977624.jpg"

    }
}

