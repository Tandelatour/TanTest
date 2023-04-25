package com.example.tantest.jeu.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.tantest.R
import com.example.tantest.databinding.FragmentZeroBinding
import com.example.tantest.databinding.FragmentZeroBisBinding


class FragmentZeroBis : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentZeroBisBinding>(
            inflater,
            R.layout.fragment_zero_bis,
            container,
            false
        )

        binding.btnOne.setOnClickListener() {
            findNavController().navigate(R.id.action_fragmentZeroBis_to_fragmentZero)
        }

        binding.btnTwo.setOnClickListener() {
            findNavController().navigate(R.id.action_Dead)
        }




        return binding.root
    }


}