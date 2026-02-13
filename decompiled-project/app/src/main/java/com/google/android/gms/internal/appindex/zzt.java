package com.google.android.gms.internal.appindex;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.appindexing.internal.Thing;
import m7.f;
import s5.b;
import s5.e;

/* loaded from: classes.dex */
public final class zzt extends b {

    @VisibleForTesting
    final zzs zza;

    public zzt(Context context) {
        this.zza = new zzs(new zzm(context));
    }

    public final Task<Void> remove(String... strArr) {
        return this.zza.zzc(new f(3, null, strArr, null, null, null, null));
    }

    public final Task<Void> removeAll() {
        return this.zza.zzc(new f(4, null, null, null, null, null, null));
    }

    public final Task<Void> removeTypes(String... strArr) {
        return this.zza.zzc(new f(6, null, null, strArr, null, null, null));
    }

    @Override // s5.b
    public final Task<Void> update(e... eVarArr) {
        Thing[] thingArr;
        if (eVarArr == null) {
            thingArr = null;
        } else {
            try {
                int length = eVarArr.length;
                Thing[] thingArr2 = new Thing[length];
                System.arraycopy(eVarArr, 0, thingArr2, 0, length);
                thingArr = thingArr2;
            } catch (ArrayStoreException unused) {
                return Tasks.forException(new Exception("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
            }
        }
        if (thingArr == null) {
            return Tasks.forException(new Exception("Indexables cannot be null."));
        }
        return this.zza.zzc(new f(1, thingArr, null, null, null, null, null));
    }
}
