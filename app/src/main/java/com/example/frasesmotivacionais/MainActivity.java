package com.example.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarFrase(View view) {

        TextView textFrases;

        textFrases = findViewById(R.id.textFrases);

        String[] frases = {
                "O único modo de fazer um excelente trabalho é amar o que você faz.",
                "Acredite em você mesmo e todo o resto se encaixará. Tenha fé em suas próprias habilidades.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Não importa a lentidão que você vá, contanto que você não pare.",
                "O que você consegue atingir é limitado apenas pelo que você acredita ser possível.",
                "Não tenha medo de desistir do bom para perseguir o ótimo.",
                "A chave para o sucesso é começar antes de estar pronto.",
                "O maior prazer na vida é fazer o que as pessoas dizem que você não é capaz de fazer.",
                "A jornada de mil milhas começa com um único passo.",
                "Quanto mais você se esforça, mais sorte você tem.",
                "Você é mais corajoso do que acredita, mais forte do que parece e mais inteligente do que pensa.",
                "O sucesso é caminhar de falha em falha sem perder o entusiasmo.",
                "Não espere por oportunidades. Crie-as.",
                "O otimismo é a fé em ação. Nada acontece sem ação.",
                "Nunca é tarde demais para ser o que você poderia ter sido.",
                "O sucesso não é a chave para a felicidade. A felicidade é a chave para o sucesso.",
                "A única maneira de fazer um ótimo trabalho é amar o que você faz.",
                "Sua única limitação é você mesmo.",
                "Não tenha medo de desistir do bom para perseguir o ótimo.",
                "A disciplina é a ponte entre metas e realizações.",
                "Seja tão bom que eles não podem te ignorar.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "Não importa o quão devagar você vá, desde que você não pare.",
                "Nada irá funcionar a menos que você faça.",
                "A persistência realiza o impossível."
        };

        int n = new Random().nextInt(frases.length);

        textFrases.setText(frases[n]);
    }
}