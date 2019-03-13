package com.spaceo.viewpager2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.spaceo.viewpager2.R
import com.spaceo.viewpager2.bean.DetailBean
import kotlinx.android.synthetic.main.item_page.view.*


class ViewPager2Adapter(var detailList: List<DetailBean>) : RecyclerView.Adapter<PageViewHolder>() {
    //   Create View Holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder =
        com.spaceo.viewpager2.adapter.PageViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_page,
                parent,
                false
            )
        )

    //    giving detail list Size
    override fun getItemCount(): Int = detailList.size

    //    Binding view to holder
    override fun onBindViewHolder(holder: PageViewHolder, position: Int) = holder.itemView.run {

        var mBean = detailList.get(position)
        holder.text.setText("${mBean.header}")
        holder.image.setImageResource(mBean.image)
        holder.textDiscription.setText(mBean.discription)
    }
}

//set view holder
class PageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image = itemView.image
    var text = itemView.tvTextHeader
    var textDiscription = itemView.tvTextDisc
}
