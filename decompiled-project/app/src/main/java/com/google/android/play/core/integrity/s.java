package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f15681a = this;

    /* renamed from: b, reason: collision with root package name */
    private final J6.i f15682b;

    /* renamed from: c, reason: collision with root package name */
    private final J6.i f15683c;

    /* renamed from: d, reason: collision with root package name */
    private final J6.i f15684d;

    /* renamed from: e, reason: collision with root package name */
    private final J6.i f15685e;

    /* renamed from: f, reason: collision with root package name */
    private final J6.i f15686f;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        E3.e eVar = new E3.e(context, 3);
        this.f15682b = eVar;
        adVar = ac.f15572a;
        J6.g b2 = J6.g.b(adVar);
        this.f15683c = b2;
        mVar = l.f15674a;
        au auVar = new au(eVar, mVar);
        this.f15684d = auVar;
        mVar2 = l.f15674a;
        J6.g b10 = J6.g.b(new al(eVar, b2, auVar, mVar2));
        this.f15685e = b10;
        this.f15686f = J6.g.b(new ab(b10));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f15686f.a();
    }
}
