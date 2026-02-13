package H2;

import android.view.View;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4602a;

    /* renamed from: b, reason: collision with root package name */
    public int f4603b;

    /* renamed from: c, reason: collision with root package name */
    public int f4604c;

    public /* synthetic */ O(int i7) {
        this.f4602a = i7;
    }

    public /* synthetic */ O(int i7, int i10, int i11) {
        this.f4602a = i11;
        this.f4603b = i7;
        this.f4604c = i10;
    }

    public int a() {
        int i7 = this.f4604c;
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 5) {
            return 11;
        }
        if (i7 == 29) {
            return 12;
        }
        if (i7 == 42) {
            return 16;
        }
        if (i7 != 22) {
            return i7 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(i0 i0Var) {
        View view = i0Var.f4707a;
        this.f4603b = view.getLeft();
        this.f4604c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public P8.p c() {
        return new P8.p(this.f4603b, this.f4604c);
    }

    public String toString() {
        switch (this.f4602a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("<");
                sb2.append(this.f4603b);
                sb2.append(' ');
                return X.c.k(sb2, this.f4604c, '>');
            default:
                return super.toString();
        }
    }
}
