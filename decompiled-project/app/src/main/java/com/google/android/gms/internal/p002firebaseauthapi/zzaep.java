package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class zzaep {
    private zzaep() {
    }

    public static Object zza(String str, Type type) {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzaer) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
                } catch (Exception e2) {
                    throw new zzaci(c.t("Json conversion failed! ", e2.getMessage()), e2);
                }
            } catch (Exception e10) {
                throw new zzaci("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e10);
            }
        }
        try {
            zzagl zzaglVar = (zzagl) new zzagl().zza(str);
            if (zzaglVar.zzb()) {
                return zzaglVar.zza();
            }
            throw new zzaci("No error message: " + str);
        } catch (Exception e11) {
            throw new zzaci(c.t("Json conversion failed! ", e11.getMessage()), e11);
        }
    }
}
