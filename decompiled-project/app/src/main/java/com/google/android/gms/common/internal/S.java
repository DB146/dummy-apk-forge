package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class S extends AbstractC0996l {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15048d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f15049e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzh f15050f;
    public final L5.a g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15051h;

    /* renamed from: i, reason: collision with root package name */
    public final long f15052i;

    public S(Context context, Looper looper) {
        Q q10 = new Q(this);
        this.f15049e = context.getApplicationContext();
        this.f15050f = new zzh(looper, q10);
        this.g = L5.a.b();
        this.f15051h = 5000L;
        this.f15052i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0996l
    public final F5.b b(O o10, K k, String str, Executor executor) {
        synchronized (this.f15048d) {
            try {
                P p10 = (P) this.f15048d.get(o10);
                F5.b bVar = null;
                if (executor == null) {
                    executor = null;
                }
                if (p10 == null) {
                    p10 = new P(this, o10);
                    p10.f15041a.put(k, k);
                    bVar = P.a(p10, str, executor);
                    this.f15048d.put(o10, p10);
                } else {
                    this.f15050f.removeMessages(0, o10);
                    if (p10.f15041a.containsKey(k)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(o10.toString()));
                    }
                    p10.f15041a.put(k, k);
                    int i7 = p10.f15042b;
                    if (i7 == 1) {
                        k.onServiceConnected(p10.f15046f, p10.f15044d);
                    } else if (i7 == 2) {
                        bVar = P.a(p10, str, executor);
                    }
                }
                if (p10.f15043c) {
                    return F5.b.f4086e;
                }
                if (bVar == null) {
                    bVar = new F5.b(-1);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
