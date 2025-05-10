package ad.cfp.edutrackand.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ad.cfp.edutrackand.R
import ad.cfp.edutrackand.databinding.FragmentAjudaBinding

class AjudaFragment : Fragment() {

    private var _binding: FragmentAjudaBinding? = null
    private var binding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAjudaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}