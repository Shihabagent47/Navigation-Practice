package com.example.navigationpractive.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.navigationpractive.R


class UserInputFragment : Fragment()  {

    lateinit var navController:NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_input, container, false)
    }





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=view.findNavController()
       var nameTv= view.findViewById<EditText>(R.id.editTextTextPersonName)
       var numberTv= view.findViewById<EditText>(R.id.editTextPhone)
       var amountTv= view.findViewById<EditText>(R.id.editTextAmount)
       var sendButton=view.findViewById<Button>(R.id.btSend)


        sendButton.setOnClickListener {
            navController.navigate(UserInputFragmentDirections.actionUserInputFragmentToConformationFragment(nameTv.text.toString(),amountTv.text.toString(),numberTv.text.toString()))
        }


    }

}