package com.avp.foodcenter.features.view.signin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.avp.foodcenter.R
import kotlinx.android.synthetic.main.fragment_sign_in.*

class SignInFragment : Fragment() {

    private lateinit var mNavController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mNavController = Navigation.findNavController(view)
        initClickListener()
    }

    private fun initClickListener(){
        tvSignUp.setOnClickListener {
            mNavController.navigate(R.id.action_signInFragment_to_signUpFragment)
        }

        tvForgetPassword.setOnClickListener {
            mNavController.navigate(R.id.action_signInFragment_to_forgetPasswordFragment)
        }
    }

}
