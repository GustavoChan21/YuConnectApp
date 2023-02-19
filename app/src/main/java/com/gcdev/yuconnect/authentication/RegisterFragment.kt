package com.gcdev.yuconnect.authentication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.UsernameModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class RegisterFragment : Fragment(R.layout.fragment_register) {
    private lateinit var auth: FirebaseAuth
    private lateinit var etUsername: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnRegister: Button
    private lateinit var dbRef: DatabaseReference

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //  Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        //  Transition between register to login fragments
        val tvHaveAccount = requireView().findViewById<TextView>(R.id.tvHaveAccount_register)
        tvHaveAccount.setOnClickListener{
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }

        //  Action of btn register account
        btnRegister = requireView().findViewById(R.id.btnCreateAccount_register)

        //  Save UserName in a Realtime DataBase
        etUsername = requireView().findViewById(R.id.tiet_user_register)
        etEmail = requireView().findViewById(R.id.tiet_email_register)
        etPassword = requireView().findViewById(R.id.tiet_password_register)
        dbRef = FirebaseDatabase.getInstance().getReference("Usernames")

        btnRegister.setOnClickListener{
            //  Save data about user login account and username in Realtime Database
            performSignUp()

        }
    }

    private fun performSignUp() {
        //Variables
        val user = requireView().findViewById<EditText>(R.id.tiet_user_register)
        val email = requireView().findViewById<EditText>(R.id.tiet_email_register)
        val password = requireView().findViewById<EditText>(R.id.tiet_password_register)

        //Verify if some specific input is empty
        if (user.text.isEmpty()){
            user.error = "Por favor agregue un nombre"
        }
        if (email.text.isEmpty()){
            email.error = "Por favor agregue un correo"
        }
        if (password.text.isEmpty()){
            password.error = "Por favor agregue una contraseña"
        }
        //verify that all form is not empty
        if (user.text.isEmpty() || email.text.isEmpty() || password.text.isEmpty()) {
            Toast.makeText(context, "Por favor complete los campos", Toast.LENGTH_SHORT)
                .show()
            return
        }

        //store the values in variables before validation with firebase auth
        val inputUsername = user.text.toString()
        val inputEmail = email.text.toString()
        val inputPassword = password.text.toString()

        //Save username inside Realtime Database
        val userID = dbRef.push().key!!

        val userRTDB = UsernameModel(userID, inputUsername)

        dbRef.child(userID).setValue(userRTDB)
            .addOnCompleteListener{
                Toast.makeText(context, "Datos Guardados Correctamente", Toast.LENGTH_LONG).show()
                etUsername.text.clear()
                etEmail.text.clear()
                etPassword.text.clear()
            }.addOnFailureListener{ err ->
                Toast.makeText(context, "Error en ${err.message}", Toast.LENGTH_LONG).show()
            }

        //Confirm and validate signUp
        auth.createUserWithEmailAndPassword(inputEmail, inputPassword)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    // Sign in success, let move to the next activity
                    val intent = Intent(activity, AuthActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(context, "Autenticación Correcta, puede iniciar sesíon.", Toast.LENGTH_SHORT).show()
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(
                        context, "Autenticación fallida.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            .addOnFailureListener {
                Toast.makeText(context, "Error ocurrido en ${it.localizedMessage}", Toast.LENGTH_SHORT)
                    .show()
            }
    }

}