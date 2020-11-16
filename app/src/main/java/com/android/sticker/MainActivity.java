package com.android.sticker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.xiaopo.flying.sticker.StickerView;
import com.xiaopo.flying.sticker.TextSticker;

public class MainActivity extends AppCompatActivity {
    StickerView stickerView;
    EditText editText;
    TextSticker textSticker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);
Button button=findViewById(R.id.button);
//      Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT);
        stickerView = findViewById(R.id.stickerview);
        textSticker = new TextSticker(this);
//        String text = editText.getText().toString();
        textSticker.setText("hello");
        textSticker.resizeText();
        textSticker.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        stickerView.addSticker(textSticker);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String text = editText.getText().toString();
                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT);
                textSticker.setText(text);
            }
        });
//setText();
//    }
//  public void   setText()
//    {
//
//    }
    }

}