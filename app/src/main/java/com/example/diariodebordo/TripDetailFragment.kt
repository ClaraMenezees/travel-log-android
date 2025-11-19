package com.example.diariodebordo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.diariodebordo.databinding.FragmentTripDetailBinding

class TripDetailFragment : Fragment() {


    private var _binding: FragmentTripDetailBinding? = null
    private val binding get() = _binding!!


    private val args: TripDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTripDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val idRecebido = args.tripId

        binding.tvTituloDetalhe.text = "Detalhes da Viagem #$idRecebido"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}