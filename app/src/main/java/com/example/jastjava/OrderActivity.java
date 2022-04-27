package com.example.jastjava;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle argument = getIntent().getExtras();
        int quantity = argument.getInt("quantity");
        int price = argument.getInt("price");
        setContentView(R.layout.your_order);
        TextView textView = findViewById(R.id.textView8);
        textView.setText(Integer.toString(quantity));
        TextView textOrderPrice = findViewById(R.id.order_price_view);
        textOrderPrice.setText("To Pay " + Integer.toString(quantity * price) + " uah");
    }

    public void destroy(View view) {
        finish();

    }

}
