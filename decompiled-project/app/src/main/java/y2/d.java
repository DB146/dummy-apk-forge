package y2;

import Db.q;
import Eb.l;
import kotlin.jvm.internal.r;
import v2.C2133e;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f26758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f26760c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f26762e;

    public /* synthetic */ d(r rVar, r rVar2, f fVar, boolean z8, l lVar) {
        this.f26758a = rVar;
        this.f26759b = rVar2;
        this.f26760c = fVar;
        this.f26761d = z8;
        this.f26762e = lVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        C2133e entry = (C2133e) obj;
        kotlin.jvm.internal.l.e(entry, "entry");
        this.f26758a.f19130a = true;
        this.f26759b.f19130a = true;
        this.f26760c.l(entry, this.f26761d, this.f26762e);
        return q.f3365a;
    }
}
