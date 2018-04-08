package app.mydemo.com.calculator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Regis on 07-04-2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolders> {
    Context context;
    private ArrayList<Product> products = new Product().createProductList();

    public RecyclerViewAdapter(Context context) {
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolders holder, final int position) {
        Log.v("product ","Count"+position);
        holder.productName.setText(products.get(position).getProductName());
        holder.productPrice.setText(String.valueOf(products.get(position).getProductPrice()));
        holder.productGst.setText(String.valueOf(products.get(position).getProductGst()));
        holder.total.setText(String.valueOf(products.get(position).getTotalCost()));
    }

    @Override
    public int getItemCount() {
       return products.size();

    }

    public static class ViewHolders extends RecyclerView.ViewHolder {
        TextView productName, productPrice, productGst, total;

        public ViewHolders(View view) {
            super(view);
            productName = view.findViewById(R.id.product_name);
            productGst = view.findViewById(R.id.product_gst);
            productPrice = view.findViewById(R.id.product_Price);
            total = view.findViewById(R.id.TotalCost);
        }
    }
}



