package J8;

import java.lang.reflect.Field;

/* renamed from: J8.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364t extends AbstractC0363s {

    /* renamed from: b, reason: collision with root package name */
    public final I8.o f5724b;

    public C0364t(I8.o oVar, C0365u c0365u) {
        super(c0365u);
        this.f5724b = oVar;
    }

    @Override // J8.AbstractC0363s
    public final Object d() {
        return this.f5724b.h();
    }

    @Override // J8.AbstractC0363s
    public final Object e(Object obj) {
        return obj;
    }

    @Override // J8.AbstractC0363s
    public final void f(Object obj, O8.a aVar, r rVar) {
        Object b2 = rVar.f5721f.b(aVar);
        if (b2 == null && rVar.g) {
            return;
        }
        Field field = rVar.f5717b;
        if (rVar.f5722h) {
            throw new Db.d(X.c.t("Cannot set value of 'static final' ", L8.c.d(field, false)), 4);
        }
        field.set(obj, b2);
    }
}
