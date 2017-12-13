package filipe.rehder.presentation.list.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import filipe.rehder.detail.R
import filipe.rehder.domain.list.model.MovieList
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * Created by Filipe on 12/12/2017.
 */
class ListAdapter(private val movieList: List<MovieList>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = movieList[position]

        holder.movieTitle.text = item.name
    }

    override fun getItemCount(): Int {
        Log.i("moviesListSize", movieList.size.toString())
        return movieList.size
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val movieTitle = view.movieTitle
    }

}