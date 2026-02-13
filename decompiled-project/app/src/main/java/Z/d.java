package Z;

import E.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u.C2046I;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public static final d f12080b = new d(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f12081c = new d(2, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12082a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i10) {
        super(i7);
        this.f12082a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        j jVar;
        switch (this.f12082a) {
            case 0:
                g gVar = (g) obj2;
                C2046I c2046i = gVar.f12092b;
                Object[] objArr = c2046i.f24604b;
                Object[] objArr2 = c2046i.f24605c;
                long[] jArr = c2046i.f24603a;
                int length = jArr.length - 2;
                Map map = gVar.f12091a;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j) < 128) {
                                    int i12 = (i7 << 3) + i11;
                                    Object obj3 = objArr[i12];
                                    Map c10 = ((j) objArr2[i12]).c();
                                    if (c10.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, c10);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i10 != 8) {
                            }
                        }
                        if (i7 != length) {
                            i7++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 1:
                return obj2;
            default:
                b bVar = (b) obj;
                List list = (List) v.f3503a.invoke(bVar, obj2);
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Object obj4 = list.get(i13);
                    if (obj4 != null && (jVar = bVar.f12074b) != null && !jVar.b(obj4)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
        }
    }
}
