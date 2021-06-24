package com.umerfarooque.coroutinesandroidplayground

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.umerfarooque.coroutinesandroidplayground.databinding.FragmentFlowBinding

class FlowFragment : Fragment() {

    private var binding: FragmentFlowBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bindingInstance = FragmentFlowBinding.inflate(inflater)
        binding = bindingInstance
        return binding?.root
    }
}
