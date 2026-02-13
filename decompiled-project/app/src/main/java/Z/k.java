package Z;

import Eb.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u.C2046I;
import u.Q;
import y7.u0;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f12098a;

    /* renamed from: b, reason: collision with root package name */
    public final C2046I f12099b;

    /* renamed from: c, reason: collision with root package name */
    public C2046I f12100c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Map map, Rb.c cVar) {
        C2046I c2046i;
        this.f12098a = (kotlin.jvm.internal.m) cVar;
        if (map == null || map.isEmpty()) {
            c2046i = null;
        } else {
            c2046i = new C2046I(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c2046i.l(entry.getKey(), entry.getValue());
            }
        }
        this.f12099b = c2046i;
    }

    @Override // Z.j
    public final i a(String str, Rb.a aVar) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!com.bumptech.glide.c.J(str.charAt(i7))) {
                C2046I c2046i = this.f12100c;
                if (c2046i == null) {
                    long[] jArr = Q.f24633a;
                    c2046i = new C2046I();
                    this.f12100c = c2046i;
                }
                Object g = c2046i.g(str);
                if (g == null) {
                    g = new ArrayList();
                    c2046i.l(str, g);
                }
                ((List) g).add(aVar);
                return new Q7.h(c2046i, str, aVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Rb.c, kotlin.jvm.internal.m] */
    @Override // Z.j
    public final boolean b(Object obj) {
        return ((Boolean) this.f12098a.invoke(obj)).booleanValue();
    }

    @Override // Z.j
    public final Map c() {
        long[] jArr;
        int i7;
        long[] jArr2;
        int i10;
        C2046I c2046i = this.f12099b;
        if (c2046i == null && this.f12100c == null) {
            return w.f3892a;
        }
        int i11 = c2046i != null ? c2046i.f24607e : 0;
        C2046I c2046i2 = this.f12100c;
        HashMap hashMap = new HashMap(i11 + (c2046i2 != null ? c2046i2.f24607e : 0));
        char c10 = 7;
        long j = -9187201950435737472L;
        int i12 = 8;
        if (c2046i != null) {
            Object[] objArr = c2046i.f24604b;
            Object[] objArr2 = c2046i.f24605c;
            long[] jArr3 = c2046i.f24603a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j10 = jArr3[i13];
                    if ((((~j10) << 7) & j10 & j) != j) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((j10 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                hashMap.put((String) objArr[i16], (List) objArr2[i16]);
                            }
                            j10 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    j = -9187201950435737472L;
                }
            }
        }
        C2046I c2046i3 = this.f12100c;
        if (c2046i3 != null) {
            Object[] objArr3 = c2046i3.f24604b;
            Object[] objArr4 = c2046i3.f24605c;
            long[] jArr4 = c2046i3.f24603a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                while (true) {
                    long j11 = jArr4[i17];
                    if ((((~j11) << c10) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j11 & 255) < 128) {
                                int i20 = (i17 << 3) + i19;
                                Object obj = objArr3[i20];
                                List list = (List) objArr4[i20];
                                String str = (String) obj;
                                if (list.size() == 1) {
                                    Object invoke = ((Rb.a) list.get(0)).invoke();
                                    if (invoke != null) {
                                        if (!b(invoke)) {
                                            throw new IllegalStateException(c2.i.o(invoke).toString());
                                        }
                                        hashMap.put(str, u0.f(invoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    int i21 = 0;
                                    while (i21 < size) {
                                        long[] jArr5 = jArr4;
                                        Object invoke2 = ((Rb.a) list.get(i21)).invoke();
                                        if (invoke2 != null && !b(invoke2)) {
                                            throw new IllegalStateException(c2.i.o(invoke2).toString());
                                        }
                                        arrayList.add(invoke2);
                                        i21++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    hashMap.put(str, arrayList);
                                }
                                i10 = 8;
                            } else {
                                jArr2 = jArr4;
                                i10 = i12;
                            }
                            j11 >>= i10;
                            i19++;
                            i12 = i10;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        i7 = i12;
                        if (i18 != i7) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i7 = i12;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i12 = i7;
                    jArr4 = jArr;
                    c10 = 7;
                }
            }
        }
        return hashMap;
    }

    @Override // Z.j
    public final Object e(String str) {
        C2046I c2046i = this.f12099b;
        List list = c2046i != null ? (List) c2046i.j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c2046i != null) {
            List subList = list.subList(1, list.size());
            int f4 = c2046i.f(str);
            if (f4 < 0) {
                f4 = ~f4;
            }
            Object[] objArr = c2046i.f24605c;
            Object obj = objArr[f4];
            c2046i.f24604b[f4] = str;
            objArr[f4] = subList;
        }
        return list.get(0);
    }
}
