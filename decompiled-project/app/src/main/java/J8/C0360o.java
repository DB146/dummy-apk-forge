package J8;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: J8.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360o implements G8.A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5710b;

    public /* synthetic */ C0360o(Object obj, int i7) {
        this.f5709a = i7;
        this.f5710b = obj;
    }

    @Override // G8.A
    public final G8.z a(G8.m mVar, N8.a aVar) {
        switch (this.f5709a) {
            case 0:
                if (aVar.f7386a == Number.class) {
                    return (C0361p) this.f5710b;
                }
                return null;
            case 1:
                if (aVar.f7386a == Object.class) {
                    return new C0362q(mVar, (G8.x) this.f5710b);
                }
                return null;
            default:
                Class cls = aVar.f7386a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (Q) this.f5710b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f5709a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((Q) this.f5710b) + "]";
            default:
                return super.toString();
        }
    }
}
