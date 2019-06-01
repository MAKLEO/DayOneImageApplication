package manish.khullar.dayoneimageapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Welcome_Activity extends AppCompatActivity {
    Button show_images,show_sliders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_);
        initialise();
        operation_on_welcome();
    }
    private void operation_on_welcome()
    {
        //go to images activity
        show_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent images=new Intent(Welcome_Activity.this,MainActivity.class);
                startActivity(images);
            }
        });

        //go to sliders activity
        show_sliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent images2=new Intent(Welcome_Activity.this,MainActivity.class);
            }
        });
    }
    private void initialise()
    {
        show_images=findViewById(R.id.show_images);
        show_sliders=findViewById(R.id.show_slider);
    }
}