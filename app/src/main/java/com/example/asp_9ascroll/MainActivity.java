package com.example.asp_9ascroll;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Obtenemos las referencias del tv
    TextView tv1;
    String pais ="";
    Boolean StarGame = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv1 = findViewById(R.id.tv1);

        if(StarGame){

        }else{
            iniciarJuego();
        }


    }
    public void seleccionarBoton(View v){
        ImageButton b = (ImageButton)v;

        if(b.getTag().toString().equals(pais)){
            Toast.makeText(this, "Has seleccionado la bandera correcta", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrecto esta bandera es de "+b.getTag(), Toast.LENGTH_SHORT).show();
        }
    }
    public void iniciarJuego(){
        // Logica para mostrar el texto
        int numero = (int)(Math.random()*6);


        switch (numero){
            case 0: pais = "Argelia"; break;
            case 1: pais = "Argentina"; break;
            case 2: pais = "Armenia"; break;
            case 3: pais = "Islas Feroe"; break;
            case 4: pais = "Islas Canarias"; break;
            case 5: pais = "Austria"; break;
        }

        tv1.setText("¿Cual es la bandera de "+ pais +"");

    }
}