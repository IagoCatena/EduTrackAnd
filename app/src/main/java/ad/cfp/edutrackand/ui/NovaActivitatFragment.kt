package ad.cfp.edutrackand.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ad.cfp.edutrackand.R
import ad.cfp.edutrackand.databinding.FragmentNovaActivitatBinding

class NovaActivitatFragment : Fragment() {

    private var _binding: FragmentNovaActivitatBinding? = null
    private var binding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNovaActivitatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}