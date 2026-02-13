package U4;

import F.C0257a;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.C1586o0;
import m4.K;
import n5.C1704A;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class v implements InterfaceC1982j {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f9683h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f9684a;

    /* renamed from: b, reason: collision with root package name */
    public final C1704A f9685b;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1984l f9687d;

    /* renamed from: f, reason: collision with root package name */
    public int f9689f;

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f9686c = new n5.v();

    /* renamed from: e, reason: collision with root package name */
    public byte[] f9688e = new byte[1024];

    public v(String str, C1704A c1704a) {
        this.f9684a = str;
        this.f9685b = c1704a;
    }

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        throw new IllegalStateException();
    }

    public final s4.v b(long j) {
        s4.v u3 = this.f9687d.u(0, 3);
        K k = new K();
        k.k = "text/vtt";
        k.f19978c = this.f9684a;
        k.f19987o = j;
        h3.o.w(k, u3);
        this.f9687d.f();
        return u3;
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        C1979g c1979g = (C1979g) interfaceC1983k;
        c1979g.x(this.f9688e, 0, 6, false);
        byte[] bArr = this.f9688e;
        n5.v vVar = this.f9686c;
        vVar.E(6, bArr);
        if (j5.j.a(vVar)) {
            return true;
        }
        c1979g.x(this.f9688e, 6, 3, false);
        vVar.E(9, this.f9688e);
        return j5.j.a(vVar);
    }

    @Override // s4.InterfaceC1982j
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        String i7;
        this.f9687d.getClass();
        int i10 = (int) ((C1979g) interfaceC1983k).f24054c;
        int i11 = this.f9689f;
        byte[] bArr = this.f9688e;
        if (i11 == bArr.length) {
            this.f9688e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f9688e;
        int i12 = this.f9689f;
        int D10 = ((C1979g) interfaceC1983k).D(bArr2, i12, bArr2.length - i12);
        if (D10 != -1) {
            int i13 = this.f9689f + D10;
            this.f9689f = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        n5.v vVar = new n5.v(this.f9688e);
        j5.j.d(vVar);
        String i14 = vVar.i(M6.e.f6799c);
        long j = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(i14)) {
                while (true) {
                    String i15 = vVar.i(M6.e.f6799c);
                    if (i15 == null) {
                        break;
                    }
                    if (j5.j.f18646a.matcher(i15).matches()) {
                        do {
                            i7 = vVar.i(M6.e.f6799c);
                            if (i7 != null) {
                            }
                        } while (!i7.isEmpty());
                    } else {
                        Matcher matcher2 = j5.h.f18640a.matcher(i15);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c10 = j5.j.c(group);
                long b2 = this.f9685b.b(((((j + c10) - j10) * 90000) / 1000000) % 8589934592L);
                s4.v b10 = b(b2 - c10);
                byte[] bArr3 = this.f9688e;
                int i16 = this.f9689f;
                n5.v vVar2 = this.f9686c;
                vVar2.E(i16, bArr3);
                b10.c(this.f9689f, vVar2);
                b10.e(b2, 1, this.f9689f, 0, null);
                return -1;
            }
            if (i14.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = g.matcher(i14);
                if (!matcher3.find()) {
                    throw C1586o0.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(i14), null);
                }
                Matcher matcher4 = f9683h.matcher(i14);
                if (!matcher4.find()) {
                    throw C1586o0.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(i14), null);
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j10 = j5.j.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                j = (Long.parseLong(group3) * 1000000) / 90000;
            }
            i14 = vVar.i(M6.e.f6799c);
        }
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f9687d = interfaceC1984l;
        interfaceC1984l.i(new C1986n(-9223372036854775807L));
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
