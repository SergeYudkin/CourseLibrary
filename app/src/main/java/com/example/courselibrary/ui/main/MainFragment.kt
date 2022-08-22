package com.example.courselibrary.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.courselibrary.R
import com.example.courselibrary.databinding.FragmentMainBinding

class MainFragment : Fragment(), MainView {

   private lateinit var presenter: CountersPresenter

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get(){
            return _binding!!
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initPresenter()

        with(binding){
            buttonBoomOne.setOnClickListener {
                presenter.onCounterClick(R.id.buttonBoomOne)
            }
            buttonBoomSecond.setOnClickListener {
                presenter.onCounterClick(R.id.buttonBoomSecond)
            }
            buttonBoomThird.setOnClickListener {
                presenter.onCounterClick(R.id.buttonBoomThird)
            }
        }

    }

        private fun initPresenter(){
            presenter  = CountersPresenter(this)
        }

    override fun setText(counter: String, position: Int) {
        with(binding){
            when(position){
                0 -> messageOne.text = counter
                1 -> messageSecond.text = counter
                2 -> messageThird.text = counter
            }
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        fun newInstance() = MainFragment()
    }

}