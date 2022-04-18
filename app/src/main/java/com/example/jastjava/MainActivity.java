package com.example.jastjava;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int quantity = 1;
    int price = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(quantity);
        displayPrice(price);
    }

    public void quantityIncrement(View view) {
        quantity = quantity + 1;
        display(quantity);
        displayPrice(quantity * price);
    }

    public void quantityDecrement(View view) {
        if (quantity > 1) {
            quantity = quantity - 1;
        }
        display(quantity);
        displayPrice(quantity * price);
    }

    public void submitOrder(View view) {
        setContentView(R.layout.your_order);
        TextView textView = findViewById(R.id.textView8);
        textView.setText(Integer.toString(quantity));
        TextView textOrderPrice = findViewById(R.id.order_price_view);
        textOrderPrice.setText("To Pay " + Integer.toString(quantity * price) + " uah");

    }

    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int price) {
        TextView priceTextView = findViewById(R.id.price_value);
        Locale localeUA = new Locale("uk", "UA");
        priceTextView.setText(NumberFormat.getCurrencyInstance(localeUA).format(price));
    }

}