package Q1;

import Eb.B;
import Eb.v;
import M1.C0390e;
import M1.Q;
import androidx.datastore.preferences.protobuf.AbstractC0817u;
import androidx.datastore.preferences.protobuf.AbstractC0819w;
import androidx.datastore.preferences.protobuf.C0804g;
import androidx.datastore.preferences.protobuf.C0808k;
import androidx.datastore.preferences.protobuf.C0821y;
import androidx.datastore.preferences.protobuf.InterfaceC0818v;
import cc.F;
import cc.F0;
import cc.P;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kc.ExecutorC1440c;
import kotlin.jvm.internal.l;
import rc.A;
import rc.C;
import rc.C1963g;
import rc.o;
import t8.C2034c;
import y7.u0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f8611a = new Object();

    public static d a(C2034c c2034c, Rb.a aVar) {
        v vVar = v.f3891a;
        ExecutorC1440c executorC1440c = P.f14500c;
        F0 d10 = F.d();
        executorC1440c.getClass();
        return new d(new d(new Q(new O1.f(o.f23980a, new e(0, aVar)), u0.x(new C0390e(vVar, null)), c2034c, F.b(E6.b.w(executorC1440c, d10)))));
    }

    public b b(C c10) {
        byte[] bArr;
        try {
            P1.c q10 = P1.c.q(new C1963g(c10, 1));
            b bVar = new b(false);
            h[] pairs = (h[]) Arrays.copyOf(new h[0], 0);
            l.e(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                h hVar = pairs[0];
                throw null;
            }
            Map o10 = q10.o();
            l.d(o10, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o10.entrySet()) {
                String name = (String) entry.getKey();
                P1.g value = (P1.g) entry.getValue();
                l.d(name, "name");
                l.d(value, "value");
                int E10 = value.E();
                switch (E10 == 0 ? -1 : j.f8616a[P.c.b(E10)]) {
                    case -1:
                        throw new IOException("Value case is null.", null);
                    case 0:
                    default:
                        throw new Db.d(1);
                    case 1:
                        bVar.d(new g(name), Boolean.valueOf(value.v()));
                        break;
                    case 2:
                        bVar.d(new g(name), Float.valueOf(value.z()));
                        break;
                    case 3:
                        bVar.d(new g(name), Double.valueOf(value.y()));
                        break;
                    case 4:
                        bVar.d(new g(name), Integer.valueOf(value.A()));
                        break;
                    case 5:
                        bVar.d(new g(name), Long.valueOf(value.B()));
                        break;
                    case 6:
                        g gVar = new g(name);
                        String C2 = value.C();
                        l.d(C2, "value.string");
                        bVar.d(gVar, C2);
                        break;
                    case 7:
                        g gVar2 = new g(name);
                        InterfaceC0818v p10 = value.D().p();
                        l.d(p10, "value.stringSet.stringsList");
                        bVar.d(gVar2, Eb.o.w0(p10));
                        break;
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        g gVar3 = new g(name);
                        C0804g w10 = value.w();
                        int size = w10.size();
                        if (size == 0) {
                            bArr = AbstractC0819w.f13468b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w10.t(size, bArr2);
                            bArr = bArr2;
                        }
                        l.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(gVar3, bArr);
                        break;
                    case 9:
                        throw new IOException("Value not set.", null);
                }
            }
            return new b(B.M(bVar.a()), true);
        } catch (C0821y e2) {
            throw new IOException("Unable to parse preferences proto.", e2);
        }
    }

    public void c(Object obj, rc.B b2) {
        AbstractC0817u a9;
        Map a10 = ((b) obj).a();
        P1.a p10 = P1.c.p();
        for (Map.Entry entry : a10.entrySet()) {
            g gVar = (g) entry.getKey();
            Object value = entry.getValue();
            String str = gVar.f8612a;
            if (value instanceof Boolean) {
                P1.f F10 = P1.g.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F10.c();
                P1.g.s((P1.g) F10.f13456b, booleanValue);
                a9 = F10.a();
            } else if (value instanceof Float) {
                P1.f F11 = P1.g.F();
                float floatValue = ((Number) value).floatValue();
                F11.c();
                P1.g.t((P1.g) F11.f13456b, floatValue);
                a9 = F11.a();
            } else if (value instanceof Double) {
                P1.f F12 = P1.g.F();
                double doubleValue = ((Number) value).doubleValue();
                F12.c();
                P1.g.q((P1.g) F12.f13456b, doubleValue);
                a9 = F12.a();
            } else if (value instanceof Integer) {
                P1.f F13 = P1.g.F();
                int intValue = ((Number) value).intValue();
                F13.c();
                P1.g.u((P1.g) F13.f13456b, intValue);
                a9 = F13.a();
            } else if (value instanceof Long) {
                P1.f F14 = P1.g.F();
                long longValue = ((Number) value).longValue();
                F14.c();
                P1.g.n((P1.g) F14.f13456b, longValue);
                a9 = F14.a();
            } else if (value instanceof String) {
                P1.f F15 = P1.g.F();
                F15.c();
                P1.g.o((P1.g) F15.f13456b, (String) value);
                a9 = F15.a();
            } else if (value instanceof Set) {
                P1.f F16 = P1.g.F();
                P1.d q10 = P1.e.q();
                l.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q10.c();
                P1.e.n((P1.e) q10.f13456b, (Set) value);
                F16.c();
                P1.g.p((P1.g) F16.f13456b, (P1.e) q10.a());
                a9 = F16.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                P1.f F17 = P1.g.F();
                byte[] bArr = (byte[]) value;
                C0804g c0804g = C0804g.f13396c;
                C0804g o10 = C0804g.o(0, bArr, bArr.length);
                F17.c();
                P1.g.r((P1.g) F17.f13456b, o10);
                a9 = F17.a();
            }
            p10.getClass();
            p10.c();
            P1.c.n((P1.c) p10.f13456b).put(str, (P1.g) a9);
        }
        P1.c cVar = (P1.c) p10.a();
        A a11 = new A(b2);
        int a12 = cVar.a(null);
        Logger logger = C0808k.g;
        if (a12 > 4096) {
            a12 = 4096;
        }
        C0808k c0808k = new C0808k(a11, a12);
        cVar.b(c0808k);
        if (c0808k.f13429e > 0) {
            c0808k.m0();
        }
    }
}
