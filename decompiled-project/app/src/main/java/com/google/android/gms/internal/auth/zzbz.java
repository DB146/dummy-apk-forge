package com.google.android.gms.internal.auth;

import K5.c;
import android.util.Log;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public abstract class zzbz extends c {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            Log.e("AUTH", "Error serializing object.", e2);
            return null;
        }
    }
}
