package com.example.electricunicycle.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.electricunicycle.R
import com.example.electricunicycle.data.DataSource
import com.example.electricunicycle.model.EucModel
import com.example.electricunicycle.model.EucTypeEnum
import java.text.NumberFormat

class EucCardAdapter(
        private val context: Context,
        private val onClickListener: OnClickListener
): RecyclerView.Adapter<EucCardAdapter.EucCardViewHolder>() {

    private val data = DataSource.eucList

    class EucCardViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val ivItem: ImageView = view.findViewById(R.id.ivItem)
        val tvName: TextView = view.findViewById(R.id.tvName)
        val tvPrice: TextView = view.findViewById(R.id.tvPrice)
        val tvInstallmentAvailable: TextView = view.findViewById(R.id.tvInstallmentAvailable)
        val tvType: TextView = view.findViewById(R.id.tvType)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EucCardViewHolder {
        var adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return EucCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: EucCardViewHolder, position: Int) {

        val item = data[position]
        val convertPrice =  NumberFormat.getInstance().format(item.price)

        holder.ivItem.setImageResource(item.image)
        holder.tvName.text = item.name
        holder.tvPrice.text = context.resources?.getString(R.string.price_string, convertPrice.toString())
        if (item.installmentOption) {
            holder.tvInstallmentAvailable.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_toll_24, 0, 0, 0);
            holder.tvInstallmentAvailable.text = context.resources?.getString(R.string.installment_available)
        }
        else {
            holder.tvInstallmentAvailable.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_account_balance_wallet_24, 0, 0, 0);
            holder.tvInstallmentAvailable.text = context.resources?.getString(R.string.installment_unavailable)
        }
        when(item.type) {
            EucTypeEnum.ENTRY -> {
                holder.tvType.setBackgroundResource(R.drawable.type_background_entry)
                holder.tvType.text = context.resources?.getString(R.string.entry_level)
            }
            EucTypeEnum.HIGH -> {
                holder.tvType.setBackgroundResource(R.drawable.type_background)
                holder.tvType.text = context.resources?.getString(R.string.high_level)
            }
        }
        holder.tvType.setPadding(dpAsPixels(8), dpAsPixels(1), dpAsPixels(8), dpAsPixels(1))

        holder.itemView.setOnClickListener {
            onClickListener.onClick(item)
        }
    }

    class OnClickListener(val listener: (euc: EucModel) -> Unit) {
        fun onClick(euc: EucModel) = listener(euc)
    }

    private fun dpAsPixels(sizeInDp: Int): Int {
        val scale = context.resources?.displayMetrics?.density
        if (scale != null) {
            return  (sizeInDp * scale + 0.5f).toInt()
        }
        return sizeInDp
    }
}
