package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzzf {
    public static zzwr zza(zzacv zzacvVar) {
        boolean z8;
        try {
            try {
                zzacvVar.zzt();
                z8 = false;
                try {
                    return (zzwr) zzaby.zzV.read(zzacvVar);
                } catch (EOFException e2) {
                    e = e2;
                    if (z8) {
                        return zzwt.zza;
                    }
                    throw new zzwz(e);
                }
            } catch (EOFException e10) {
                e = e10;
                z8 = true;
            }
        } catch (zzacy e11) {
            throw new zzwz(e11);
        } catch (IOException e12) {
            throw new zzws(e12);
        } catch (NumberFormatException e13) {
            throw new zzwz(e13);
        }
    }
}
