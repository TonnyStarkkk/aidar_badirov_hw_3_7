package com.example.aidar_badirov_hw_3_7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aidar_badirov_hw_3_7.databinding.FragmentSecondBinding
import java.text.FieldPosition

class SecondFragment : Fragment(){
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter(){
        val adapter = AdapterMusic(
        arrayListOf(
            ItemMusic("After Dark", "Mr Kitty", "1", "3:23"),
            ItemMusic("Without Me", "Eminem", "2", "4:44"),
            ItemMusic("Lose YourSelf", "Eminem", "3", "4:50"),
            ItemMusic("The Real Slim Shady", "Eminem", "4", "4:19"),
            ItemMusic("Love The Way You Lie", "Eminem", "5", "4:13"),
            ItemMusic("Stan", "Eminem", "6", "6:34"),
            ItemMusic("Godzilla", "Eminem", "7", "3:29"),
            ItemMusic("Rap God", "Eminem", "8", "6:04"),
            ItemMusic("Smack That", "Eminem", "9", "3:36"),
            ItemMusic("The Monster", "Eminem", "10", "4:10"),
            ItemMusic("Mockingbird", "Eminem", "11", "4:17"),
        ), this::onClick
        )
        binding.rvMusic.adapter = adapter
    }

    private fun onClick(position: Int?){
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("key", position)
        startActivity(intent)
    }
}