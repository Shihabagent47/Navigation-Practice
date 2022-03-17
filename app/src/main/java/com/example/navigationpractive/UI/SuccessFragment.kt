package com.example.navigationpractive.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.navigationpractive.R



class SuccessFragment : Fragment(),View.OnClickListener {
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_success, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=view.findNavController()

        view.findViewById<Button>(R.id.button5).setOnClickListener(this)
        view.findViewById<Button>(R.id.button6).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
    when (v!!.id){

        R.id.button5->navController.navigate(R.id.action_successFragment2_to_profileFragment)
        R.id.button6->navController.navigate(R.id.action_successFragment2_to_userInputFragment)
    }

    }


}