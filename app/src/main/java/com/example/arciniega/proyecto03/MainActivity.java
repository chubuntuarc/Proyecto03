package com.example.arciniega.proyecto03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Declaración de variables
    private Alumno alumno;
    private EditText matricula;
    private EditText nombre;
    private EditText aPaterno;
    private EditText aMaterno;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Estos métodos van primero
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asignación de variables
        matricula = (EditText)findViewById(R.id.editMatricula);
        nombre = (EditText)findViewById(R.id.editNombre);
        aPaterno = (EditText)findViewById(R.id.editPaterno);
        aMaterno = (EditText)findViewById(R.id.editMaterno);

        btnAceptar = (Button)findViewById(R.id.btnAceptar);

        // Programación del "Receptor (Listener)" para el evento onClick del botón
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            // Esto se puede generar solo con el comando Alt + Enter sobre el texto OnClickListener
            @Override
            public void onClick(View v) {

                // Instalncia de la clase alumno.
                alumno = new Alumno();

                // Asignacion de los valores a los elementos de la clase alumno
                alumno.setMatricula(matricula.getText().toString());  // Cada elemento debe ser convertido a String debido al casting,
                alumno.setNombre(nombre.getText().toString());          // ya que el elemento en la clase aumno corresponde a un String
                alumno.setaPaterno(aPaterno.getText().toString());
                alumno.setaMaterno(aMaterno.getText().toString());
            }
        });
    }
}
