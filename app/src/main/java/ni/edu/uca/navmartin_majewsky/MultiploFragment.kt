package ni.edu.uca.navmartin_majewsky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.navmartin_majewsky.databinding.FragmentMultiploBinding

class MultiploFragment : Fragment() {
    private lateinit var binding: FragmentMultiploBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMultiploBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnLetras.setOnClickListener(){
            val nombre = binding.editText.toString()
            binding.tvLetras.text = nombre.length.toString()

            if ((nombre.length)%2 == 0){
                binding.tvParoImpar.text = "Par"
            } else {
                binding.tvParoImpar.text = "Impar"
            }
        }
    }
}