package com.example.aplikasi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvNiat;
    private TextView Latin;
    private TextView Arti;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNiat = findViewById(R.id.tvNiat);
        Latin = findViewById(R.id.Latin);
        Arti = findViewById(R.id.Arti);

        Button btnNiatPuasaRamadhan = findViewById(R.id.btnNiatPuasaRamadhan);
        Button btnNiatPuasaSunnah = findViewById(R.id.btnNiatPuasaSunnah);
        Button btnNiatPuasaSenin = findViewById(R.id.btnNiatPuasaSenin);
        Button btnNiatPuasaKamis = findViewById(R.id.btnNiatPuasaKamis);
        Button btnNiatPuasaSyawal = findViewById(R.id.btnNiatPuasaSyawal);
        Button btnNiatPuasaQadha = findViewById(R.id.btnNiatPuasaQadha);
        Button btnNiatPuasaAsyura = findViewById(R.id.btnNiatPuasaAsyura);
        Button btnNiatPuasaNazar = findViewById(R.id.btnNiatPuasaNazar);

        btnNiatPuasaRamadhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNiat.setText("نَوَيْتُ صَوْمَ غَدٍ عَن أَدَاءِ فَرْضِ شَهْرِ رَمَضَانَ هَذِهِ السَّنَةِ لِلَّهِ تَعَالَى");
                Latin.setText("Nawaitu shauma ghadin 'an adā'i fardhi syahri Ramadhāna hādzihis sanati lillāhi ta'ālā.");
                Arti.setText("Artinya: Saya berniat puasa esok hari untuk menunaikan kewajiban puasa selama bulan Ramadan tahun ini karena Allah Yang Maha Tinggi.");

            }
        });

        btnNiatPuasaSunnah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNiat.setText("نَوَيْتُ صَوْمَ غَدٍ عَن أَدَاءِ سُنَّةِ لِلَّهِ تَعَالَى");
                Latin.setText("Nawaitu sauma yaumal itsnaini sunnatan lillahi tana'ala.");
                Arti.setText("Artinya: Aku berniat puasa sunah hari Kamis karena Allah ta'âlâ.");

            }
        });

        btnNiatPuasaSenin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNiat.setText("نَوَيْتُ صَوْمَ يَوْمِ الِاثْنَيْنِ لِلّٰهِ تَعَالَى");
                Latin.setText("Nawaitu shauma hâdzal yaumi 'an adâ'i sunnati yaumil itsnaini lillâhi ta'âlâ.");
                Arti.setText("Artinya: Aku berniat puasa sunah hari Senin karena Allah ta'âlâ");

            }
        });

        btnNiatPuasaKamis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNiat.setText("نَوَيْتُ صَوْمَ غَدٍ فِي يَوْمِ الْحَمِيْسِ سُنَّةً لِلّٰهِ تَعَالَى");
                Latin.setText("Nawaitu shauma yaumil khamîsi lillâhi ta'âlâ. ");
                Arti.setText(" Artinya: Aku berniat puasa sunah hari Kamis karena Allah ta'âlâ.");


            }
        });

        btnNiatPuasaSyawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNiat.setText("نَوَيْتُ صَوْمَ غَدٍ عَنْ أَدَاءِ سُنَّةِ الشَّوَّالِ لِلهِ تَعَالَى");
                Latin.setText("Nawaitu shauma hâdzal yaumi 'an adâ'i sunnatis Syawwâli lillâhi ta'âlâ.");
                Arti.setText(" Artinya:Aku berniat puasa sunah Syawal hari ini karena Allah swt.");


            }
        });

        btnNiatPuasaQadha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNiat.setText("نَوَيْتُ صَوْمَ غَدٍ عَنْ قَضَاءِ فَرْضِ شَهْرِ رَمَضَانَ لِلهِ تَعَالَى");
                Latin.setText("Nawaitu soumaghadin 'an qadha'i fardhi syahri Ramadhana lillahi ta'ala.");
                Arti.setText(" Artinya:Aku berniat puasa sunah Syawal hari ini karena Allah swt.");



            }
        });

        btnNiatPuasaAsyura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNiat.setText("نَوَيْتُ صَوْمَ هَذَا اليَوْمِ عَنْ أَدَاءِ سُنَّةِ التَا سُوعَاء أو عَا شُورَاء لِلهِ تَعَالَى");
                Latin.setText("Nawaitu shauma ghadin 'an ada'i sunnati asyura lillahi ta'ala.");
                Arti.setText("  Artinya: “Saya niat puasa sunnah Asyura karena Allah SWT.");


            }
        });

        btnNiatPuasaNazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNiat.setText("نَوَيْتُ صَوْمَ النَّذَرِ لِلّٰهِ تَعَالىَ");
                Latin.setText("Nawaitu shaumannadzri lillâhi ta'âlâ.");
                Arti.setText(" Artinya: Saya berniat puasa nazar karena Allah ta'âlâ.");



            }
        });
    }
}