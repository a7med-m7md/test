package rec.com.ahmedmelsherbini.recye;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private ArrayList<String> video_name;
    private ArrayList<String> video_image;
    private ArrayList<String> video_link;
    Context context;
    WebViewC webViewC=new WebViewC();
    public Adapter(Context context,ArrayList<String> video_name,ArrayList<String> video_image ,ArrayList<String> video_link) {
        this.video_name = video_name;
        this.video_image = video_image;
        this.video_link = video_link;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.rec_model,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {


        Glide.with(context).load(video_image.get(i)).into(myViewHolder.imageView3);

        myViewHolder.textView.setText(video_name.get(i));
        myViewHolder.imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,WebViewC.class);
                intent.putExtra("Web",video_link.get(i));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return video_name.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.text_show);
            imageView3 = (ImageView)itemView.findViewById(R.id.imageView3);

        }
    }
}
