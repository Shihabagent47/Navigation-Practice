package com.example.navigationpractive.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navigationpractive.R
import com.example.navigationpractive.databinding.FragmentProfileBinding


class ProfileFragment : Fragment(),View.OnClickListener {

    private var _binding:FragmentProfileBinding?=null
    private val binding get() = _binding!!
    lateinit var navController:NavController




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentProfileBinding.inflate(inflater,container,false)
        val view=binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        navController=view.findNavController()

        view.findViewById<Button>(R.id.btCheckbalance).setOnClickListener(this)
        view.findViewById<Button>(R.id.btSendMoney).setOnClickListener(this)



    }

    override fun onClick(v: View?) {
      when(v!!.id){
          R.id.btSendMoney->navController.navigate(R.id.action_profileFragment_to_userInputFragment)
          R.id.btCheckbalance->navController.navigate(R.id.action_profileFragment_to_moneyFragment)
      }
    }


}