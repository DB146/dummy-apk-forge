package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ai extends J6.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f15585a;

    /* renamed from: b, reason: collision with root package name */
    private final J6.y f15586b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f15587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f15585a = ajVar;
        this.f15586b = new J6.y("OnRequestIntegrityTokenCallback");
        this.f15587c = taskCompletionSource;
    }

    @Override // J6.v
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.f15585a.f15588a.d(this.f15587c);
        this.f15586b.b("onRequestIntegrityToken", new Object[0]);
        kVar = this.f15585a.f15592e;
        com.google.android.gms.common.api.j a9 = kVar.a(bundle);
        if (a9 != null) {
            this.f15587c.trySetException(a9);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f15587c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.f15585a.f15590c;
        ah ahVar = new ah(this, str, j);
        TaskCompletionSource taskCompletionSource = this.f15587c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
