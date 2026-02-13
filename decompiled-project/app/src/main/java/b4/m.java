package b4;

import Y5.C0656w;
import Y5.J0;
import d4.InterfaceC1049b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class m implements InterfaceC1049b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13871a;

    public /* synthetic */ m(int i7) {
        this.f13871a = i7;
    }

    @Override // Cb.a
    public final Object get() {
        switch (this.f13871a) {
            case 0:
                return new J0(Executors.newSingleThreadExecutor(), 1);
            default:
                C0656w c0656w = new C0656w(12);
                HashMap hashMap = new HashMap();
                Y3.d dVar = Y3.d.f11149a;
                Set emptySet = Collections.emptySet();
                if (emptySet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(dVar, new h4.c(30000L, 86400000L, emptySet));
                Y3.d dVar2 = Y3.d.f11151c;
                Set emptySet2 = Collections.emptySet();
                if (emptySet2 == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(dVar2, new h4.c(1000L, 86400000L, emptySet2));
                Y3.d dVar3 = Y3.d.f11150b;
                if (Collections.emptySet() == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(h4.e.f17735b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(dVar3, new h4.c(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < Y3.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new h4.b(c0656w, hashMap);
        }
    }
}
