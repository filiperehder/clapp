package filipe.rehder.detail.presentation.list.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import filipe.rehder.list.domain.model.MovieItemEntity
import filipe.rehder.movies.R
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * Created by Filipe on 12/12/2017.
 */
class MovieListAdapter(val context: Context, private val movieListEntity: List<MovieItemEntity>) : RecyclerView.Adapter<MovieListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = movieListEntity[position]

        holder.movieTitle.text = item.title
        Picasso.with(context).load("https://image.tmdb.org/t/p/w500/" + item.imagePoster ).into(holder.imagePoster)
    }

    override fun getItemCount(): Int {
        return movieListEntity.size
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val movieTitle = view.movieTitle
        val imagePoster = view.imageView2
    }

}