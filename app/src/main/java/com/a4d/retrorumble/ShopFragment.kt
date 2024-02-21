package com.a4d.retrorumble

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.a4d.retrorumble.databinding.FragmentShopBinding

class ShopFragment: Fragment() {
    private var _binding: FragmentShopBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentShopBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backButton4.setOnClickListener{
            findNavController().navigate(R.id.action_ShopFragment_to_ThirdFragment)
        }
        binding.PSButton.setOnClickListener{
            findNavController().navigate(R.id.action_ShopFragment_to_PlayStationFragment)
        }
        binding.AESButton.setOnClickListener{
            findNavController().navigate(R.id.action_ShopFragment_to_AESFragment)
        }
        binding.SEGAButton.setOnClickListener{
            findNavController().navigate(R.id.action_ShopFragment_to_SEGAFragment)
        }
        binding.NinButton.setOnClickListener{
            findNavController().navigate(R.id.action_ShopFragment_to_NintendoFragment)
        }
        binding.SNKButton.setOnClickListener {
            findNavController().navigate(R.id.action_ShopFragment_to_SNKFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
