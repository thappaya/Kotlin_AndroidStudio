package com.a4d.retrorumble

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.a4d.retrorumble.databinding.FragmentPlaystationBinding

class PlayStationFragment: Fragment() {
    private var _binding: FragmentPlaystationBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlaystationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.PSBack.setOnClickListener {
            findNavController().navigate(R.id.action_PlayStationFragment_to_ShopFragment)
        }
        binding.ps3Button.setOnClickListener {
            findNavController().navigate(R.id.action_PlayStationFragment_to_PS3Fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
