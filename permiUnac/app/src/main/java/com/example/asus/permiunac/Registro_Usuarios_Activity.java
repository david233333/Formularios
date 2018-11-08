package com.example.asus.permiunac;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Registro_Usuarios_Activity extends AppCompatActivity {

    @BindView(R.id.Nombre)
    EditText Nombre;
    @BindView(R.id.Apellidos)
    EditText Apellidos;
    @BindView(R.id.Correo_Electronico)
    EditText Correo_Electronico;
    @BindView(R.id.Contraseña)
    EditText Contraseña;
    @BindView(R.id.Crear)
    Button CrearUsuario;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);


    }

}

















































  /*  user.sendEmailVerification()
                                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if (task.isSuccessful()) {
                                                Toast.makeText(getApplicationContext(), "Coreeo de verificacion enviado a" + user.getEmail(), Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    });*/