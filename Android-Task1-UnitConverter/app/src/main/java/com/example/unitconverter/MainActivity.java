package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editValue;
    Spinner spinnerCategory, spinnerFrom, spinnerTo;
    Button btnConvert;
    TextView txtResult;

    String[] categories = {"Length", "Weight", "Volume"};

    String[] lengthUnits = {"Centimetre", "Metre", "Kilometre"};
    String[] weightUnits = {"Gram", "Kilogram", "Pound"};
    String[] volumeUnits = {"Millilitre", "Litre", "Cubic Metre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top,
                    systemBars.right, systemBars.bottom);
            return insets;
        });

        // Connect widgets
        editValue = findViewById(R.id.editValue);
        spinnerCategory = findViewById(R.id.spinnerCategory);
        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        btnConvert = findViewById(R.id.btnConvert);
        txtResult = findViewById(R.id.txtResult);

        // Load category spinner
        ArrayAdapter<String> categoryAdapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_spinner_item,
                        categories);

        categoryAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        spinnerCategory.setAdapter(categoryAdapter);

        // Load units for selected category
        spinnerCategory.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent,
                                               View view,
                                               int position,
                                               long id) {

                        switch (position) {
                            case 0:
                                loadUnits(lengthUnits);
                                break;

                            case 1:
                                loadUnits(weightUnits);
                                break;

                            case 2:
                                loadUnits(volumeUnits);
                                break;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

        btnConvert.setOnClickListener(v -> {

            String input = editValue.getText().toString().trim();

            if (input.isEmpty()) {
                Toast.makeText(MainActivity.this,
                        "Please enter a value",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            double value;

            try {
                value = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                Toast.makeText(MainActivity.this,
                        "Invalid number",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            String from = spinnerFrom.getSelectedItem().toString();
            String to = spinnerTo.getSelectedItem().toString();
            int categoryIndex = spinnerCategory.getSelectedItemPosition();

            double result = convert(categoryIndex, from, to, value);
            txtResult.setText(String.format("%.2f %s = %.2f %s", value, from, result, to));

        });

    }

    private double convert(int categoryIndex, String from, String to, double value) {
        if (from.equals(to)) return value;

        switch (categoryIndex) {
            case 0: // Length
                return convertLength(from, to, value);
            case 1: // Weight
                return convertWeight(from, to, value);
            case 2: // Volume
                return convertVolume(from, to, value);
            default:
                return value;
        }
    }

    private double convertLength(String from, String to, double value) {
        // Convert to Metre first
        double meters = 0;
        switch (from) {
            case "Centimetre": meters = value / 100.0; break;
            case "Metre": meters = value; break;
            case "Kilometre": meters = value * 1000.0; break;
        }

        // Convert from Metre to target
        switch (to) {
            case "Centimetre": return meters * 100.0;
            case "Metre": return meters;
            case "Kilometre": return meters / 1000.0;
            default: return value;
        }
    }

    private double convertWeight(String from, String to, double value) {
        // Convert to Gram first
        double grams = 0;
        switch (from) {
            case "Gram": grams = value; break;
            case "Kilogram": grams = value * 1000.0; break;
            case "Pound": grams = value * 453.592; break;
        }

        // Convert from Gram to target
        switch (to) {
            case "Gram": return grams;
            case "Kilogram": return grams / 1000.0;
            case "Pound": return grams / 453.592;
            default: return value;
        }
    }

    private double convertVolume(String from, String to, double value) {
        // Convert to Litre first
        double litres = 0;
        switch (from) {
            case "Millilitre": litres = value / 1000.0; break;
            case "Litre": litres = value; break;
            case "Cubic Metre": litres = value * 1000.0; break;
        }

        // Convert from Litre to target
        switch (to) {
            case "Millilitre": return litres * 1000.0;
            case "Litre": return litres;
            case "Cubic Metre": return litres / 1000.0;
            default: return value;
        }
    }

    private void loadUnits(String[] units) {

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_spinner_item,
                        units);

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);
    }
}