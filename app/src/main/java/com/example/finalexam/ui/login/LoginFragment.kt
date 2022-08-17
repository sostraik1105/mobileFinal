package com.example.finalexam.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.finalexam.R
import com.example.finalexam.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val loginViewModel =
            ViewModelProvider(this)[LoginViewModel::class.java]

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val editTextEmail = binding.editTextEmail
        val editTextPassword = binding.editTextPassword
        val textView: TextView = binding.textLogin

        // firebase auth instance
        binding.login.setOnClickListener(View.OnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
            if(email.isEmpty() || password.isEmpty()) {
                Toast.makeText(context, "Please enter email/password", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            } else {
                //signIn(email, password)
                Navigation.findNavController(root).navigate(R.id.navigation_storage)
            }//ce267ce

        })
        binding.recover.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(root).navigate(R.id.navigation_recover)

        })

        binding.register.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(root).navigate(R.id.navigation_register)

        })



        loginViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
/*
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun signIn(email: String, password: String) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = firebaseAuth.currentUser
                    Toast.makeText(context, "Authentication success.", Toast.LENGTH_SHORT).show()
                } else {
                    Log.e("Error", task.exception.toString())
                    // If sign in fails, display a message to the user.
                    Toast.makeText(context, "Authentication failed.", Toast.LENGTH_SHORT).show()
                }
            }
        getUser()
    }

    private fun signOut() {
        firebaseAuth.signOut()
    }

    private fun signUp(email: String, password: String) {
        val user = hashMapOf(
            "email" to email,
            "password" to password
        )
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = firebaseAuth.currentUser
                    Toast.makeText(context, "Register success.", Toast.LENGTH_SHORT).show()
                } else {
                    Log.e("Error", task.exception.toString())
                    // If sign in fails, display a message to the user.
                    Toast.makeText(context, "Register failed.", Toast.LENGTH_SHORT).show()
                }
            }
    }

    private fun getUser(){
        db.collection("users")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    Log.d("User", "${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener { exception ->
                Log.w("User", "Error getting documents.", exception)
            }
    }
*/
}