package androidx.datastore.preferences.protobuf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final F f13329a;

    public G(n0 n0Var, p0 p0Var, P1.g gVar) {
        this.f13329a = new F(n0Var, p0Var, gVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x010a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(F f4, Object obj, Object obj2) {
        int l02;
        int size;
        int j02;
        p0 p0Var;
        int size2;
        int j03;
        int i7 = 1;
        int i10 = C0813p.f13439c;
        int h02 = C0808k.h0(1);
        o0 o0Var = r0.f13450d;
        n0 n0Var = f4.f13326a;
        if (n0Var == o0Var) {
            h02 *= 2;
        }
        switch (n0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                l02 = 8;
                int i11 = l02 + h02;
                int h03 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                    h03 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i7 = 8;
                        return i7 + h03 + i11;
                    case 1:
                        ((Float) obj2).getClass();
                        i7 = 4;
                        return i7 + h03 + i11;
                    case 2:
                        i7 = C0808k.l0(((Long) obj2).longValue());
                        return i7 + h03 + i11;
                    case 3:
                        i7 = C0808k.l0(((Long) obj2).longValue());
                        return i7 + h03 + i11;
                    case 4:
                        i7 = C0808k.l0(((Integer) obj2).intValue());
                        return i7 + h03 + i11;
                    case 5:
                        ((Long) obj2).getClass();
                        i7 = 8;
                        return i7 + h03 + i11;
                    case 6:
                        ((Integer) obj2).getClass();
                        i7 = 4;
                        return i7 + h03 + i11;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i7 + h03 + i11;
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        if (!(obj2 instanceof C0804g)) {
                            i7 = C0808k.g0((String) obj2);
                            return i7 + h03 + i11;
                        }
                        size2 = ((C0804g) obj2).size();
                        j03 = C0808k.j0(size2);
                        i7 = j03 + size2;
                        return i7 + h03 + i11;
                    case 9:
                        i7 = ((AbstractC0817u) ((AbstractC0798a) obj2)).a(null);
                        return i7 + h03 + i11;
                    case 10:
                        size2 = ((AbstractC0817u) ((AbstractC0798a) obj2)).a(null);
                        j03 = C0808k.j0(size2);
                        i7 = j03 + size2;
                        return i7 + h03 + i11;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        if (obj2 instanceof C0804g) {
                            size2 = ((C0804g) obj2).size();
                            j03 = C0808k.j0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            j03 = C0808k.j0(size2);
                        }
                        i7 = j03 + size2;
                        return i7 + h03 + i11;
                    case 12:
                        i7 = C0808k.j0(((Integer) obj2).intValue());
                        return i7 + h03 + i11;
                    case 13:
                        i7 = C0808k.l0(((Integer) obj2).intValue());
                        return i7 + h03 + i11;
                    case 14:
                        ((Integer) obj2).getClass();
                        i7 = 4;
                        return i7 + h03 + i11;
                    case 15:
                        ((Long) obj2).getClass();
                        i7 = 8;
                        return i7 + h03 + i11;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i7 = C0808k.j0((intValue >> 31) ^ (intValue << 1));
                        return i7 + h03 + i11;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i7 = C0808k.l0((longValue >> 63) ^ (longValue << 1));
                        return i7 + h03 + i11;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                l02 = 4;
                int i112 = l02 + h02;
                int h032 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 2:
                l02 = C0808k.l0(((Long) obj).longValue());
                int i1122 = l02 + h02;
                int h0322 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 3:
                l02 = C0808k.l0(((Long) obj).longValue());
                int i11222 = l02 + h02;
                int h03222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 4:
                l02 = C0808k.l0(((Integer) obj).intValue());
                int i112222 = l02 + h02;
                int h032222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                l02 = 8;
                int i1122222 = l02 + h02;
                int h0322222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                l02 = 4;
                int i11222222 = l02 + h02;
                int h03222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                l02 = 1;
                int i112222222 = l02 + h02;
                int h032222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0804g) {
                    size = ((C0804g) obj).size();
                    j02 = C0808k.j0(size);
                    l02 = size + j02;
                    int i1122222222 = l02 + h02;
                    int h0322222222 = C0808k.h0(2);
                    p0Var = f4.f13327b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                } else {
                    l02 = C0808k.g0((String) obj);
                    int i11222222222 = l02 + h02;
                    int h03222222222 = C0808k.h0(2);
                    p0Var = f4.f13327b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                }
            case 9:
                l02 = ((AbstractC0817u) ((AbstractC0798a) obj)).a(null);
                int i112222222222 = l02 + h02;
                int h032222222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0817u) ((AbstractC0798a) obj)).a(null);
                j02 = C0808k.j0(size);
                l02 = size + j02;
                int i1122222222222 = l02 + h02;
                int h0322222222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (obj instanceof C0804g) {
                    size = ((C0804g) obj).size();
                    j02 = C0808k.j0(size);
                } else {
                    size = ((byte[]) obj).length;
                    j02 = C0808k.j0(size);
                }
                l02 = size + j02;
                int i11222222222222 = l02 + h02;
                int h03222222222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 12:
                l02 = C0808k.j0(((Integer) obj).intValue());
                int i112222222222222 = l02 + h02;
                int h032222222222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 13:
                l02 = C0808k.l0(((Integer) obj).intValue());
                int i1122222222222222 = l02 + h02;
                int h0322222222222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                l02 = 4;
                int i11222222222222222 = l02 + h02;
                int h03222222222222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                l02 = 8;
                int i112222222222222222 = l02 + h02;
                int h032222222222222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                l02 = C0808k.j0((intValue2 >> 31) ^ (intValue2 << 1));
                int i1122222222222222222 = l02 + h02;
                int h0322222222222222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                l02 = C0808k.l0((longValue2 >> 63) ^ (longValue2 << 1));
                int i11222222222222222222 = l02 + h02;
                int h03222222222222222222 = C0808k.h0(2);
                p0Var = f4.f13327b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
