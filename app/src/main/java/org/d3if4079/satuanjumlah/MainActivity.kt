package org.d3if4079.satuanjumlah

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.d3if4079.satuanjumlah.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hitungbutton.setOnClickListener {
                val jumlah = binding.jumlaheditText.text.toString().toFloat();
                val pilih = binding.radioGroup2.checkedRadioButtonId;


            if (pilih== R.id.rim_Radio){
                val rumusRodi = jumlah*500;
                binding.jumlahkeseluruhanTextview.text = getString(R.string.jumlahkeseluruhan,rumusRodi);

            }else if(pilih== R.id.grossRadio){
                val rumusGross =jumlah*144;
                binding.jumlahkeseluruhanTextview.text = getString(R.string.jumlahkeseluruhan,rumusGross);


            }else if(pilih== R.id.lusinRadio){
                val rumusLusin = jumlah * 12;
                binding.jumlahkeseluruhanTextview.text = getString(R.string.jumlahkeseluruhan,rumusLusin);

            }else if(pilih==R.id.kodiRadio){
                val rumusKodi = jumlah*20;
                binding.jumlahkeseluruhanTextview.text = getString(R.string.jumlahkeseluruhan,rumusKodi);

            }else if (pilih ==-1){
                    Toast.makeText(this, "Harap Diisi Dengan Lengkap",Toast.LENGTH_SHORT).show();
            }

        }
    }
}