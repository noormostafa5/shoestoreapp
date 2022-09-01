package com.example.shoestoreapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.shoestoreapp.databinding.FragmentTitleBinding
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.shoestoreapp.databinding.FragmentWelcomeBinding
import androidx.navigation.findNavController


class WelcomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentWelcomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_welcome,container,false)
        binding.nextButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_instructionsFragment))
        return binding.root

    }


}

