package com.example.tantest.jeu.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.tantest.R
import com.example.tantest.databinding.FragmentOneFirstBinding
import com.example.tantest.databinding.FragmentZeroBinding

class FragmentOneFirst : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val binding = DataBindingUtil.inflate<FragmentOneFirstBinding>(
        inflater,
        R.layout.fragment_one_first,
        container,
        false
    )

        binding.btnOne.setOnClickListener() {
            findNavController().navigate(R.id.action_fragmentZero_to_fragmentOne)
        }

        binding.btnTwo.setOnClickListener() {
            findNavController().navigate(R.id.action_fragmentZero_to_fragmentZeroBis)
        }

        binding.btnThree.setOnClickListener() {
            findNavController().navigate(R.id.action_Dead)
        }



        return binding.root
    }

}