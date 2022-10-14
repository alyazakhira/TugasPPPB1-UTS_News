package com.example.projectnewsutsrev10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class InputDataActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText iDateEdit;
    EditText iCatEdit;
    Spinner iCatSpinner;
    Button iSubmitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

//        assign layout variable
        iDateEdit = findViewById(R.id.input_edit_date);
        iCatEdit = findViewById(R.id.input_edit_category);
        iCatSpinner = findViewById(R.id.input_spinner_category);
        iSubmitBtn = findViewById(R.id.input_data_btn);

//        set listener on date edit
        iDateEdit.setOnClickListener(view -> showDatePicker());

//        array adapter on spinner
        ArrayAdapter<CharSequence> categoryAdapter = ArrayAdapter.createFromResource(
                this,R.array.category_array, android.R.layout.simple_spinner_item);
        iCatSpinner.setAdapter(categoryAdapter);
        iCatSpinner.setOnItemSelectedListener(this);

//        set listener on button
        iSubmitBtn.setOnClickListener(view -> {
            Intent newsIntent = new Intent(InputDataActivity.this, NewsListActivity.class);

//                get age
            String date_string = iDateEdit.getText().toString();
            String year_string = date_string.substring(date_string.length()-4);

//                get category
            String category = iCatEdit.getText().toString();

//                intent
            newsIntent.putExtra("YEAR",year_string);
            newsIntent.putExtra("CATEGORY",category);
            startActivity(newsIntent);
        });
    }

    public void showDatePicker(){
        DialogFragment dateFragment = new DateFrag();
        dateFragment.show(getSupportFragmentManager(),"date-picker");
    }

    public void processDateResult(int day, int month, int year) {
        String day_string = Integer.toString(day);
        String month_string = Integer.toString(month+1);
        String year_string = Integer.toString(year);

        String dateText = day_string + "/" + month_string + "/" + year_string;
        iDateEdit = findViewById(R.id.input_edit_date);
        iDateEdit.setText(dateText);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String category = adapterView.getItemAtPosition(i).toString();
        iCatEdit = findViewById(R.id.input_edit_category);
        iCatEdit.setText(category);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        String category = adapterView.getItemAtPosition(0).toString();
        iCatEdit = findViewById(R.id.input_edit_category);
        iCatEdit.setText(category);
    }
}