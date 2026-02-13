package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbg extends i implements e {
    public zzbg(d dVar) {
        super(2, dVar);
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzbg(dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbg) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f5345a;
        c.c0(obj);
        Thread.currentThread().setPriority(8);
        return q.f3365a;
    }
}
