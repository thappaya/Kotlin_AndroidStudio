package com.a4d.retrorumble

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.a4d.retrorumble.databinding.FragmentFirstBinding
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {



    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_ThirdFragment)
            parseText()
        }
        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun parseText() {
        val inputText = binding.etUserName.text.toString().trim()

        if (inputText.isNotEmpty()) {
            val words = inputText.split(" ")
            val parsedText = words.joinToString(" ")
            Snackbar.make(requireView(), "Welcome to the world of RETRO RUMBLE!\nLogged in as $parsedText", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        } else {
            Snackbar.make(requireView(), "Please enter some text", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }
    }
}

