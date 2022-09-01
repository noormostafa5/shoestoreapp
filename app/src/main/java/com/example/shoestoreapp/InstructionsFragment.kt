package com.example.shoestoreapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.shoestoreapp.databinding.FragmentInstructionsBinding
import com.example.shoestoreapp.databinding.FragmentWelcomeBinding
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.findNavController
import com.example.shoestoreapp.databinding.FragmentTitleBinding
import com.example.shoestoreapp.databinding.FragmentShoeListBinding


class InstructionsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentInstructionsBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_instructions,container,false)
        binding.nextText.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_instructionsFragment_to_shoeListFragment))
        return binding.root

    }


    }
