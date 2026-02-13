package o9;

import V8.f;
import l2.X;
import m9.EnumC1647d;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1647d f22140a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22141b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22142c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f22144e;

    public e(X x2, EnumC1647d enumC1647d, int i7, int i10, int i11) {
        this.f22144e = x2;
        this.f22140a = enumC1647d;
        this.f22141b = i7;
        this.f22142c = i10;
        this.f22143d = i11;
    }

    public final int a() {
        EnumC1647d enumC1647d = EnumC1647d.BYTE;
        EnumC1647d enumC1647d2 = this.f22140a;
        int i7 = this.f22143d;
        if (enumC1647d2 != enumC1647d) {
            return i7;
        }
        R7.c cVar = (R7.c) this.f22144e.f19196d;
        f fVar = (f) cVar.f8934e;
        int i10 = this.f22141b;
        return ((String) cVar.f8933d).substring(i10, i7 + i10).getBytes(fVar.f10215a[this.f22142c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        EnumC1647d enumC1647d = this.f22140a;
        sb2.append(enumC1647d);
        sb2.append('(');
        EnumC1647d enumC1647d2 = EnumC1647d.ECI;
        X x2 = this.f22144e;
        if (enumC1647d == enumC1647d2) {
            sb2.append(((f) ((R7.c) x2.f19196d).f8934e).f10215a[this.f22142c].charset().displayName());
        } else {
            String str = (String) ((R7.c) x2.f19196d).f8933d;
            int i7 = this.f22141b;
            String substring = str.substring(i7, this.f22143d + i7);
            StringBuilder sb3 = new StringBuilder();
            for (int i10 = 0; i10 < substring.length(); i10++) {
                if (substring.charAt(i10) < ' ' || substring.charAt(i10) > '~') {
                    sb3.append('.');
                } else {
                    sb3.append(substring.charAt(i10));
                }
            }
            sb2.append(sb3.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}
