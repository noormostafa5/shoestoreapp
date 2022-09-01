package com.example.shoestoreapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.shoestoreapp.databinding.FragmentWelcomeBinding
import com.example.shoestoreapp.databinding.FragmentShoeListBinding
import androidx.navigation.findNavController
import com.example.shoestoreapp.databinding.FragmentTitleBinding


class ShoeListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_list,container,false)
        binding.done2Button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_shoeListFragment_to_shoeDetailFragment))
        return binding.root
    }


    }
