package ni.edu.uca.navmartin_majewsky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.navmartin_majewsky.databinding.FragmentMediaAritBinding
import ni.edu.uca.navmartin_majewsky.databinding.FragmentMenuBinding

class MediaAritFragment : Fragment() {

    private lateinit var binding: FragmentMediaAritBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMediaAritBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnMediaArit.setOnClickListener(){

        }

        binding.btnMediaAritSumar.setOnClickListener(){

        }
    }
}