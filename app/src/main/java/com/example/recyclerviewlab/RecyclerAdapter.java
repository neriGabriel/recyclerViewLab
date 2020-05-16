package com.example.recyclerviewlab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// EXTENDE DA MINHA CLASSE INTERNA
/*   ADAPTER   */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<String> stringList;

    /*   VIEWHOLDER - INNER CLASS    */
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        //AQUI INSTANCIO O ELEMENTO DO LAYOUT
        TextView textViewItem;

        //AQUI INICIO O ELEMENTO DO LAYOUT
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textViewItem = itemView.findViewById(android.R.id.text1);
        }
    }
    /* **************************** */


    //STARTO O ADAPTER COM A INFORMAÇÃO
    public RecyclerAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    //STARTO A VIEW DO VIEWHOLDER COM UM LAYOUT
    //AQUI SERIA ONDE SETO A VIEW QUE QUERO USAR PARA ESSE ADATPER
    //E NO ONBINDVIEWHOLDER TEREI ACESSO A TODOS OS ELEMENTOS DESSA VIEW
    //LEMBRANDO QUE ESTES ELEMENTOS DEVEM SER INICIADOS NA CLASSE INNER OU HOLDER
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                                      .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    //AQUI SETO OS VALORES DOS COMPONENTES STARTADAS COM O ONCREATEVIEWHOLDER
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.textViewItem.setText(this.stringList.get(position));
    }

    //PEGO A QUANTIDADE DE ITENS
    @Override
    public int getItemCount() {
        return this.stringList.size();
    }
}
