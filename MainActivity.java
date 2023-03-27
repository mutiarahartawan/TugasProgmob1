package com.example.aplikasi1progmob;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.aplikasi1progmob.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    private AppBarConfiguration appBarConfiguration;
//    private ActivityMainBinding binding;

    Button buttonTambah, buttonKurang, buttonKali, buttonBagi;
    EditText editTextA1, editTextA2;
    TextView textView;
    int ang1, ang2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        buttonTambah = findViewById(R.id.btn_add);
        buttonKurang = findViewById(R.id.btn_sub);
        buttonKali = findViewById(R.id.btn_mul);
        buttonBagi = findViewById(R.id.btn_div);

        editTextA1 = findViewById(R.id.number1);
        editTextA2 = findViewById(R.id.number2);

        textView = findViewById(R.id.jawaban);

        buttonTambah.setOnClickListener(this);
        buttonKurang.setOnClickListener(this);
        buttonKali.setOnClickListener(this);
        buttonBagi.setOnClickListener(this);
    }

    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText(this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
            return 0;
        }else
            return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View view){
        ang1 = getIntFromEditText(editTextA1);
        ang2 = getIntFromEditText(editTextA2);
        switch (view.getId()){
            case R.id.btn_add:
                textView.setText("Jawaban = " + (ang1 + ang2));
                break;
            case R.id.btn_sub:
                textView.setText("Jawaban = " + (ang1 - ang2));
                break;
            case R.id.btn_mul:
                textView.setText("Jawaban = " + (ang1 * ang2));
                break;
            case R.id.btn_div:
                textView.setText("Jawaban = " + ((float)ang1 / (float)ang2));
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}







//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }



//        setSupportActionBar(binding.toolbar);
//
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });