package za;

import A9.AbstractC0132r2;
import A9.C0096i1;
import A9.N;
import Ba.s;
import Ca.m;
import W1.C;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.kt.apps.media.xemtv.beta.R;
import l1.AbstractC1449a;
import va.r;

/* renamed from: za.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2608g extends N {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28352a;

    /* renamed from: b, reason: collision with root package name */
    public final c2.h f28353b;

    public C2608g(Context context, c2.h hVar) {
        this.f28352a = context;
        this.f28353b = hVar;
    }

    @Override // A9.N
    public final C a(Object obj) {
        AbstractC0132r2 abstractC0132r2 = obj instanceof AbstractC0132r2 ? (AbstractC0132r2) obj : null;
        if (abstractC0132r2 == null) {
            throw new IllegalStateException("Null row id");
        }
        C0096i1 c0096i1 = abstractC0132r2.f1358a;
        long j = c0096i1 != null ? c0096i1.f1228b : -1L;
        String message = String.valueOf(j);
        kotlin.jvm.internal.l.e(message, "message");
        c2.h hVar = this.f28353b;
        hVar.g(null);
        Context context = this.f28352a;
        if (j == 10999) {
            hVar.g(AbstractC1449a.getDrawable(context, R.drawable.tv_bg));
            Aa.l lVar = Aa.l.f1523a;
            m mVar = new m();
            mVar.l0(com.bumptech.glide.c.f(new Db.j("extra:type", lVar)));
            return mVar;
        }
        if (j == 10998) {
            hVar.g(AbstractC1449a.getDrawable(context, R.drawable.bg_football));
            return new xa.d();
        }
        if (j == 10997) {
            hVar.g(AbstractC1449a.getDrawable(context, R.drawable.tv_bg));
            Aa.l lVar2 = Aa.l.f1525c;
            m mVar2 = new m();
            mVar2.l0(com.bumptech.glide.c.f(new Db.j("extra:type", lVar2)));
            return mVar2;
        }
        if (j == 10995) {
            hVar.g(AbstractC1449a.getDrawable(context, R.drawable.bg_football));
            return new r();
        }
        if (j == 10994) {
            hVar.g(new ColorDrawable(-16777216));
            return new s();
        }
        if (j == 10993) {
            hVar.g(AbstractC1449a.getDrawable(context, R.drawable.tv_bg));
            ya.j jVar = new ya.j();
            jVar.f27568q0 = new ya.c(1, jVar);
            return jVar;
        }
        if (j == 10996) {
            hVar.g(AbstractC1449a.getDrawable(context, R.drawable.tv_bg));
            return new r();
        }
        if (j == 10992) {
            hVar.g(AbstractC1449a.getDrawable(context, R.drawable.tv_bg));
            return new wa.c();
        }
        if (j == 1000) {
            return new Da.f();
        }
        try {
            hVar.g(AbstractC1449a.getDrawable(context, R.drawable.tv_bg));
            throw new IllegalStateException("Not support row");
        } catch (Exception unused) {
            throw new IllegalStateException("Not support row");
        }
    }
}
