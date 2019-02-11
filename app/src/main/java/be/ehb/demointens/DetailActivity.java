package be.ehb.demointens;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import be.ehb.demointens.model.Persoon;

public class DetailActivity extends AppCompatActivity {

    private TextView tvNaam;
    private Button btnCall, btnHomepage;
    private Persoon geseleteerdPersoon;

    private View.OnClickListener homepageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri page = Uri.parse(geseleteerdPersoon.getHomepage());
            intent.setData(page);
            startActivity(intent);
        }


    };
    private  View.OnClickListener callListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            Uri tel = Uri.parse(geseleteerdPersoon.getTel());
            intent.setData(tel);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNaam = findViewById(R.id.tv_naam);
        btnCall = findViewById(R.id.btn_call);
        btnHomepage = findViewById(R.id.btn_homepage);

        //persoon uit intent halen
        geseleteerdPersoon = (Persoon) getIntent().getSerializableExtra("persoon");
        //waarden gebruiken
        tvNaam.setText(geseleteerdPersoon.getNaam());
        //Listener aan knop hangen
        btnHomepage.setOnClickListener(homepageListener);
        btnCall.setOnClickListener(callListener);
    }
}
