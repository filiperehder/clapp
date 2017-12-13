package filipe.rehder.detail.presentation.list.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import filipe.rehder.list.domain.model.MovieItem
import filipe.rehder.movies.R
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * Created by Filipe on 12/12/2017.
 */
class MovieListAdapter(private val movieList: MutableList<MovieItem>) : RecyclerView.Adapter<MovieListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = movieList[position]
        holder.movieTitle.text = item.movieTitle
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val movieTitle = view.movieTitle
    }

}