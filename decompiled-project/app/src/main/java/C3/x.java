package C3;

import L7.C0385e;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class x implements O7.f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2640a;

    public x(int i7) {
        switch (i7) {
            case 1:
                this.f2640a = new HashMap();
                return;
            case 2:
            default:
                this.f2640a = new HashMap();
                new HashMap();
                return;
            case 3:
                this.f2640a = new HashMap();
                return;
        }
    }

    public x(HashMap hashMap) {
        this.f2640a = hashMap;
    }

    @Override // O7.f
    public Object l(C0385e c0385e, Object obj, Object obj2) {
        T7.s sVar = (T7.s) obj;
        String str = "/";
        if (!c0385e.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            int i7 = c0385e.f6339b;
            for (int i10 = i7; i10 < c0385e.f6340c; i10++) {
                if (i10 > i7) {
                    sb2.append("/");
                }
                sb2.append(c0385e.f6338a[i10].f9331a);
            }
            str = sb2.toString();
        }
        this.f2640a.put(str, sVar.x(true));
        return null;
    }
}
