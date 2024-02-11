package com.a4d.retrorumble

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.a4d.retrorumble.databinding.FragmentSecondBinding
import com.google.android.material.snackbar.Snackbar


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
            parseText()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun parseText() {
        val inputText = binding.editTextTextEmailAddress.text.toString().trim()

        if (inputText.isNotEmpty()) {
            val words = inputText.split(" ")
            val parsedText = words.joinToString(" ")
            Snackbar.make(requireView(), "Sign up successful!\nPlease log in as $parsedText", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        } else {
            Snackbar.make(requireView(), "Sign up failed! Please try again later.", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }
    }
}