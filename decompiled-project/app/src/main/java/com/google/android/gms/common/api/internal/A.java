package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14905a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14906b;

    public A() {
        this.f14905a = Collections.synchronizedMap(new WeakHashMap());
        this.f14906b = Collections.synchronizedMap(new WeakHashMap());
    }

    public /* synthetic */ A(Object obj, Object obj2) {
        this.f14906b = obj;
        this.f14905a = obj2;
    }

    public void a(Status status, boolean z8) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f14905a)) {
            hashMap = new HashMap((Map) this.f14905a);
        }
        synchronized (((Map) this.f14906b)) {
            hashMap2 = new HashMap((Map) this.f14906b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z8 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z8 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((A) this.f14906b).f14906b).remove((TaskCompletionSource) this.f14905a);
    }
}
