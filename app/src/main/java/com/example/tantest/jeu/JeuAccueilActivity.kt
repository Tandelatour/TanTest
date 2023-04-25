package com.example.tantest.jeu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.tantest.R
import com.example.tantest.databinding.ActivityJeuAccueilBinding
import com.example.tantest.databinding.FragmentDeadBinding
import com.example.tantest.databinding.FragmentOneBinding
import com.example.tantest.databinding.FragmentZeroBinding

class JeuAccueilActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //version normal
        // setContentView(R.layout.activity_jeu_accueil)


        //TO DO pourquoi le data binding
        //utilisation du data binding
        val binding = DataBindingUtil.setContentView<ActivityJeuAccueilBinding>(
            this,
            R.layout.activity_jeu_accueil
        )
        val navController = findNavController(R.id.navContainer)
        binding.btnAccueil.setOnClickListener() {
        //Navigation.findNavController(this,R.id.navContainer).navigate(R.id.action_fragmentDead_to_fragmentZero)
            navController.navigate(R.id.fragmentZero)
        }



    }
}