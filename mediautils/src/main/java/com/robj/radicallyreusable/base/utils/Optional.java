package com.robj.radicallyreusable.base.utils;

import java.util.NoSuchElementException;

import io.reactivex.annotations.Nullable;

/**
 * Created by Rob J on 01/91/12.
 */

public final class Optional<T> {

    private final T optional;

    Optional(@Nullable T optional) {
        this.optional = optional;
    }

    public final boolean isEmpty() {
        return this.optional == null;
    }

    public final T get() {
        if (optional == null)
            throw new NoSuchElementException("Item was null..");
        return optional;
    }
}
