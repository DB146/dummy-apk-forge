package G4;

import F4.c;
import Q5.e;
import b5.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import n5.v;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4352d;

    public static H4.a W(v vVar) {
        String q10 = vVar.q();
        q10.getClass();
        String q11 = vVar.q();
        q11.getClass();
        return new H4.a(q10, q11, vVar.p(), vVar.p(), Arrays.copyOfRange(vVar.f21229a, vVar.f21230b, vVar.f21231c));
    }

    @Override // Q5.e
    public final c u(F4.e eVar, ByteBuffer byteBuffer) {
        switch (this.f4352d) {
            case 0:
                if (byteBuffer.get() == 116) {
                    f fVar = new f(byteBuffer.array(), byteBuffer.limit());
                    int i7 = 12;
                    fVar.s(12);
                    int f4 = (fVar.f() + fVar.i(12)) - 4;
                    fVar.s(44);
                    fVar.t(fVar.i(12));
                    fVar.s(16);
                    ArrayList arrayList = new ArrayList();
                    while (fVar.f() < f4) {
                        fVar.s(48);
                        int i10 = fVar.i(8);
                        fVar.s(4);
                        int f10 = fVar.f() + fVar.i(i7);
                        String str = null;
                        String str2 = null;
                        while (fVar.f() < f10) {
                            int i11 = fVar.i(8);
                            int i12 = fVar.i(8);
                            int f11 = fVar.f() + i12;
                            if (i11 == 2) {
                                int i13 = fVar.i(16);
                                fVar.s(8);
                                if (i13 == 3) {
                                    while (fVar.f() < f11) {
                                        int i14 = fVar.i(8);
                                        Charset charset = M6.e.f6797a;
                                        byte[] bArr = new byte[i14];
                                        fVar.k(i14, bArr);
                                        String str3 = new String(bArr, charset);
                                        int i15 = fVar.i(8);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            fVar.t(fVar.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i11 == 21) {
                                Charset charset2 = M6.e.f6797a;
                                byte[] bArr2 = new byte[i12];
                                fVar.k(i12, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            fVar.p(f11 * 8);
                        }
                        fVar.p(f10 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new a(i10, str.concat(str2)));
                        }
                        i7 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new c(arrayList);
                    }
                }
                return null;
            default:
                return new c(W(new v(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
