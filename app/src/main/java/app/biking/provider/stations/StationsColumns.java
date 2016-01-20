package app.biking.provider.stations;

import android.net.Uri;
import android.provider.BaseColumns;

import app.biking.provider.Provider;
import app.biking.provider.stations.StationsColumns;

/**
 * A human being which is part of a team.
 */
public class StationsColumns implements BaseColumns {
    public static final String TABLE_NAME = "stations";
    public static final Uri CONTENT_URI = Uri.parse(Provider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    /**
     * latitud de la estacion
     */
    public static final String LATITUD = "latitud";

    public static final String LONGITUD = "longitud";

    public static final String NOMBRECALLE = "nombrecalle";

    public static final String NUMCALLE = "numcalle";

    public static final String PLAZASLIBRES = "plazaslibres";

    public static final String MAXPLAZAS = "maxplazas";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            LATITUD,
            LONGITUD,
            NOMBRECALLE,
            NUMCALLE,
            PLAZASLIBRES,
            MAXPLAZAS
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(LATITUD) || c.contains("." + LATITUD)) return true;
            if (c.equals(LONGITUD) || c.contains("." + LONGITUD)) return true;
            if (c.equals(NOMBRECALLE) || c.contains("." + NOMBRECALLE)) return true;
            if (c.equals(NUMCALLE) || c.contains("." + NUMCALLE)) return true;
            if (c.equals(PLAZASLIBRES) || c.contains("." + PLAZASLIBRES)) return true;
            if (c.equals(MAXPLAZAS) || c.contains("." + MAXPLAZAS)) return true;
        }
        return false;
    }

}
