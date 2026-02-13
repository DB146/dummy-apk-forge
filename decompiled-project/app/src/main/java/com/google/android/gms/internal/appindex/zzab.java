package com.google.android.gms.internal.appindex;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import s5.InterfaceC1990a;
import s5.f;

/* loaded from: classes.dex */
public final class zzab extends f {
    private final zzz zza;

    public zzab(Context context) {
        this.zza = new zzz(context);
    }

    private final Task zza(InterfaceC1990a interfaceC1990a) {
        zzk[] zzkVarArr = new zzk[1];
        if (interfaceC1990a != null) {
            if (!(interfaceC1990a instanceof zzk)) {
                return Tasks.forException(new Exception("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects."));
            }
            zzkVarArr[0] = (zzk) interfaceC1990a;
        }
        return this.zza.doWrite(new zzx(this, zzkVarArr));
    }

    @Override // s5.f
    public final Task<Void> end(InterfaceC1990a interfaceC1990a) {
        return zza(interfaceC1990a);
    }

    public final Task<Void> start(InterfaceC1990a interfaceC1990a) {
        return zza(interfaceC1990a);
    }
}
