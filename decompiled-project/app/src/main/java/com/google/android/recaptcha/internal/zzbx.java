package com.google.android.recaptcha.internal;

import Hb.g;
import cc.C0953t;
import cc.F;
import cc.I;
import cc.InterfaceC0952s;
import cc.w0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class zzbx {
    public static final I zza(Task task) {
        final C0953t a9 = F.a();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                g gVar = InterfaceC0952s.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((C0953t) gVar).W(exception);
                } else if (task2.isCanceled()) {
                    ((w0) gVar).cancel(null);
                } else {
                    ((C0953t) gVar).J(task2.getResult());
                }
            }
        });
        return new zzbw(a9);
    }
}
