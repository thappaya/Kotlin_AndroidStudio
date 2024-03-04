package com.a4d.retrorumble

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.a4d.retrorumble.databinding.FragmentThirdBinding
import com.google.android.material.snackbar.Snackbar

class ThirdFragment : Fragment() {
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.arcadeButton.setOnClickListener {
            Snackbar.make(view,"Please contact the RETRO RUMBLE Arcade Staff and scan the QR" +
                    " Code to redeem", Snackbar.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_ThirdFragment_to_FourthFragment)
        }
        binding.freeDrinkButton.setOnClickListener {
            Snackbar.make(view,"Please contact the RUMBLECAFÉ Barista and scan the QR" +
                    " Code to redeem", Snackbar.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_ThirdFragment_to_FifthFragment)
        }
        binding.rrMapButton.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_MapFragment)
        }
        binding.logoutButton.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_FirstFragment)
        }
        binding.shopButton.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_ShopFragment)
        }
        binding.fab.setOnClickListener {
            Snackbar.make(view, "RETRO RUMBLE Support: 1800-RTR-RUMBLE (Free, " +
                    "Available Everyday at 8AM-6PM)", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            findNavController().navigate(R.id.action_ThirdFragment_to_SupportFragment)
        }
        binding.rrEnButton.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_EncyclopediaFragment)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}




