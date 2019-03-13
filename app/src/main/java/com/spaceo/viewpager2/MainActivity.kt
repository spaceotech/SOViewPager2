package com.spaceo.viewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.TypedArrayUtils.getString
import androidx.viewpager2.widget.ViewPager2
import com.spaceo.viewpager2.adapter.ViewPager2Adapter
import com.spaceo.viewpager2.bean.DetailBean
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        assign orientation to view holder
        viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL

//        assign HORIZONTAL orientation to view holder
//      viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

//        set adepter
        viewPager2.adapter = ViewPager2Adapter(getDetailListData())
    }

    private fun getDetailListData(): ArrayList<DetailBean> {

        var detailList: ArrayList<DetailBean> = arrayListOf<DetailBean>()
        detailList.add(DetailBean(R.drawable.image_one, "Title 1", getString(R.string.discription_1)))
        detailList.add(DetailBean(R.drawable.image_two, "Title 2", getString(R.string.discription_2)))
        detailList.add(DetailBean(R.drawable.image_three, "Title 3", getString(R.string.discription_3)))

        return detailList

    }

}
