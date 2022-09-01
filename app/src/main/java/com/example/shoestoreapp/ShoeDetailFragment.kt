package com.example.shoestoreapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.shoestoreapp.databinding.FragmentShoeDetailBinding
import androidx.navigation.Navigation
import com.example.shoestoreapp.databinding.FragmentInstructionsBinding


class ShoeDetailFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_detail,container,false)
        binding.done1Button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_shoeDetailFragment_to_titleFragment2))
        return binding.root
    }



}