package com.example.totoandriparsingjson.network

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.example.totoandriparsingjson.R
import com.example.totoandriparsingjson.model.DataItem

class UserAdapter (private val users: MutableList<DataItem>) :
        RecyclerView.Adapter<UserAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.list_item_user,parent,false)
        return ListViewHolder(
                view
        )
    }

    fun addUser(newUser: DataItem){
        users.add(newUser)
        notifyItemInserted(users.lastIndex)
    }

    fun clear (){
        users.clear()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: UserAdapter.ListViewHolder, position: Int) {
        val user = users[position]

        Glide.with(holder.itemView.context)
                .load(user.Avatar)
                .apply(RequestOptions().override(80, 80).placeholder(R.drawable.icon_avatar))
                .transform(CircleCrop())
                .into(holder.ivAvatar)

        holder.tvUserName.text = "${user.FirstName}${user.LastName}"
        holder.tvEmail.text = user.Email
    }
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvUserName: TextView = itemView.findViewById(R.id.itemName)
        var tvEmail: TextView = itemView.findViewById(R.id.itemEmail)
        var ivAvatar: ImageView = itemView.findViewById(R.id.itemAvatar)
    }

}
