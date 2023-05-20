package com.example.myapplicationdulcor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLoginIngresar;
    EditText edtLoginEmail;
    EditText edtLoginPass;
    private static int count = 0;

    @SuppressLint(&quot;MissingInflatedId&quot;)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginIngresar = findViewById(R.id.btnLoginIngresar);

        edtLoginEmail = findViewById(R.id.edtLoginEmail);
        edtLoginPass = findViewById(R.id.edtLoginPass);

        btnLoginIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValidarDatos(edtLoginEmail.getText().toString(),
                        edtLoginPass.getText().toString());
            }
        });
    }
    private void ValidarDatos(String mail, String password)
    {
        if(mail.equals(&quot;jose@gmail.com&quot;) &amp;&amp; password.equals(&quot;1234&quot;))
        {
            Toast.makeText(this, &quot;Ingreso Correcto&quot;,
            Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, HomeActivity.class);
            count = 0;
            startActivity(intent);
        }else{
        count++;
        Toast.makeText(this, &quot;Datos no Validos&quot;,
        Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        if(count &lt;= 2) return;
        {
            Toast.makeText(this, &quot;Supero los intentos posibles&quot;,
            Toast.LENGTH_SHORT).show();
            count = 0;
        }
    }
    }
}

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              xmlns:app="http://schemas.android.com/apk/res-auto"
              xmlns:tools="http://schemas.android.com/tools"
              android:orientation="vertical"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              tools:context=".MainActivity">

<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="  Bienvenidos!!!"
        android:textAlignment="gravity"
        android:textAllCaps="true"
        android:textAppearance="@style/TextAppearance.AppCompat.Display3" />

<ImageView
        android:id="@+id/foto"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:adjustViewBounds="true"
        android:src="@drawable/dulcor" />

<TextView
        android:id="@+id/textView2"
        android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Ingrese su Email"
                android:textAppearance="@style/TextAppearance.AppCompat.Display2" />

<EditText
        android:id="@+id/edtLoginEmail"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:text="Jose@gmail.com"
                android:textAppearance="@style/TextAppearance.AppCompat.Display2" />

<TextView
        android:id="@+id/textView7"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Contraseña"
                android:textAppearance="@style/TextAppearance.AppCompat.Display2" />

<EditText
        android:id="@+id/edtLoginPass"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:inputType="textPersonName"
                android:text="1234"
                android:textAppearance="@style/TextAppearance.AppCompat.Display2" />

<Button
            android:id="@+id/btnLoginIngresar"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Ingresar"
                    android:textAppearance="@style/TextAppearance.AppCompat.Display3" />

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">
