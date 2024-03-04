package com.a4d.retrorumble

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.a4d.retrorumble.databinding.FragmentEncyclopediaBinding

class EncyclopediaFragment: Fragment() {

    private var _binding: FragmentEncyclopediaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEncyclopediaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.a4dButton.setOnClickListener {
            findNavController().navigate(R.id.action_EncyclopediaFragment_to_About4DFragment)
        }
        binding.EnBackButton.setOnClickListener {
            findNavController().navigate(R.id.action_EncyclopediaFragment_to_ThirdFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
