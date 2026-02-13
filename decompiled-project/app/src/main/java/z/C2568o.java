package z;

import A0.C0005a;
import Q.C0487e0;

/* renamed from: z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2568o implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T6.a f28044a;

    public C2568o(T6.a aVar) {
        this.f28044a = aVar;
    }

    @Override // z.Z
    public final float a(float f4) {
        if (Float.isNaN(f4)) {
            return 0.0f;
        }
        T6.a aVar = this.f28044a;
        float floatValue = ((Number) ((C0005a) aVar.f9320a).invoke(Float.valueOf(f4))).floatValue();
        ((C0487e0) aVar.f9324e).setValue(Boolean.valueOf(floatValue > 0.0f));
        ((C0487e0) aVar.f9325f).setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
