package app.biking.provider.stations;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import app.biking.provider.base.AbstractSelection;

/**
 * Selection for the {@code stations} table.
 */
public class StationsSelection extends AbstractSelection<StationsSelection> {
    @Override
    protected Uri baseUri() {
        return StationsColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code StationsCursor} object, which is positioned before the first entry, or null.
     */
    public StationsCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new StationsCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public StationsCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code StationsCursor} object, which is positioned before the first entry, or null.
     */
    public StationsCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new StationsCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public StationsCursor query(Context context) {
        return query(context, null);
    }


    public StationsSelection id(long... value) {
        addEquals("stations." + StationsColumns._ID, toObjectArray(value));
        return this;
    }

    public StationsSelection idNot(long... value) {
        addNotEquals("stations." + StationsColumns._ID, toObjectArray(value));
        return this;
    }

    public StationsSelection orderById(boolean desc) {
        orderBy("stations." + StationsColumns._ID, desc);
        return this;
    }

    public StationsSelection orderById() {
        return orderById(false);
    }

    public StationsSelection latitud(Double... value) {
        addEquals(StationsColumns.LATITUD, value);
        return this;
    }

    public StationsSelection latitudNot(Double... value) {
        addNotEquals(StationsColumns.LATITUD, value);
        return this;
    }

    public StationsSelection latitudGt(double value) {
        addGreaterThan(StationsColumns.LATITUD, value);
        return this;
    }

    public StationsSelection latitudGtEq(double value) {
        addGreaterThanOrEquals(StationsColumns.LATITUD, value);
        return this;
    }

    public StationsSelection latitudLt(double value) {
        addLessThan(StationsColumns.LATITUD, value);
        return this;
    }

    public StationsSelection latitudLtEq(double value) {
        addLessThanOrEquals(StationsColumns.LATITUD, value);
        return this;
    }

    public StationsSelection orderByLatitud(boolean desc) {
        orderBy(StationsColumns.LATITUD, desc);
        return this;
    }

    public StationsSelection orderByLatitud() {
        orderBy(StationsColumns.LATITUD, false);
        return this;
    }

    public StationsSelection longitud(Integer... value) {
        addEquals(StationsColumns.LONGITUD, value);
        return this;
    }

    public StationsSelection longitudNot(Integer... value) {
        addNotEquals(StationsColumns.LONGITUD, value);
        return this;
    }

    public StationsSelection longitudGt(int value) {
        addGreaterThan(StationsColumns.LONGITUD, value);
        return this;
    }

    public StationsSelection longitudGtEq(int value) {
        addGreaterThanOrEquals(StationsColumns.LONGITUD, value);
        return this;
    }

    public StationsSelection longitudLt(int value) {
        addLessThan(StationsColumns.LONGITUD, value);
        return this;
    }

    public StationsSelection longitudLtEq(int value) {
        addLessThanOrEquals(StationsColumns.LONGITUD, value);
        return this;
    }

    public StationsSelection orderByLongitud(boolean desc) {
        orderBy(StationsColumns.LONGITUD, desc);
        return this;
    }

    public StationsSelection orderByLongitud() {
        orderBy(StationsColumns.LONGITUD, false);
        return this;
    }

    public StationsSelection nombrecalle(String... value) {
        addEquals(StationsColumns.NOMBRECALLE, value);
        return this;
    }

    public StationsSelection nombrecalleNot(String... value) {
        addNotEquals(StationsColumns.NOMBRECALLE, value);
        return this;
    }

    public StationsSelection nombrecalleLike(String... value) {
        addLike(StationsColumns.NOMBRECALLE, value);
        return this;
    }

    public StationsSelection nombrecalleContains(String... value) {
        addContains(StationsColumns.NOMBRECALLE, value);
        return this;
    }

    public StationsSelection nombrecalleStartsWith(String... value) {
        addStartsWith(StationsColumns.NOMBRECALLE, value);
        return this;
    }

    public StationsSelection nombrecalleEndsWith(String... value) {
        addEndsWith(StationsColumns.NOMBRECALLE, value);
        return this;
    }

    public StationsSelection orderByNombrecalle(boolean desc) {
        orderBy(StationsColumns.NOMBRECALLE, desc);
        return this;
    }

    public StationsSelection orderByNombrecalle() {
        orderBy(StationsColumns.NOMBRECALLE, false);
        return this;
    }

    public StationsSelection numcalle(Integer... value) {
        addEquals(StationsColumns.NUMCALLE, value);
        return this;
    }

    public StationsSelection numcalleNot(Integer... value) {
        addNotEquals(StationsColumns.NUMCALLE, value);
        return this;
    }

    public StationsSelection numcalleGt(int value) {
        addGreaterThan(StationsColumns.NUMCALLE, value);
        return this;
    }

    public StationsSelection numcalleGtEq(int value) {
        addGreaterThanOrEquals(StationsColumns.NUMCALLE, value);
        return this;
    }

    public StationsSelection numcalleLt(int value) {
        addLessThan(StationsColumns.NUMCALLE, value);
        return this;
    }

    public StationsSelection numcalleLtEq(int value) {
        addLessThanOrEquals(StationsColumns.NUMCALLE, value);
        return this;
    }

    public StationsSelection orderByNumcalle(boolean desc) {
        orderBy(StationsColumns.NUMCALLE, desc);
        return this;
    }

    public StationsSelection orderByNumcalle() {
        orderBy(StationsColumns.NUMCALLE, false);
        return this;
    }

    public StationsSelection plazaslibres(Integer... value) {
        addEquals(StationsColumns.PLAZASLIBRES, value);
        return this;
    }

    public StationsSelection plazaslibresNot(Integer... value) {
        addNotEquals(StationsColumns.PLAZASLIBRES, value);
        return this;
    }

    public StationsSelection plazaslibresGt(int value) {
        addGreaterThan(StationsColumns.PLAZASLIBRES, value);
        return this;
    }

    public StationsSelection plazaslibresGtEq(int value) {
        addGreaterThanOrEquals(StationsColumns.PLAZASLIBRES, value);
        return this;
    }

    public StationsSelection plazaslibresLt(int value) {
        addLessThan(StationsColumns.PLAZASLIBRES, value);
        return this;
    }

    public StationsSelection plazaslibresLtEq(int value) {
        addLessThanOrEquals(StationsColumns.PLAZASLIBRES, value);
        return this;
    }

    public StationsSelection orderByPlazaslibres(boolean desc) {
        orderBy(StationsColumns.PLAZASLIBRES, desc);
        return this;
    }

    public StationsSelection orderByPlazaslibres() {
        orderBy(StationsColumns.PLAZASLIBRES, false);
        return this;
    }

    public StationsSelection maxplazas(Integer... value) {
        addEquals(StationsColumns.MAXPLAZAS, value);
        return this;
    }

    public StationsSelection maxplazasNot(Integer... value) {
        addNotEquals(StationsColumns.MAXPLAZAS, value);
        return this;
    }

    public StationsSelection maxplazasGt(int value) {
        addGreaterThan(StationsColumns.MAXPLAZAS, value);
        return this;
    }

    public StationsSelection maxplazasGtEq(int value) {
        addGreaterThanOrEquals(StationsColumns.MAXPLAZAS, value);
        return this;
    }

    public StationsSelection maxplazasLt(int value) {
        addLessThan(StationsColumns.MAXPLAZAS, value);
        return this;
    }

    public StationsSelection maxplazasLtEq(int value) {
        addLessThanOrEquals(StationsColumns.MAXPLAZAS, value);
        return this;
    }

    public StationsSelection orderByMaxplazas(boolean desc) {
        orderBy(StationsColumns.MAXPLAZAS, desc);
        return this;
    }

    public StationsSelection orderByMaxplazas() {
        orderBy(StationsColumns.MAXPLAZAS, false);
        return this;
    }
}
