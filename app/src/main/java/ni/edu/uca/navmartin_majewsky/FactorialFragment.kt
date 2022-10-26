package ni.edu.uca.navmartin_majewsky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.navmartin_majewsky.databinding.FragmentFactorialBinding

class FactorialFragment : Fragment() {
    private lateinit var binding: FragmentFactorialBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFactorialBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnCuadrado.setOnClickListener(){
            val num = binding.editText.toString().toInt()
            binding.tvCuadrado.text = (num*num).toString()
        }
    }
}