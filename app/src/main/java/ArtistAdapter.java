import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.fortemusicapp.R;
import com.example.android.fortemusicapp.artist;
import com.example.android.fortemusicapp.artistAdapter;

import java.util.ArrayList;

public class ArtistAdapter {
    private static final String LOG_TAG = artistAdapter.class.getSimpleName();

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param artists A List of word objects to display in a list
     */
    public artistAdapter(Activity context, ArrayList<artist> artists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, artists);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     * list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        artist currentArtist = getItem(position);

        //Find the artist title TextView id
        TextView artistTitleTextView = listItemView.findViewById(R.id.artist_title);

        //Set the text on the artist title TextView
        artistTitleTextView.setText(currentArtist.getartistTitle());

        // Find the TextView in the artist_list_item.xml layout with the artist text view
        TextView theArtistTextView = listItemView.findViewById(R.id.artist_name);
        //Set the text to the ArtistTextView
        theArtistTextView.setText(currentArtist.getArtistName());

        //Find the TextView in the artist_list_item.xml layout with the album artist cover image view
        ImageView artistCover = listItemView.findViewById(R.id.album_artist_cover);
        artistCover.setImageResource(currentArtist.getCoverArt());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
