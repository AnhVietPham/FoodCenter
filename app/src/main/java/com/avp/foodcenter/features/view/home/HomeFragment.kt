package com.avp.foodcenter.features.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.avp.foodcenter.R
import com.avp.foodcenter.features.view.home.adapter.HomeAdapter
import com.avp.foodcenter.features.view.home.model.ItemHomeModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private var mHomeAdapter: HomeAdapter? = null
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewManager = LinearLayoutManager(context)
        initView()
    }

    private fun initView(){
        val itemHomeModels = listOf(
            ItemHomeModel(
                image = "https://abcxyz.com",
                title = "Món ngon mỗi ngày",
                description = "Món ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngày"
            ),
            ItemHomeModel(
                image = "https://abcxyz.com",
                title = "Món ngon mỗi ngày",
                description = "Món ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngày"
            ),
            ItemHomeModel(
                image = "https://abcxyz.com",
                title = "Món ngon mỗi ngày",
                description = "Món ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngày"
            ),
            ItemHomeModel(
                image = "https://abcxyz.com",
                title = "Món ngon mỗi ngày",
                description = "Món ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngày"
            ),
            ItemHomeModel(
                image = "https://abcxyz.com",
                title = "Món ngon mỗi ngày",
                description = "Món ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngày"
            ),
            ItemHomeModel(
                image = "https://abcxyz.com",
                title = "Món ngon mỗi ngày",
                description = "Món ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngày"
            ),
            ItemHomeModel(
                image = "https://abcxyz.com",
                title = "Món ngon mỗi ngày",
                description = "Món ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngàyMón ngon mỗi ngày"
            )
        )
        mHomeAdapter = HomeAdapter(homeModels = itemHomeModels)
        rvHome.layoutManager = viewManager
        mHomeAdapter?.notifyDataSetChanged()
        rvHome.adapter = mHomeAdapter

    }

}
