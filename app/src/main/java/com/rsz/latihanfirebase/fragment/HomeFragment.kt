package com.rsz.latihanfirebase.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.rsz.latihanfirebase.R
import com.rsz.latihanfirebase.adapter.ProdukAdapter
import com.rsz.latihanfirebase.adapter.SliderAdapter
import com.rsz.latihanfirebase.databinding.FragmentHomeBinding
import com.rsz.latihanfirebase.model.ModelProduk

class HomeFragment : Fragment() {

    private var binding : FragmentHomeBinding? = null
    lateinit var vpSlider : ViewPager
    lateinit var rvBaju : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //<-- Slider -->
        vpSlider = view.findViewById(R.id.vp_slider)

        val arraySlider = ArrayList<Int>()

        arraySlider.add(R.drawable.carousel1)
        arraySlider.add(R.drawable.carousel2)
        arraySlider.add(R.drawable.carousel3)

        val sliderAdapter = SliderAdapter(arraySlider, activity)
        vpSlider.adapter = sliderAdapter

        //<-- RecyclerView Apparel -->
        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.HORIZONTAL
        rvBaju = view.findViewById(R.id.rv_baju)

        val adapterBaju = ProdukAdapter(ArrayBaju,activity)
        rvBaju.setHasFixedSize(true)
        rvBaju.layoutManager = lm
        rvBaju.adapter = adapterBaju

        return view
    }

    val ArrayBaju : ArrayList<ModelProduk>get(){

        val arraybaju = ArrayList<ModelProduk>()

        //1
        val produkbaju1 = ModelProduk()
        produkbaju1.namaProduk = "Baju VNWear"
        produkbaju1.hargaProduk = "Rp. 99.000"
        produkbaju1.gambarProduk = R.drawable.baju_1

        //2
        val produkbaju2 = ModelProduk()
        produkbaju2.namaProduk = "Baju VSchool"
        produkbaju2.hargaProduk = "Rp. 99.000"
        produkbaju2.gambarProduk = R.drawable.baju_2

        //3
        val produkbaju3 = ModelProduk()
        produkbaju3.namaProduk = "Baju Kerah Hitam"
        produkbaju3.hargaProduk = "Rp. 129.000"
        produkbaju3.gambarProduk = R.drawable.kerah_1

        //4
        val produkbaju4 = ModelProduk()
        produkbaju4.namaProduk = "Baju Kerah Merah"
        produkbaju4.hargaProduk = "Rp. 129.000"
        produkbaju4.gambarProduk = R.drawable.kerah_2

        //5
        val produkbaju5 = ModelProduk()
        produkbaju5.namaProduk = "Jaket Merah"
        produkbaju5.hargaProduk = "Rp. 149.000"
        produkbaju5.gambarProduk = R.drawable.jaket_1

        //6
        val produkbaju6 = ModelProduk()
        produkbaju6.namaProduk = "Jaket Hitam"
        produkbaju6.hargaProduk = "Rp. 149.000"
        produkbaju6.gambarProduk = R.drawable.jaket_2

        arraybaju.add(produkbaju1)
        arraybaju.add(produkbaju2)
        arraybaju.add(produkbaju3)
        arraybaju.add(produkbaju4)
        arraybaju.add(produkbaju5)
        arraybaju.add(produkbaju6)

        return arraybaju
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}