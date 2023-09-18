package il.com.noa.toys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ToyAdapter extends RecyclerView.Adapter<ToyAdapter.ToyHolder>
{
    private Context context;
    private Toys toys;
    private int single_toy_layout;


    @NonNull
    @Override
    public ToyAdapter.ToyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new ToyHolder(LayoutInflater.from(context).inflate(single_toy_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ToyAdapter.ToyHolder holder, int position)
    {
        Toy toy = toys.get(position);
        if(toy != null)
        {
            holder.txtName = toy.getName();
            holder.txtPrice = String.valueOf(toy.getPrice());
        }
    }

    @Override
    public int getItemCount()
    {
        return (toys != null) ? toys.size(): 0 ;
    }

    public void setToys(Toys toys)
    {
        this.toys = toys;
        notifyDataSetChanged();
    }

    public static class ToyHolder extends RecyclerView.ViewHolder
    {
        public String txtName;
        public String txtPrice;

        public ToyHolder(@Nonnull View itemView)
        {
            super(itemView);

            txtName = String.valueOf(itemView.findViewById(R.id.txtName));
            txtPrice  = String.valueOf(itemView.findViewById(R.id.txtPrice));
        }
    }



}
