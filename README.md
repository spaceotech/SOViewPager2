[ViewPager2]

1. Add dependency for viewpager2 in gradle
    implementation "androidx.viewpager2:viewpager2:1.0.0-alpha01"
   
2. Add viewpager2 in xml

  <androidx.viewpager2.widget.ViewPager2
            android:id="@+id/viewPager2"
            android:layout_margin="10dp"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>
            
3. Create adapter using RecyclerView.Adapter<T>()

ex:
class ViewPager2Adapter(var detailList: List<DetailBean>) : RecyclerView.Adapter<PageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder =
        com.spaceo.viewpager2.adapter.PageViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_page,
                parent,
                false
            )
        )
    override fun getItemCount(): Int = detailList.size
    override fun onBindViewHolder(holder: PageViewHolder, position: Int) = holder.itemView.run {
        var mBean = detailList.get(position)
        holder.text.setText("${mBean.header}")
        holder.image.setImageResource(mBean.image)
        holder.textDiscription.setText(mBean.discription)
    }
}

class PageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image = itemView.image
    var text = itemView.tvTextHeader
    var textDiscription = itemView.tvTextDisc
}

4.  Assign Adapter to viewPager2 & assign orientation from activity

        //assign orientation to view holder
        viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL

        //assign HORIZONTAL orientation to view holder
        //viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        
        viewPager2.adapter = ViewPager2Adapter(getDetailListData())



