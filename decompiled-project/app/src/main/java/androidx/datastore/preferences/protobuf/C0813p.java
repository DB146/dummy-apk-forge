package androidx.datastore.preferences.protobuf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13439c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y f13440a = Y.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f13441b;

    static {
        new C0813p(0);
    }

    public C0813p() {
    }

    public C0813p(int i7) {
        a();
        a();
    }

    public static void b(C0808k c0808k, r0 r0Var, int i7, Object obj) {
        if (r0Var == r0.f13450d) {
            c0808k.B0(i7, 3);
            ((AbstractC0798a) obj).b(c0808k);
            c0808k.B0(i7, 4);
            return;
        }
        c0808k.B0(i7, r0Var.f13454b);
        switch (r0Var.ordinal()) {
            case 0:
                c0808k.w0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c0808k.u0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                c0808k.F0(((Long) obj).longValue());
                return;
            case 3:
                c0808k.F0(((Long) obj).longValue());
                return;
            case 4:
                c0808k.y0(((Integer) obj).intValue());
                return;
            case 5:
                c0808k.w0(((Long) obj).longValue());
                return;
            case 6:
                c0808k.u0(((Integer) obj).intValue());
                return;
            case 7:
                c0808k.o0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0804g) {
                    c0808k.s0((C0804g) obj);
                    return;
                } else {
                    c0808k.A0((String) obj);
                    return;
                }
            case 9:
                ((AbstractC0798a) obj).b(c0808k);
                return;
            case 10:
                AbstractC0798a abstractC0798a = (AbstractC0798a) obj;
                c0808k.getClass();
                c0808k.D0(((AbstractC0817u) abstractC0798a).a(null));
                abstractC0798a.b(c0808k);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (obj instanceof C0804g) {
                    c0808k.s0((C0804g) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c0808k.D0(length);
                c0808k.p0(bArr, 0, length);
                return;
            case 12:
                c0808k.D0(((Integer) obj).intValue());
                return;
            case 13:
                c0808k.y0(((Integer) obj).intValue());
                return;
            case 14:
                c0808k.u0(((Integer) obj).intValue());
                return;
            case 15:
                c0808k.w0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0808k.D0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0808k.F0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        if (this.f13441b) {
            return;
        }
        Y y10 = this.f13440a;
        int size = y10.f13366a.size();
        for (int i7 = 0; i7 < size; i7++) {
            Map.Entry c10 = y10.c(i7);
            if (c10.getValue() instanceof AbstractC0817u) {
                AbstractC0817u abstractC0817u = (AbstractC0817u) c10.getValue();
                abstractC0817u.getClass();
                T t5 = T.f13352c;
                t5.getClass();
                t5.a(abstractC0817u.getClass()).a(abstractC0817u);
                abstractC0817u.j();
            }
        }
        if (!y10.f13368c) {
            if (y10.f13366a.size() > 0) {
                y10.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y10.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y10.f13368c) {
            y10.f13367b = y10.f13367b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y10.f13367b);
            y10.f13370e = y10.f13370e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y10.f13370e);
            y10.f13368c = true;
        }
        this.f13441b = true;
    }

    public final Object clone() {
        C0813p c0813p = new C0813p();
        Y y10 = this.f13440a;
        if (y10.f13366a.size() > 0) {
            Map.Entry c10 = y10.c(0);
            if (c10.getKey() != null) {
                throw new ClassCastException();
            }
            c10.getValue();
            throw null;
        }
        Iterator it = y10.d().iterator();
        if (!it.hasNext()) {
            return c0813p;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0813p) {
            return this.f13440a.equals(((C0813p) obj).f13440a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13440a.hashCode();
    }
}
