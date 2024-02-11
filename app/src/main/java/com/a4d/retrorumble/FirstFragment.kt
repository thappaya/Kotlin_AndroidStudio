package com.a4d.retrorumble

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.a4d.retrorumble.databinding.FragmentFirstBinding
import com.google.android.material.snackbar.Snackbar
class FirstFragment : Fragment() {



    private var _binding: FragmentFirstBinding? = null

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
        setHasOptionsMenu(true)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        // Inflate the menu only for the FirstFragment
        inflater.inflate(R.menu.menu_main, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                findNavController().navigate(R.id.action_FirstFragment_to_AboutFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    private fun parseText() {
        val inputText = binding.etUserName.text.toString().trim()

        if (inputText.isNotEmpty()) {
            val words = inputText.split(" ")
            val parsedText = words.joinToString(" ")
            Snackbar.make(requireView(), "Welcome to the world of RETRO RUMBLE!\nLogged in as $parsedText", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        } else {
            Snackbar.make(requireView(), "DEMO mode initiated. Logout and enter your Account Name and Password to use the app.", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }
    }
}

