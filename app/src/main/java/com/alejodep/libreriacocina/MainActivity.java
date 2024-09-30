package com.alejodep.libreriacocina;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextIngredients;
    private EditText editTextRecipeName;
    private EditText editTextRecipeTime;
    private LinearLayout linearLayoutIngredients;
    private Button buttonAddIngredient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialización de los views
        editTextIngredients = findViewById(R.id.editTextIngredients);
        editTextRecipeName = findViewById(R.id.editTextRecipeName);
        editTextRecipeTime = findViewById(R.id.editTextRecipeTime);
        linearLayoutIngredients = findViewById(R.id.LayoutIngredients);
        buttonAddIngredient = findViewById(R.id.buttonAddIngredient);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Evento para el botón Agregar Ingrediente
        buttonAddIngredient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ingredient = editTextIngredients.getText().toString();
                if (!ingredient.isEmpty()) {
                    addIngredientToList(ingredient);
                    editTextIngredients.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, ingresa un ingrediente", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void addIngredientToList(String ingredient) {
        TextView textView = new TextView(this);
        textView.setText(ingredient);
        linearLayoutIngredients.addView(textView);
    }


}