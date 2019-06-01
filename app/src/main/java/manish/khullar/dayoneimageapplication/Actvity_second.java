package manish.khullar.dayoneimageapplication;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Actvity_second extends AppCompatActivity {
int index=0;
int[] images= new int[]{R.drawable.image_one,R.drawable.image_two,R.drawable.image_three,R.drawable.image_four};
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actvity_second);

    }

    public void slide(View view) {
        //define the image view slide
        imageView =findViewById(R.id.image_slider);

        //change the Image when buton click
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_animation);
        imageView.startAnimation(animation);
        imageView.setImageResource(images[index]);
        index++;

        //reset the index to zero
        if(index==images.length)
        {
            index = 0;
        }
    }
}
