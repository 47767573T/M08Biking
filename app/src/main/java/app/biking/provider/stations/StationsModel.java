package app.biking.provider.stations;

import app.biking.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * A human being which is part of a team.
 */
public interface StationsModel extends BaseModel {

    /**
     * latitud de la estacion
     * Can be {@code null}.
     */
    @Nullable
    Double getLatitud();

    /**
     * Get the {@code longitud} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getLongitud();

    /**
     * Get the {@code nombrecalle} value.
     * Can be {@code null}.
     */
    @Nullable
    String getNombrecalle();

    /**
     * Get the {@code numcalle} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getNumcalle();

    /**
     * Get the {@code plazaslibres} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getPlazaslibres();

    /**
     * Get the {@code maxplazas} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getMaxplazas();
}
