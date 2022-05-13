package com.example.calculadorafunciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView resultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado=findViewById(R.id.resultado);
        resultado.setText("");
    }

    public void sietee(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("0");
        }else{
            resultado.setText(resultado.getText() + "0");
        }
    }

    public void uno(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("1");
        }else{
            resultado.setText(resultado.getText() + "1");
        }
    }

    public void limpiar(View view) {
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        resultado.setText("0");
    }

    public void dividir(View view) {
        numero1 = Float.parseFloat(String.valueOf(resultado.getText()));

        operacion="/";
        resultado.setText("0");
    }
    public void OperacionMulti(View view) {
        numero1 = Float.parseFloat(String.valueOf(resultado.getText()));
        operacion = "*";
        resultado.setText("0");
    }

    public void OperacionMenos(View view) {
        numero1 = Float.parseFloat(String.valueOf(resultado.getText()));
        operacion = "-";
        resultado.setText("0");
    }

    public void OperacionMas(View view) {
        numero1 = Float.parseFloat(String.valueOf(resultado.getText()));
        operacion = "+";
        resultado.setText("0");
    }

    public void mostrar(View view) {
        numero2 = Float.parseFloat(String.valueOf(resultado.getText()));
        float result = 0.0f;
    if(operacion.equals("/")){
        if(numero2 != 0.0f){
            result = numero1 / numero2;
        }else{
            result = 0.0f;
            Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
        }
    }else if(operacion.equals("*")){
        result = numero1 * numero2;
    }else if(operacion.equals("-")){
        result = numero1 - numero2;
    }else if(operacion.equals("+")){
        result = numero1 + numero2;
    }

    resultado.setText(result + "");
    numero1 = 0.0f;
    numero2 = 0.0f;
    operacion = "";

    }

    public void dos(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("2");
        }else{
            resultado.setText(resultado.getText() + "2");
        }
    }

    public void tres(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("3");
        }else{
            resultado.setText(resultado.getText() + "3");
        }
    }

    public void cinco(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("5");
        }else{
            resultado.setText(resultado.getText() + "5");
        }
    }

    public void cuatro(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("4");
        }else{
            resultado.setText(resultado.getText() + "4");
        }
    }

    public void seis(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("6");
        }else{
        resultado.setText(resultado.getText() + "6");
        }
    }

    public void nueve(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("9");
        }else{
            resultado.setText(resultado.getText() + "9");
        }
    }

    public void ocho(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("8");
        }else{
            resultado.setText(resultado.getText() + "8");
        }
    }

    public void siet(View view) {
        float valor = Float.parseFloat(resultado.getText().toString());
        if(valor == 0.0f){
            resultado.setText("7");
        }else{
            resultado.setText(resultado.getText() + "7");
        }
    }
}