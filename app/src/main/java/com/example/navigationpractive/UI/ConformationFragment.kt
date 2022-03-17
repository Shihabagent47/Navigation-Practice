package com.example.navigationpractive.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationpractive.R


class ConformationFragment : Fragment(),View.OnClickListener {
    lateinit var navController: NavController

    val args: ConformationFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_conformation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=view.findNavController()


        val name=args.name
        val numbers=args.number
        val amount=args.amount
        var nameText=view.findViewById<TextView>(R.id.tvUName)
        var numberText=view.findViewById<TextView>(R.id.tvUNumber)
        var amountText=view.findViewById<TextView>(R.id.tvuAmount)

        nameText.text=name
        numberText.text= numbers
        amountText.text= amount

        view.findViewById<Button>(R.id.btConfirm).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){

            R.id.btConfirm->navController.navigate(ConformationFragmentDirections.actionConformationFragmentToSuccessFragment2( ))
        }
    }


}