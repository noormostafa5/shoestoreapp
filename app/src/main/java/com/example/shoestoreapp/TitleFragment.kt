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
import com.example.shoestoreapp.databinding.FragmentTitleBinding
import com.example.shoestoreapp.databinding.FragmentWelcomeBinding
import androidx.navigation.findNavController

class TitleFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)
        binding.doneButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_welcomeFragment))
        return binding.root
    }
}

