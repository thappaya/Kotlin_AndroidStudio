package com.a4d.retrorumble

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.a4d.retrorumble.databinding.FragmentSupportBinding

class SupportFragment: Fragment() {
    private var _binding: FragmentSupportBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSupportBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.reqButton.setOnClickListener {
            Snackbar.make(
                view, "Request sent! We will get to you as soon as possible!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            findNavController().navigate(R.id.action_SupportFragment_to_ThirdFragment)
        }
        binding.backButton8.setOnClickListener {
            findNavController().navigate(R.id.action_SupportFragment_to_ThirdFragment)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}