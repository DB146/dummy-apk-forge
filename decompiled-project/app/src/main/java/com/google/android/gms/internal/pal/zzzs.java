package com.google.android.gms.internal.pal;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzzs {
    public static zzyy zza(zzabc zzabcVar) {
        boolean z8;
        try {
            try {
                zzabcVar.zzl();
                try {
                    return (zzyy) zzaba.zzV.zza(zzabcVar);
                } catch (EOFException e2) {
                    e = e2;
                    z8 = false;
                    if (z8) {
                        return zzza.zza;
                    }
                    throw new zzze(e);
                }
            } catch (EOFException e10) {
                e = e10;
                z8 = true;
            }
        } catch (zzabf e11) {
            throw new zzze(e11);
        } catch (IOException e12) {
            throw new zzyz(e12);
        } catch (NumberFormatException e13) {
            throw new zzze(e13);
        }
    }
}
