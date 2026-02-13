package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f15688a = this;

    /* renamed from: b, reason: collision with root package name */
    private final J6.i f15689b;

    /* renamed from: c, reason: collision with root package name */
    private final J6.i f15690c;

    /* renamed from: d, reason: collision with root package name */
    private final J6.i f15691d;

    /* renamed from: e, reason: collision with root package name */
    private final J6.i f15692e;

    /* renamed from: f, reason: collision with root package name */
    private final J6.i f15693f;
    private final J6.i g;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        E3.e eVar = new E3.e(context, 3);
        this.f15689b = eVar;
        bcVar = bb.f15625a;
        J6.g b2 = J6.g.b(bcVar);
        this.f15690c = b2;
        oVar = n.f15679a;
        au auVar = new au(eVar, oVar);
        this.f15691d = auVar;
        oVar2 = n.f15679a;
        J6.g b10 = J6.g.b(new bp(eVar, b2, auVar, oVar2));
        this.f15692e = b10;
        J6.g b11 = J6.g.b(new bu(b10));
        this.f15693f = b11;
        this.g = J6.g.b(new ba(b10, b11));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.g.a();
    }
}
