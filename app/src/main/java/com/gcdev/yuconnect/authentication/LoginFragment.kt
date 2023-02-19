package com.gcdev.yuconnect.authentication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gcdev.yuconnect.MainActivity
import com.gcdev.yuconnect.R
import com.google.firebase.auth.FirebaseAuth

class LoginFragment : Fragment(R.layout.fragment_login){

    private lateinit var auth: FirebaseAuth

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = FirebaseAuth.getInstance()

        val tvCreateAccount = requireView().findViewById<TextView>(R.id.tvCreateAccount_login)

        tvCreateAccount.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        val btnAccess: Button = requireView().findViewById<AppCompatButton>(R.id.btnAccess_login)

        btnAccess.setOnClickListener{
            performLogin()
        }

    }

    private fun performLogin() {
        val email: EditText = requireView().findViewById(R.id.tiet_user_login)
        val password: EditText = requireView().findViewById(R.id.tiet_password_login)


        //verify that the form is empty
        if (email.text.isEmpty()){
            email.error = "Por favor agregue un nombre"
        }
        if (password.text.isEmpty()){
            password.error = "Por favor agregue una contraseña"
        }
        if(email.text.isEmpty() || password.text.isEmpty()){
            Toast.makeText(context, "Complete los campos", Toast.LENGTH_SHORT)
                .show()
            return
        }

        //store the values in variables before validation with firebase auth
        val emailInput = email.text.toString()
        val passwordInput = password.text.toString()

        auth.signInWithEmailAndPassword(emailInput, passwordInput)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    // Sign in success, go to the main activity page
                    val intent = Intent(activity, MainActivity::class.java)
                    startActivity(intent)

                    Toast.makeText(context, "Autenticacion Correcta", Toast.LENGTH_SHORT).show()
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(context, "Autenticacion Fallida",
                        Toast.LENGTH_SHORT).show()

                }
            }
            .addOnFailureListener{
                Toast.makeText(context, "Autenticacion Fallida ${it.localizedMessage}", Toast.LENGTH_SHORT).show()
            }
    }

}