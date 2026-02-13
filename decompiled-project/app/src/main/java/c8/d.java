package c8;

import a8.InterfaceC0787d;
import a8.InterfaceC0789f;
import a8.InterfaceC0790g;
import b8.InterfaceC0847a;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements InterfaceC0847a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f14444f;
    public static final b g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14446a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14447b;

    /* renamed from: c, reason: collision with root package name */
    public final C0915a f14448c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14449d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0915a f14443e = new C0915a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f14445h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [c8.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [c8.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [c8.c, java.lang.Object] */
    static {
        final int i7 = 0;
        f14444f = new InterfaceC0789f() { // from class: c8.b
            @Override // a8.InterfaceC0784a
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        ((InterfaceC0790g) obj2).d((String) obj);
                        return;
                    default:
                        ((InterfaceC0790g) obj2).e(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i10 = 1;
        g = new InterfaceC0789f() { // from class: c8.b
            @Override // a8.InterfaceC0784a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((InterfaceC0790g) obj2).d((String) obj);
                        return;
                    default:
                        ((InterfaceC0790g) obj2).e(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f14446a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f14447b = hashMap2;
        this.f14448c = f14443e;
        this.f14449d = false;
        hashMap2.put(String.class, f14444f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f14445h);
        hashMap.remove(Date.class);
    }

    public final InterfaceC0847a a(Class cls, InterfaceC0787d interfaceC0787d) {
        this.f14446a.put(cls, interfaceC0787d);
        this.f14447b.remove(cls);
        return this;
    }
}
