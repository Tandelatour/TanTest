package com.example.tantest.jeu.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.tantest.R
import com.example.tantest.databinding.FragmentDeadBinding



class FragmentDead : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentDeadBinding>(
            inflater,
            R.layout.fragment_dead,
            container,
            false
        )

        binding.btnOne.setOnClickListener() {
            findNavController().navigate(R.id.action_fragmentDead_to_fragmentZero)
        }
        return binding.root
    }


}