package okhttp3.internal.http2;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class Settings {

    /* renamed from: a, reason: collision with root package name */
    public int f22857a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f22858b = new int[10];

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public final int a() {
        if ((this.f22857a & 16) != 0) {
            return this.f22858b[4];
        }
        return 65535;
    }

    public final void b(Settings other) {
        l.e(other, "other");
        for (int i7 = 0; i7 < 10; i7++) {
            if (((1 << i7) & other.f22857a) != 0) {
                c(i7, other.f22858b[i7]);
            }
        }
    }

    public final void c(int i7, int i10) {
        if (i7 >= 0) {
            int[] iArr = this.f22858b;
            if (i7 >= iArr.length) {
                return;
            }
            this.f22857a = (1 << i7) | this.f22857a;
            iArr[i7] = i10;
        }
    }
}
