package com.google.android.gms.internal.p002firebaseauthapi;

import I5.a;
import X.c;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzafw implements OnFailureListener {
    public zzafw(zzafu zzafuVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        a aVar;
        aVar = zzafu.zza;
        aVar.c(c.t("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
