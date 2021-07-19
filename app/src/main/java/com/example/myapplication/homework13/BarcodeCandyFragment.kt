package com.example.myapplication.homework13

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.FragmentBarcodeCandyBinding

class BarcodeCandyFragment : Fragment() {

    private val barcodeAdapter = BarcodeAdapter {
        (activity as? MyActivity)?.barcodeClickListener(it)
    }

    private var binding: FragmentBarcodeCandyBinding? = null
    private val barcodeViewModel: BarcodeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentBarcodeCandyBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        with(binding!!.rvBarcode) {
            layoutManager = LinearLayoutManager(
                view.context, LinearLayoutManager.VERTICAL, false
            )
            adapter = barcodeAdapter
        }

        barcodeViewModel.liveData.observe(viewLifecycleOwner,{
            barcodeAdapter.update(it)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        const val BARCODE_CANDY_FRAGMENT = "BARCODE_CANDY_FRAGMENT"
    }

}