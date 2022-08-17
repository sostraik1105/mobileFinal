package com.example.finalexam.ui.recover

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalexam.R

class RecoverPassFragment : Fragment() {

    companion object {
        fun newInstance() = RecoverPassFragment()
    }

    private lateinit var viewModel: RecoverPassViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recover_pass, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RecoverPassViewModel::class.java)
        // TODO: Use the ViewModel
    }

}