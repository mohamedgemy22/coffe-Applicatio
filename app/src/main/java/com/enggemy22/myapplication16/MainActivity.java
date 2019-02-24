package com.enggemy22.myapplication16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static java.text.NumberFormat.*;

public class MainActivity extends AppCompatActivity {
    public int numberOfCoffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {

       String  fatma="Thank you sir your order is ready"+" ";
      String mohamed ="price order is:"+(numberOfCoffee*5)+"$";
        message(fatma);
        message2(mohamed);

    }

    public void increment (View view) {
        numberOfCoffee += 1;
        displayQuantati(numberOfCoffee);
//increment(number_of_coffe);
    }

    public void decrement(View view) {
        if(numberOfCoffee>0)
            numberOfCoffee -= 1;
        else
            return;
            displayQuantati(numberOfCoffee);


//decrement(number_of_coffe);
    }

    private void displayQuantati(int number)
    {
        TextView text=(TextView)findViewById(R.id.quantaty);
        text.setText(" "+number);
    }
    private void price(int number)
    {
        TextView text2=(TextView)findViewById(R.id.priceText);
        text2.setText(getCurrencyInstance().format(number));
    }
    private void message(String fatma)
    {
        TextView text3=(TextView)findViewById(R.id.priceText);

        text3.setText(fatma);
    }
    private void message2(String mohamed)
    {
        TextView text2 =(TextView)findViewById(R.id.priceText2);
        text2.setText(mohamed);
    }




}
