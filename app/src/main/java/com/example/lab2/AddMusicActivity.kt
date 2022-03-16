package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab2.databinding.ActivityAddMusicBinding
import com.example.lab2.recyclerview.User

class AddMusicActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddMusicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.save.setOnClickListener {
            val name = binding.edtName.text.toString()
            val phone  = binding.phone.text.toString()

            val user = User(name, phone)

            MainActivity.Users.add(user)


            finish()
        }
    }
}
