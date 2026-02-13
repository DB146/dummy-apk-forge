package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0963d extends BasePendingResult implements InterfaceC0964e {
    private final com.google.android.gms.common.api.i api;
    private final com.google.android.gms.common.api.c clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0963d(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.o oVar) {
        super(oVar);
        com.google.android.gms.common.internal.G.h(oVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.G.h(iVar, "Api must not be null");
        this.clientKey = iVar.f14903b;
        this.api = iVar;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar);

    public final com.google.android.gms.common.api.i getApi() {
        return this.api;
    }

    public final com.google.android.gms.common.api.c getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.r rVar) {
    }

    public final void run(com.google.android.gms.common.api.b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e2) {
            setFailedResult(new Status(8, e2.getLocalizedMessage(), null, null));
            throw e2;
        } catch (RemoteException e10) {
            setFailedResult(new Status(8, e10.getLocalizedMessage(), null, null));
        }
    }

    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.G.a("Failed result must not be success", !status.t());
        com.google.android.gms.common.api.r createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        onSetFailedResult(createFailedResult);
    }
}
