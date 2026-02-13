package T4;

import yc.C2480b;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9317c;

    public /* synthetic */ u(int i7, String str, String str2) {
        this.f9315a = i7;
        this.f9316b = str;
        this.f9317c = str2;
    }

    public u(C2480b c2480b, String str) {
        this.f9315a = 2;
        c2480b.getClass();
        this.f9316b = c2480b.i0();
        this.f9317c = str;
    }

    public u(C2480b c2480b, String str, Object[] objArr) {
        this.f9315a = 2;
        c2480b.getClass();
        this.f9316b = c2480b.i0();
        this.f9317c = String.format(str, objArr);
    }

    public String toString() {
        switch (this.f9315a) {
            case 0:
                return this.f9316b + ", " + this.f9317c;
            case 1:
            default:
                return super.toString();
            case 2:
                return "<" + this.f9316b + ">: " + this.f9317c;
        }
    }
}
