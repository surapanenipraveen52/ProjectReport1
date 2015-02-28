package kdmprj.umkc.edu.kdmpr1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by venkatareddy on 2/27/2015.
 */
public class SearchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchactivity);
        final EditText et=(EditText)findViewById(R.id.editText);
//        final TextView textView=(TextView)findViewById(R.id.textView);

        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView.setText(et.getText().toString() +" Efficetiveness : 60 % ");
            }
        });
    }
}
