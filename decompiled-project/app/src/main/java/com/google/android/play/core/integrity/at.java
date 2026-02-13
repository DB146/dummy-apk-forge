package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    private final J6.i f15612a;

    /* renamed from: b, reason: collision with root package name */
    private final J6.i f15613b;

    public at(J6.i iVar, J6.i iVar2) {
        this.f15612a = iVar;
        this.f15613b = iVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, J6.d dVar) {
        Object a9 = this.f15612a.a();
        a9.getClass();
        k kVar = (k) this.f15613b.a();
        kVar.getClass();
        activity.getClass();
        dVar.getClass();
        return new as((Context) a9, kVar, activity, taskCompletionSource, dVar);
    }
}
