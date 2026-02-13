package H2;

import android.text.TextUtils;
import n5.AbstractC1705a;
import y7.u0;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4792a;

    /* renamed from: b, reason: collision with root package name */
    public int f4793b;

    /* renamed from: c, reason: collision with root package name */
    public int f4794c;

    /* renamed from: d, reason: collision with root package name */
    public int f4795d;

    /* renamed from: e, reason: collision with root package name */
    public int f4796e;

    /* renamed from: f, reason: collision with root package name */
    public int f4797f;

    public /* synthetic */ r0() {
        this.f4792a = 0;
    }

    public r0(int i7, int i10, int i11, int i12, int i13) {
        this.f4792a = 1;
        this.f4793b = i7;
        this.f4794c = i10;
        this.f4795d = i11;
        this.f4796e = i12;
        this.f4797f = i13;
    }

    public r0(int i7, int i10, int i11, int i12, int i13, byte b2) {
        this.f4792a = i13;
        switch (i13) {
            case 3:
                this.f4797f = -1;
                this.f4793b = i7;
                this.f4794c = i10;
                this.f4795d = i11;
                this.f4796e = i12;
                return;
            default:
                this.f4793b = i7;
                this.f4794c = i12;
                this.f4795d = i10;
                this.f4796e = i11;
                this.f4797f = i10 + i11;
                return;
        }
    }

    public static r0 b(String str) {
        char c10;
        AbstractC1705a.h(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < split.length; i13++) {
            String N10 = u0.N(split[i13].trim());
            N10.getClass();
            switch (N10.hashCode()) {
                case 100571:
                    if (N10.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (N10.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (N10.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (N10.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i10 = i13;
                    break;
                case 1:
                    i12 = i13;
                    break;
                case 2:
                    i7 = i13;
                    break;
                case 3:
                    i11 = i13;
                    break;
            }
        }
        if (i7 == -1 || i10 == -1 || i12 == -1) {
            return null;
        }
        return new r0(i7, i10, i11, i12, split.length);
    }

    public boolean a() {
        int i7 = this.f4793b;
        int i10 = 2;
        if ((i7 & 7) != 0) {
            int i11 = this.f4796e;
            int i12 = this.f4794c;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 112) != 0) {
            int i13 = this.f4796e;
            int i14 = this.f4795d;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 1792) != 0) {
            int i15 = this.f4797f;
            int i16 = this.f4794c;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 28672) != 0) {
            int i17 = this.f4797f;
            int i18 = this.f4795d;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i7 & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean c(int i7) {
        if (i7 != -1) {
            if (this.f4795d == (i7 % 3) * 3) {
                return true;
            }
        }
        return false;
    }

    public void d() {
        this.f4797f = (this.f4795d / 3) + ((this.f4796e / 30) * 3);
    }

    public String toString() {
        switch (this.f4792a) {
            case 3:
                return this.f4797f + "|" + this.f4796e;
            default:
                return super.toString();
        }
    }
}
