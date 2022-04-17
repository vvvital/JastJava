package com.example.jastjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void quantityIncrement(View view){
        quantity=quantity+1;
        display(quantity);
    }

    public void quantityDecrement(View view){
        if (quantity>1) {
            quantity=quantity-1;
        }
        display(quantity);
    }

    public void submitOrder(View view) {
        displayPrice(quantity*30);
    }

    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int price){
        TextView priceTextView = findViewById(R.id.price_value);
        Locale localeUA = new Locale("uk", "UA");
        priceTextView.setText(NumberFormat.getCurrencyInstance(localeUA).format(price));
    }
}