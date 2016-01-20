package app.biking.provider.stations;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import app.biking.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code stations} table.
 */
public class StationsCursor extends AbstractCursor implements StationsModel {
    public StationsCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(StationsColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * latitud de la estacion
     * Can be {@code null}.
     */
    @Nullable
    public Double getLatitud() {
        Double res = getDoubleOrNull(StationsColumns.LATITUD);
        return res;
    }

    /**
     * Get the {@code longitud} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getLongitud() {
        Integer res = getIntegerOrNull(StationsColumns.LONGITUD);
        return res;
    }

    /**
     * Get the {@code nombrecalle} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getNombrecalle() {
        String res = getStringOrNull(StationsColumns.NOMBRECALLE);
        return res;
    }

    /**
     * Get the {@code numcalle} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getNumcalle() {
        Integer res = getIntegerOrNull(StationsColumns.NUMCALLE);
        return res;
    }

    /**
     * Get the {@code plazaslibres} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPlazaslibres() {
        Integer res = getIntegerOrNull(StationsColumns.PLAZASLIBRES);
        return res;
    }

    /**
     * Get the {@code maxplazas} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getMaxplazas() {
        Integer res = getIntegerOrNull(StationsColumns.MAXPLAZAS);
        return res;
    }
}
