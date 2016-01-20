package app.biking.provider.stations;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import app.biking.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code stations} table.
 */
public class StationsContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return StationsColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable StationsSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable StationsSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * latitud de la estacion
     */
    public StationsContentValues putLatitud(@Nullable Double value) {
        mContentValues.put(StationsColumns.LATITUD, value);
        return this;
    }

    public StationsContentValues putLatitudNull() {
        mContentValues.putNull(StationsColumns.LATITUD);
        return this;
    }

    public StationsContentValues putLongitud(@Nullable Integer value) {
        mContentValues.put(StationsColumns.LONGITUD, value);
        return this;
    }

    public StationsContentValues putLongitudNull() {
        mContentValues.putNull(StationsColumns.LONGITUD);
        return this;
    }

    public StationsContentValues putNombrecalle(@Nullable String value) {
        mContentValues.put(StationsColumns.NOMBRECALLE, value);
        return this;
    }

    public StationsContentValues putNombrecalleNull() {
        mContentValues.putNull(StationsColumns.NOMBRECALLE);
        return this;
    }

    public StationsContentValues putNumcalle(@Nullable Integer value) {
        mContentValues.put(StationsColumns.NUMCALLE, value);
        return this;
    }

    public StationsContentValues putNumcalleNull() {
        mContentValues.putNull(StationsColumns.NUMCALLE);
        return this;
    }

    public StationsContentValues putPlazaslibres(@Nullable Integer value) {
        mContentValues.put(StationsColumns.PLAZASLIBRES, value);
        return this;
    }

    public StationsContentValues putPlazaslibresNull() {
        mContentValues.putNull(StationsColumns.PLAZASLIBRES);
        return this;
    }

    public StationsContentValues putMaxplazas(@Nullable Integer value) {
        mContentValues.put(StationsColumns.MAXPLAZAS, value);
        return this;
    }

    public StationsContentValues putMaxplazasNull() {
        mContentValues.putNull(StationsColumns.MAXPLAZAS);
        return this;
    }
}
